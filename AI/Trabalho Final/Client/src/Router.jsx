import { Routes, Route } from "react-router-dom";
import App from "./App";
import Teste from "./components/Teste";

export function Router() {
  return (
    <Routes>
        <Route path="/" element={<Datas />} />
        <Route path="/datase">
          <Route path=":data/:data2" element={<Teste />} />
        </Route>
    </Routes>
  );
}
