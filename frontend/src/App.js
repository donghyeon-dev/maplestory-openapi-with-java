import React, {useState, useEffect} from 'react';
import './index.css';
import axios from "axios";

function App() {
    const [characterName, setCharacterName] = useState("");
    const [characterData, setCharacterData] =
        useState({
            worldName: "",
            characterName: "",
            characterClass: "",
            characterClassLevel: "",
            characterLevel: 0,
            characterGuildName: "",
            characterImage: "https://placehold.co/100x100",
            combatPower: "",
            characterPopularity: "",
            stats:
                [

                ],
            // ... Add other data as needed
        });
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        // This is where you would fetch data from the server when the component mounts
    }, []);

    const formatStatValue = (statValue) => {
        //
        return statValue.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    };

    const onCharacterInputKeyPress = (e) => {
        if (e.key === 'Enter') {
            fetchCharacterData();
        }
    }

    const fetchCharacterData = async () => {
        if(characterName === "") {
            alert("Character Name is empty");
            return;

        }
        setLoading(true);
        axios.get("http://localhost:8080/character/overview?characterName="+ characterName)
            .then((response) => {
                console.log("Then Response :" + response);
                const data = response.data;
                characterData.characterLevel = data.characterBasic.characterLevel;
                characterData.worldName = data.characterBasic.worldName;
                characterData.characterClass = data.characterBasic.characterClass;
                characterData.characterClassLevel = data.characterBasic.characterClassLevel;
                characterData.characterGuildName = data.characterBasic.characterGuildName;
                characterData.characterImage = data.characterBasic.characterImage;
                characterData.combatPower = data.characterBasic.combatPower;
                characterData.characterPopularity = data.characterPopularity.popularity;
                characterData.stats = data.characterStat.finalStat;
                setLoading(false);
            })
            .catch((error) => {
                alert(error.response.data.message);
                console.log("Error : " + error);
                setLoading(false);
            });

    }


    return (
        <div className="bg-[#31314e] min-h-screen flex justify-center items-center">
            <div className="sm:w-2/3">
                <div className="flex justify-center mt-4 space-x-2">
                    <input
                        type="text"
                        value={characterName}
                        onChange={(e) => setCharacterName(e.target.value)}
                        onKeyDown={(e) => onCharacterInputKeyPress(e)}
                        placeholder="캐릭터명을 입력하세요"
                        className=" py-2 px-4 rounded border-2 border-[#d77355] focus:outline-none focus:border-[#b56248]"
                    />
                    <button
                        onClick={fetchCharacterData}
                        className="bg-[#d77355] text-white py-2 px-4 rounded hover:bg-[#b56248]"
                        disabled={loading}
                    >
                        {loading ? 'Loading...' : '조회'}
                    </button>
                </div>
                <div className="bg-[#646964] p-5 rounded-t-lg shadow-lg">
                    <div className="flex justify-between">
                        <div>
                            <p className="text-[#d77355] font-bold">CHARACTER INFO</p>
                            <p className="text-white text-sm">Lv. {characterData.characterLevel}</p>

                            <p className="text-white text-sm">{characterData.characterClass}</p>
                            <p className="text-white text-sm">{characterData.worldName}</p>
                            <p className="text-white text-sm">유니온 3131</p>
                            <p className="text-white text-sm">무릉도장 81층</p>
                        </div>
                        <img src={characterData.characterImage} alt="https://placehold.co/100x100"
                             className="square-full w-28 h-28"/>
                        <div>
                            <p className="text-white text-sm">길드명 : {characterData.characterGuildName}</p>
                            <p className="text-white text-sm">인기도 : {characterData.characterPopularity}</p>
                        </div>
                        <p className="text-white font-bold text-xl">{characterData.characterName}</p>
                    </div>
                    <div className="flex justify-around my-3">
                        <button className="bg-[#d77355] text-white py-1 px-3 rounded">하이퍼스텟</button>
                        <button className="bg-[#647c64] text-white py-1 px-3 rounded">어빌리티</button>
                    </div>
                    <div className="bg-[#d6d4e0] p-2">
                        <div className="bg-white p-3 rounded">
                            {/*<p className="text-[#646964] text-sm">전투력</p>*/}
                            {/*<p className="text-[#55415f] text-3xl font-bold">{(characterData.stats.filter((stat) => {*/}
                            {/*    console.log(stat.statName );*/}
                            {/*    console.log("booelan =" + stat.statName === '전투력');*/}
                            {/*    return stat.statName === '전투력'*/}
                            {/*})).statValue}</p>*/}
                            <div className="grid grid-cols-4 gap-4">
                                {characterData.stats.map((stat, index) => (
                                    <div key={`stat-item-${index}`}
                                         className="flex flex-col items-center justify-center p-2 border border-gray-200 rounded shadow-sm">
                                        <div className="text-[#646964] text-sm" key={`name-${index}`}>{stat.statName}</div>
                                        <div className="text-[#55415f]"
                                             key={`value-${index}`}>{formatStatValue(stat.statValue)}</div>
                                    </div>
                                ))}
                            </div>
                        </div>
                    </div>
                </div>
                <div className="bg-[#d6d4e0] p-5 rounded-b-lg shadow-lg">
                <div className="bg-white p-3 rounded">
                        {/* Repeat for other character info sections */}
                    </div>
                </div>
            </div>
        </div>
    );
}

export default App;