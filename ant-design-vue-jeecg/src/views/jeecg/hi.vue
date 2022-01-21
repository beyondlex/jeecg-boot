<template>
  <div>
    {{msg}}
  </div>
</template>
<script>
import {getAction} from '@api/manage'
export default {
  data() {
    return {
      msg: "Hi"
    }
  },
  methods: {
    hello() {
      var url = "/demo/hello"
      getAction(url, {name: "Jack"}).then((res) => {
        this.msg = res
        // if (res.success) {
        //   this.msg = res.result;
        // }
      })
    }
  },
  created() {
    this.hello()
  }
}
</script>