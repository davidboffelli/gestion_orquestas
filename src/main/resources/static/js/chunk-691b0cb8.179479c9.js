(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-691b0cb8"],{"077e":function(t,a,e){"use strict";var i=function(t,a){var e=a._c;return e("span",a._g(a._b({staticClass:"material-design-icon calendar-icon",class:[a.data.class,a.data.staticClass],attrs:{"aria-hidden":a.props.decorative,"aria-label":a.props.title,role:"img"}},"span",a.data.attrs,!1),a.listeners),[e("svg",{staticClass:"material-design-icon__svg",attrs:{fill:a.props.fillColor,width:a.props.size,height:a.props.size,viewBox:"0 0 24 24"}},[e("path",{attrs:{d:"M19,19H5V8H19M16,1V3H8V1H6V3H5C3.89,3 3,3.89 3,5V19A2,2 0 0,0 5,21H19A2,2 0 0,0 21,19V5C21,3.89 20.1,3 19,3H18V1M17,12H12V17H17V12Z"}},[a.props.decorative?a._e():e("title",[a._v(a._s(a.props.title))])])])])},s=[],r=(e("a9e3"),{name:"CalendarIcon",props:{title:{type:String,default:"Calendar icon"},decorative:{type:Boolean,default:!1},fillColor:{type:String,default:"currentColor"},size:{type:Number,default:24}}}),o=r,n=e("2877"),l=Object(n["a"])(o,i,s,!0,null,null,null);a["a"]=l.exports},"5c79":function(t,a,e){"use strict";e.r(a);var i=function(){var t=this,a=t.$createElement,e=t._self._c||a;return t.loading?t._e():e("div",{staticClass:"internal-container"},[e("div",{staticClass:"row"},[e("div",{attrs:{id:"button-checkout"}}),e("h1",[t._v(t._s(t.show.name))])]),e("div",{staticClass:"row",staticStyle:{"margin-bottom":"20px"}},[t._m(0),e("div",{staticClass:"col-md-6"},[e("h4",[e("Calendar"),t._v(" "+t._s(t._f("datetime")(t.show.date))+" ")],1),e("h4",[e("Pin"),t._v(t._s(t.show.place)+" ")],1),e("h5",[t._v(" "+t._s(t._f("money")(t.show.price))+" ")]),e("router-link",{staticClass:"grm-link-button",attrs:{to:{name:"BuyTickets",params:{id:t.show.id}}}},[t._v("Comprar con Mercado Pago")])],1)])])},s=[function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"col-md-6"},[e("img",{attrs:{width:"500",src:"https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg/800px-Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg"}})])}],r=e("3f46"),o=e("077e"),n=function(t,a){var e=a._c;return e("span",a._g(a._b({staticClass:"material-design-icon pin-icon",class:[a.data.class,a.data.staticClass],attrs:{"aria-hidden":a.props.decorative,"aria-label":a.props.title,role:"img"}},"span",a.data.attrs,!1),a.listeners),[e("svg",{staticClass:"material-design-icon__svg",attrs:{fill:a.props.fillColor,width:a.props.size,height:a.props.size,viewBox:"0 0 24 24"}},[e("path",{attrs:{d:"M16,12V4H17V2H7V4H8V12L6,14V16H11.2V22H12.8V16H18V14L16,12Z"}},[a.props.decorative?a._e():e("title",[a._v(a._s(a.props.title))])])])])},l=[],c=(e("a9e3"),{name:"PinIcon",props:{title:{type:String,default:"Pin icon"},decorative:{type:Boolean,default:!1},fillColor:{type:String,default:"currentColor"},size:{type:Number,default:24}}}),p=c,d=e("2877"),u=Object(d["a"])(p,n,l,!0,null,null,null),_=u.exports,h={components:{Calendar:o["a"],Pin:_},data:function(){return{show:null,preferenceId:null,loading:!0}},mounted:function(){var t=this,a=this.$route.params.id,e=r["a"].get("/api/shows",{params:{id:a}});e.then((function(a){t.show=a.data,t.loading=!1}))},filters:{money:function(t){return"$"+t}}},m=h,f=Object(d["a"])(m,i,s,!1,null,null,null);a["default"]=f.exports}}]);
//# sourceMappingURL=chunk-691b0cb8.179479c9.js.map