<template>
  <div>
    <div v-if="this.$store.state.redis!=''">
      <h1>{{this.$store.state.redis}}</h1>
      <el-form ref="execute" :model="command" label-width="40px">
        <el-form-item label="命令">
          <el-input v-model="command.name" placeholder="请输入要执行的命令"
                    suffix-icon="el-icon-menu"></el-input>
          <!--
          <el-input v-model="user.pass" type="password"></el-input>
          -->
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="execute">执行</el-button>
        </el-form-item>
      </el-form>
      结果：<textarea cols="30" rows="10" v-model="response"></textarea>
    </div>
    <div v-else>
      请选择实例
    </div>
  </div>
</template>

<script>
export default {
  name: 'Command',
  data () {
    return {
      command: {name: ''},
      response: []
    }
  },
  methods: {
    execute () {
      this.$axios
        .post('/command', {
          command: this.command.name
        })
        .then(successResponse => {
          this.response = JSON.stringify(successResponse.data)
          if (successResponse.data.code === 200) {
            // this.$router.replace({path: '/index'})
          }
        })
        .catch(failResponse => {
        })
    }
  }
}
</script>

<style scoped>

</style>
