import axios from 'axios'

//rest point URL
const CASE_API_BASE_URL='http://localhost:8080/api/employees'

class CaseService{
    createCase(data){
        console.log(data)
        return axios.post(CASE_API_BASE_URL, data)
    }
}

export default new CaseService()