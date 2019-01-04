<template>
  <editor v-model="code" @init="editorInit" lang="json" theme="chrome" width="500" height="100"></editor>

</template>
<script>
export default {
  components: {
    editor: require('vue2-ace-editor')
  },
  // 注册组件
  data () {
    return {
      // 编辑器的默认输入值
      code: 'var a=1\nlet b=2',
      cmOptions: {
        mode: 'javascript',
        extraKeys: {'Ctrl-Space': 'autocomplete'}
      }
    }
  },
  methods: {
    editorInit: function () {
      require('brace/ext/language_tools') // language extension prerequsite...
      require('brace/mode/json') // language
      require('brace/mode/less')
      require('brace/theme/chrome')
      require('brace/snippets/json') // snippet
    }
  }
}
</script>
