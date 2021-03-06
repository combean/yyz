define({
    install: function (Vue) {
        Vue.prototype.$cookie = this
    },

    set: function (name, value, days) {
        var d = new Date;
        d.setTime(d.getTime() + 24*60*60*1000*days);
        window.document.cookie = name + "=" + value + ";path=/;expires=" + d.toGMTString()
    },

    get: function (name) {
        var reg = new RegExp('(^|;) ?' + name + '=([^;]*)(;|$)')
        var v = window.document.cookie.match(reg)
        return v ? v[2] : null;
    },

    delete: function (name) {
        this.set(name, '', -1);
    }
})