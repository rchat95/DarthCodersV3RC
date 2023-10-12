import { createRouter, createWebHistory } from 'vue-router'
import Login from '../views/Login.vue'
import Home from '../views/Home.vue'
import CaseDetails from "@/views/CaseDetails.vue";
import Employee from '../views/Employee.vue'
import EmployeeForm from '../views/EmployeeForm.vue'
import EmployeeUpdateForm from '../views/EmployeeUpdateForm.vue'
import EmployeeDeleteForm from '../views/EmployeeDeleteForm.vue'

import Client from "../views/Client.vue"

import SignUp from "../views/SignUp.vue";
import AddCase from "../views/AddCase.vue";

const routes = [
  {
    path: '/',
    name: 'Login',
    component: Login
  },
  {
    path: '/signup',
    name: 'SignUp',
    component: SignUp
  },
  {
    path: '/addcase',
    name: 'AddCase',
    component: AddCase
  },
  {
    path: '/case',
    name: 'CaseDetails',
    component: CaseDetails
  },
  {
    path: '/client',
    name: 'Client',
    component: Client
  },
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  {
    path: '/employee',
    name: 'Employee',
    component: Employee
    
  },
  {
    path: '/employee/:id',
    name: 'updateform',
    component: EmployeeUpdateForm,
    params:true
    
  },
  {
    path: '/employee/:id',
    name: 'deleteform',
    component: EmployeeDeleteForm,
    params:true
    
  },
  {
    path: '/employeeform',
    name: 'EmployeeForm',
    component: EmployeeForm
    
  }
 

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
