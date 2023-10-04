import axios from 'axios'

//rest point URL
const Employee_API_BASE_URL='http://localhost:8080/api/employees'

class EmployeeService{
    // returns the response of the REST API
    getEmployees(){
        return axios.get(Employee_API_BASE_URL)
    }
    createEmployee(data){
        return axios.post(Employee_API_BASE_URL,data)

    }
    getEmployeeData(id){
        let URL =Employee_API_BASE_URL+'/'+id
        return axios.get(URL);
    }
    updateEmployee(data){
        console.log('inside updateEmployee')
        console.log(data)
        let URL=Employee_API_BASE_URL+'/'+data.id
        return axios.put(URL,data)
    }
    deleteEmployee(id){
        let URL =Employee_API_BASE_URL+'/'+id
        return axios.delete(URL)
    }
}

export default new EmployeeService()
