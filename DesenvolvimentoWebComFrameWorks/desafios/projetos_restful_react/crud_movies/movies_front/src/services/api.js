import axios from 'axios';


const api = axios.create({ baseURL:'http://localhost:8090/api/v1/movies'})

export default api;