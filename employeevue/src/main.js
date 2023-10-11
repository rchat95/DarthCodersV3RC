import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
// import 'bootstrap/dist/css/bootstrap.min.css'
import 'semantic-ui-css/semantic.min.css'

// createApp(App).use(store).use(router).mount('#app')
createApp(App).use(router).mount('#app')

