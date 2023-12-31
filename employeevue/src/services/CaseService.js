import axios from 'axios'

//rest point URL
const CASE_API_BASE_URL='https://testwebapprc.azurewebsites.net/api/users/register'

class CaseService{
    createCase(data){
        console.log("Calling API")
        console.log(data)
        return axios.post(CASE_API_BASE_URL, data).catch((error) => {
            console.log("Exception!")
            console.log(error)
        })
    }
}

export default new CaseService()