import axios, {AxiosResponse} from "axios";
import {ResultDTO} from "./model";


export function playAgainstBot(choice: string){
    return axios.post("/api/game/bot/" + choice)
        .then((response: AxiosResponse<ResultDTO>) => response.data)
}