import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './plugins/element.js'

import './assets/css/global.css'
// import './assets/myIcon/iconfont.css'
// import './assets/myIcon/iconfont.js'

import axios from 'axios'

Vue.prototype.$http=axios;
axios.defaults.baseURL="http://localhost:9090";

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
