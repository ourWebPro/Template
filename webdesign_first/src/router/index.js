import Vue from 'vue'
import VueRouter from 'vue-router'

import Test from '../components/Test.vue'


Vue.use(VueRouter)

const routes = [
  {
    path:"/",
    component:Test
  },
]

const router = new VueRouter({
  routes
})

export default router
