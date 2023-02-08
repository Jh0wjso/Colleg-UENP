import { useState } from "react";
import "./styles.css";

export default function Datas() {
  const [germinationApi, setGerminationApi] = useState([{}]);
  const [fruitSpotsApi, setFruitSpotsApi] = useState([{}]);
  const [fruitPodsApi, setFruitPodsApi] = useState([{}]);
  const [cankerLesionApi, setCankerLesionApi] = useState([{}]);
  const [ccropHistApi, setCropHistApi] = useState([{}]);
  const [areaDamagedApi, setAreaDamagedApi] = useState([{}]);
  const [dateApi, setDateApi] = useState([{}]);
  const [externalDecayApi, setExternalDecayApi] = useState([{}]);
  const [fruitingBodies, setFruitingBodies] = useState([{}]);
  const [hailApi, setHailApi] = useState([{}]);
  const [intDiscolorApi, setIntDiscolorApi] = useState([{}]);
  const [leafMalfApi, setLeafMalfApi] = useState([{}]);
  const [leafMildApi, setLeafMildApi] = useState([{}]);
  const [leafShreadApi, setLeafShreadApi] = useState([{}]);
  const [leafSpotsHaloApi, setLeafSpotsHaloApi] = useState([{}]);
  const [leafSpotSizeApi, setLeafSpotSizeApi] = useState([{}]);
  const [leafspotsMargApi, setLeafspotsMargApi] = useState([{}]);
  const [lodgingApi, setLodgingApi] = useState([{}]);
  const [leavesApi, setLeaves] = useState([{}]);
  const [moldGrowthApi, setMoldGrowthApi] = useState([{}]);
  const [myceliumApi, setMyceliumApi] = useState([{}]);
  const [plantGrowthApi, setPlantGrowthApi] = useState([{}]);
  const [precipApi, setPrecipApi] = useState([{}]);
  const [rootsApi, setRootsApi] = useState([{}]);
  const [seedApi, setSeedApi] = useState([{}]);
  const [plantStandApi, setPlantStandApi] = useState([{}]);
  const [seedDiscolorApi, setSeedDiscolorApi] = useState([{}]);
  const [sclerotiaApi, setSclerotiaApi] = useState([{}]);
  const [seedSizeApi, setSeedSizeApi] = useState([{}]);
  const [seedTmtApi, setSeedTmtApi] = useState([{}]);
  const [severityApi, setSeverity] = useState([{}]);
  const [shrivelingApi, setShrivelingApi] = useState([{}]);
  const [stemApi, setStemApi] = useState([{}]);
  const [stemCankersApi, setStemCankersApi] = useState([{}]);
  const [tempApi, setTempApi] = useState([{}]);

  const [selectedData, setSelectedData] = useState([]);
  const [selectedDataAux, setSelectedDataAux] = useState([]);
  const [selectedDataAux2, setSelectedDataAux2] = useState([]);
  const [selectedDataAux3, setSelectedDataAux3] = useState([]);
  const [selectedDataAux4, setSelectedDataAux4] = useState([]);
  const [selectedDataAux5, setSelectedDataAux5] = useState([]);
  const [selectedDataAux6, setSelectedDataAux6] = useState([]);
  const [selectedDataAux7, setSelectedDataAux7] = useState([]);
  const [selectedDataAux8, setSelectedDataAux8] = useState([]);
  const [selectedDataAux9, setSelectedDataAux9] = useState([]);
  const [selectedDataAux10, setSelectedDataAux10] = useState([]);
  const [selectedDataAux11, setSelectedDataAux11] = useState([]);
  const [selectedDataAux12, setSelectedDataAux12] = useState([]);
  const [selectedDataAux13, setSelectedDataAux13] = useState([]);
  const [selectedDataAux14, setSelectedDataAux14] = useState([]);
  const [selectedDataAux15, setSelectedDataAux15] = useState([]);
  const [selectedDataAux16, setSelectedDataAux16] = useState([]);
  const [selectedDataAux17, setSelectedDataAux17] = useState([]);
  const [selectedDataAux18, setSelectedDataAux18] = useState([]);
  const [selectedDataAux19, setSelectedDataAux19] = useState([]);
  const [selectedDataAux20, setSelectedDataAux20] = useState([]);
  const [selectedDataAux21, setSelectedDataAux21] = useState([]);
  const [selectedDataAux22, setSelectedDataAux22] = useState([]);
  const [selectedDataAux23, setSelectedDataAux23] = useState([]);
  const [selectedDataAux24, setSelectedDataAux24] = useState([]);
  const [selectedDataAux25, setSelectedDataAux25] = useState([]);
  const [selectedDataAux26, setSelectedDataAux26] = useState([]);
  const [selectedDataAux27, setSelectedDataAux27] = useState([]);
  const [selectedDataAux28, setSelectedDataAux28] = useState([]);
  const [selectedDataAux29, setSelectedDataAux29] = useState([]);
  const [selectedDataAux30, setSelectedDataAux30] = useState([]);
  const [selectedDataAux31, setSelectedDataAux31] = useState([]);
  const [selectedDataAux32, setSelectedDataAux32] = useState([]);
  const [selectedDataAux33, setSelectedDataAux33] = useState([]);
  const [selectedDataAux34, setSelectedDataAux34] = useState([]);
  const [selectedDataAux35, setSelectedDataAux35] = useState([]);


  const [useEffectState, setUseEffectState] = useState(false);

  async function apiData() {
    fetch(`https://ApiTest.jhonatansilvrio.repl.co/germination`)
      .then((res) => res.json())
      .then((data) => {
        setGerminationApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/fruitSpots`)
      .then((res) => res.json())
      .then((data) => {
        setFruitSpotsApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/fruitPods`)
      .then((res) => res.json())
      .then((data) => {
        setFruitPodsApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/areaDamaged`)
      .then((res) => res.json())
      .then((data) => {
        setAreaDamagedApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/cankerLesion`)
      .then((res) => res.json())
      .then((data) => {
        setCankerLesionApi(data.data);
      });

      fetch(`https://ApiTest.jhonatansilvrio.repl.co/cropHist`)
      .then((res) => res.json())
      .then((data) => {
        setCropHistApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/date`)
      .then((res) => res.json())
      .then((data) => {
        setDateApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/externalDecay`)
      .then((res) => res.json())
      .then((data) => {
        setExternalDecayApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/fruitingBodies`)
      .then((res) => res.json())
      .then((data) => {
        setFruitingBodies(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/hail`)
      .then((res) => res.json())
      .then((data) => {
        setHailApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/intDiscolor`)
      .then((res) => res.json())
      .then((data) => {
        setIntDiscolorApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leafMalf`)
      .then((res) => res.json())
      .then((data) => {
        setLeafMalfApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leafMild`)
      .then((res) => res.json())
      .then((data) => {
        setLeafMildApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leafShread`)
      .then((res) => res.json())
      .then((data) => {
        setLeafShreadApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leafSpotsHalo`)
      .then((res) => res.json())
      .then((data) => {
        setLeafSpotsHaloApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leafSpotSize`)
      .then((res) => res.json())
      .then((data) => {
        setLeafSpotSizeApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leafspotsMarg`)
      .then((res) => res.json())
      .then((data) => {
        setLeafspotsMargApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/lodging`)
      .then((res) => res.json())
      .then((data) => {
        setLodgingApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/leaves`)
      .then((res) => res.json())
      .then((data) => {
        setLeaves(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/moldGrowth`)
      .then((res) => res.json())
      .then((data) => {
        setMoldGrowthApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/mycelium`)
      .then((res) => res.json())
      .then((data) => {
        setMyceliumApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/plantGrowth`)
      .then((res) => res.json())
      .then((data) => {
        setPlantGrowthApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/precip`)
      .then((res) => res.json())
      .then((data) => {
        setPrecipApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/roots`)
      .then((res) => res.json())
      .then((data) => {
        setRootsApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/seed`)
      .then((res) => res.json())
      .then((data) => {
        setSeedApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/plantStand`)
      .then((res) => res.json())
      .then((data) => {
        setPlantStandApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/seedDiscolor`)
      .then((res) => res.json())
      .then((data) => {
        setSeedDiscolorApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/sclerotia`)
      .then((res) => res.json())
      .then((data) => {
        setSclerotiaApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/seedSize`)
      .then((res) => res.json())
      .then((data) => {
        setSeedSizeApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/seedTmt`)
      .then((res) => res.json())
      .then((data) => {
        setSeedTmtApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/severity`)
      .then((res) => res.json())
      .then((data) => {
        setSeverity(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/shriveling`)
      .then((res) => res.json())
      .then((data) => {
        setShrivelingApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/stem`)
      .then((res) => res.json())
      .then((data) => {
        setStemApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/stemCankers`)
      .then((res) => res.json())
      .then((data) => {
        setStemCankersApi(data.data);
      });

    fetch(`https://ApiTest.jhonatansilvrio.repl.co/temp`)
      .then((res) => res.json())
      .then((data) => {
        setTempApi(data.data);
      });

    setUseEffectState(!useEffectState);
  }

  function setData() {
    const newList = selectedData.concat(selectedDataAux);
    setSelectedData(newList);
    setSelectedDataAux("");
  }

  function dataShow() {
    setData();
    console.log(selectedDataAux);
    console.log(selectedData);
  }

  async function showDatas() {
    console.log(selectedData);
  }

  showDatas();

  !useEffectState ? apiData() : "";

  return (
    <div className="containerContent">
      <form action="http://127.0.0.1:5000/result" method="POST" className="flex flex-col items-center">
        <div className="dropDown">
          <p className="name">Germination</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data"
            value={selectedDataAux}
            onChange={(e) => setSelectedDataAux(e.target.value)}
          >
            {germinationApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Fruit Pods</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data2"
            value={selectedDataAux2}
            onChange={(e) => setSelectedDataAux2(e.target.value)}
          >
            {fruitPodsApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Area Damaged</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data3"
            value={selectedDataAux3}
            onChange={(e) => setSelectedDataAux3(e.target.value)}
          >
            {areaDamagedApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Canker Lesion</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data4"
            value={selectedDataAux4}
            onChange={(e) => setSelectedDataAux4(e.target.value)}
          >
            {cankerLesionApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Crop Hist</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data4"
            value={selectedDataAux35}
            onChange={(e) => setSelectedDataAux35(e.target.value)}
          >
            {ccropHistApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Date</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data5"
            value={selectedDataAux5}
            onChange={(e) => setSelectedDataAux5(e.target.value)}
          >
            {dateApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">External Decay</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data6"
            value={selectedDataAux6}
            onChange={(e) => setSelectedDataAux6(e.target.value)}
          >
            {externalDecayApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Fruiting Bodies</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data7"
            value={selectedDataAux7}
            onChange={(e) => setSelectedDataAux7(e.target.value)}
          >
            {fruitingBodies.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Fruit Spots</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data8"
            value={selectedDataAux8}
            onChange={(e) => setSelectedDataAux8(e.target.value)}
          >
            {fruitSpotsApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Hail</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data9"
            value={selectedDataAux9}
            onChange={(e) => setSelectedDataAux9(e.target.value)}
          >
            {hailApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Int Discolor</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data10"
            value={selectedDataAux10}
            onChange={(e) => setSelectedDataAux10(e.target.value)}
          >
            {intDiscolorApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaf Malf</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data11"
            value={selectedDataAux11}
            onChange={(e) => setSelectedDataAux11(e.target.value)}
          >
            {leafMalfApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaf Mild</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data12"
            value={selectedDataAux12}
            onChange={(e) => setSelectedDataAux12(e.target.value)}
          >
            {leafMildApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaf Shread</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data13"
            value={selectedDataAux13}
            onChange={(e) => setSelectedDataAux13(e.target.value)}
          >
            {leafShreadApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaf Spots Halo</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data14"
            value={selectedDataAux14}
            onChange={(e) => setSelectedDataAux14(e.target.value)}
          >
            {leafSpotsHaloApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaf Spot Size</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data15"
            value={selectedDataAux15}
            onChange={(e) => setSelectedDataAux15(e.target.value)}
          >
            {leafSpotSizeApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaf Spots Marg</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data16"
            value={selectedDataAux16}
            onChange={(e) => setSelectedDataAux16(e.target.value)}
          >
            {leafspotsMargApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Lodging</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data17"
            value={selectedDataAux17}
            onChange={(e) => setSelectedDataAux17(e.target.value)}
          >
            {lodgingApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Leaves</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data18"
            value={selectedDataAux18}
            onChange={(e) => setSelectedDataAux18(e.target.value)}
          >
            {leavesApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Mold Growth</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data19"
            value={selectedDataAux19}
            onChange={(e) => setSelectedDataAux19(e.target.value)}
          >
            {moldGrowthApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Mycelium</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data20"
            value={selectedDataAux20}
            onChange={(e) => setSelectedDataAux20(e.target.value)}
          >
            {myceliumApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Plant Growth</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data21"
            value={selectedDataAux21}
            onChange={(e) => setSelectedDataAux21(e.target.value)}
          >
            {plantGrowthApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Plant Stand</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data22"
            value={selectedDataAux22}
            onChange={(e) => setSelectedDataAux22(e.target.value)}
          >
            {plantStandApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Precip</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data23"
            value={selectedDataAux23}
            onChange={(e) => setSelectedDataAux23(e.target.value)}
          >
            {precipApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Roots</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data24"
            value={selectedDataAux24}
            onChange={(e) => setSelectedDataAux24(e.target.value)}
          >
            {rootsApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Sclerotia</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data25"
            value={selectedDataAux25}
            onChange={(e) => setSelectedDataAux25(e.target.value)}
          >
            {sclerotiaApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Seed</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data26"
            value={selectedDataAux26}
            onChange={(e) => setSelectedDataAux26(e.target.value)}
          >
            {seedApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Seed Discolor</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data27"
            value={selectedDataAux27}
            onChange={(e) => setSelectedDataAux27(e.target.value)}
          >
            {seedDiscolorApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Seed Size</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data28"
            value={selectedDataAux28}
            onChange={(e) => setSelectedDataAux28(e.target.value)}
          >
            {seedSizeApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Seed Tmt</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data29"
            value={selectedDataAux29}
            onChange={(e) => setSelectedDataAux29(e.target.value)}
          >
            {seedTmtApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Severity</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data30"
            value={selectedDataAux30}
            onChange={(e) => setSelectedDataAux30(e.target.value)}
          >
            {severityApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Shriveling</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data31"
            value={selectedDataAux31}
            onChange={(e) => setSelectedDataAux31(e.target.value)}
          >
            {shrivelingApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Stem</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data32"
            value={selectedDataAux32}
            onChange={(e) => setSelectedDataAux32(e.target.value)}
          >
            {stemApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="dropDown">
          <p className="name">Stem Cankers</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data33"
            value={selectedDataAux33}
            onChange={(e) => setSelectedDataAux33(e.target.value)}
          >
            {stemCankersApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <div className="text-center my-10">
          <p className="name">Temp</p>
          <select
            className="selectContent"
            placeholder="Componente Extra"
            name="data34"
            value={selectedDataAux34}
            onChange={(e) => setSelectedDataAux34(e.target.value)}
          >
            {tempApi.map((ApiData) => (
              <option value={ApiData.data}>{ApiData.data}</option>
            ))}
          </select>
        </div>
        <button className="bg-orange-400 p-3 rounded" type="submit">
          Enviar Dados
        </button>
      </form>
    </div>
  );
}
