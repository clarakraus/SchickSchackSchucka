import React, { useState, useEffect } from 'react';
import {playAgainstBot} from "./service/apiServices";

export default function App() {

    const [message, setMessage] = useState("");

    function playGame(choice: string){
        playAgainstBot(choice)
            .then(data => setMessage(data.player1))
    }

    return(
        <div>
            <h1>Schickschackschuckapp</h1>
            <button onClick={()=>playGame("rock")}>Rock</button>
            <button onClick={()=>playGame("scissors")}>Scissors</button>
            <button onClick={()=>playGame("paper")}>Paper</button>
            {message && <h2>{message}</h2>}
        </div>
    )




}