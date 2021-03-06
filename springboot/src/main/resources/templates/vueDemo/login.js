/**
 * 登录组件
 * Created by yuzhou on 16/9/5.
 */
define(['vue', 'text!tpl/login.html', 'vue-strap', 'service/utilService'], function (Vue, loginHtml, VueStrap, utilService) {
    return Vue.extend({
        template: loginHtml,
        data: function () {
            return {
                showModal: true,
                killPhone: 13776573631,
                validated: true,
                fromPath:''
            }
        },
        watch: {
            'killPhone': function (val, oldVal) {
                this.validated = utilService.validatePhone(val)
            }
        },
        mounted: function () {
            var killPhone = this.$cookie.get('killPhone');
            if (utilService.validatePhone(killPhone)) {
                //alert('用户已登录')
                this.$router.go('/');
                return
            }

                this.killPhone= killPhone;
                this.validated= false
        },
        methods: {
            doSubmit: function () {
                //console.log('From path', this.fromPath)
                if (utilService.validatePhone(this.killPhone)) {
                    this.$cookie.set('killPhone', this.killPhone, 1);
                    this.$router.go(-1)
                } else {
                    alert('请输入正确的手机号')
                }
            }
        }
    })
});
