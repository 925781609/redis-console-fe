<template>
  <div>
    <el-form>
      <el-form-item>
        <el-button type="primary" @click="execute">查询</el-button>
      </el-form-item>
    </el-form>
    <h1>{{this.$store.state.redis}}的配置为</h1>
    <tree-view :data="response" :options="{maxDepth: 5}" @change-data="onChangeData">
    </tree-view>
  </div>
</template>

<script>
import Vue from 'vue'
import TreeView from 'vue-json-tree-view'

Vue.use(TreeView)
export default {
  name: 'Config',
  data () {
    return {
      response: []
    }
  },
  methods: {
    execute () {
      this.$axios
        .get('/configs')
        .then(successResponse => {
          var tmp = JSON.stringify(successResponse.data.data)
          console.log(successResponse.data.data)
          console.log(this.response)
          this.response = JSON.parse(tmp)
          if (successResponse.data.code === 200) {
            // this.$router.replace({path: '/index'})
          }
        })
        .catch(failResponse => {
        })
    },
    onChangeData (data) {
    }
  }
}
</script>

<style scoped>

</style>
