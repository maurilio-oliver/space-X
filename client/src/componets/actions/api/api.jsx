import axios from "axios";

const api = axios.create(
    {
        baseURL:"http://localhost:8080/api/"
    }
)


const API ={
    getPerson :(url) => api.get(url)
}
  export default API