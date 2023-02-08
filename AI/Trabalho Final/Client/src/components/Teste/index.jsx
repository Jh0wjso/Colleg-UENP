import { useParams } from "react-router-dom";

export default function Teste(){

    const data = useParams();
    const data1 = data.data;
    const data2 = data.data2;

    return(
        <div>
            {
                data1
            }
            {
                data2
            }
        </div>
    );
}