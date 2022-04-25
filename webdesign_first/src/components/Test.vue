<template>
  <span>
      Hello  {{query_back}}
    第二次修改
  </span>
</template>

<script>
import axios from 'axios'
export default {
    created(){
        this.test();
    },

    data(){
        return{
            query:"前端数据",
            query_back:"",
        }
    },

    methods:{
        test(){
            var data=new URLSearchParams();
            data.append("query",this.query);
            axios.post("/test",data).then(response=>{
                console.log(response.data)
                this.query_back=response.data;
            })
        },
    },
}
</script>

<style lang="less" scoped>

</style>>

