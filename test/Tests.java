/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import playlistapp.PlaylistApp;

/**
 *
 * @author kris
 */
public class Tests {
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testhello() 
     {
         String App_started = "hello" ;
         String b = "b" ;
         
     assertEquals(App_started , PlaylistApp.hello() );
     
     }
    
     @Test
     public void testConnect()
     {
     int year = 2015;
     
     
     String Testhtml[] = new String[100];
     int i = 0;
     //TODO update this;
     Testhtml[i] = "<!doctype html><html itemscope=\"\" itemtype=\"http://schema.org/WebPage\" lang=\"en\"><head><meta content=\"Search the world's information, including webpages, images, videos and more. Google has many special features to help you find exactly what you're looking for.\" name=\"description\"><meta content=\"noodp\" name=\"robots\"><meta content=\"/images/branding/googleg/1x/googleg_standard_color_128dp.png\" itemprop=\"image\"><title>Google</title><script>(function(){window.google={kEI:'QmgtVuyQJ4bl-QGZkY7ACg',kEXPI:'3700276,4014789,4026241,4029815,4031109,4032678,4033307,4033344,4036527,4037333,4037569,4038012,4040137,4041440,4041836,4042491,4043255,4043448,4043449,4043492,4044246,4044606,4045717,4045841,4046304,4046400,4046976,4047345,4048007,4048011,4048141,4048512,4048513,4048570,4048628,4048854,4048909,4048971,4049045,4049130,4049597,4050322,4050735,4050767,4050903,4050905,4051106,8300227,8300236,8502094,8502221,8502312,8502315,8502342,8502347,8502443,8502482,8502528,8502535,10200083,10201287',authuser:0,kscs:'c9c918f0_10'};google.kHL='en';})();(function(){google.lc=[];google.li=0;google.getEI=function(a){for(var b;a&&(!a.getAttribute||!(b=a.getAttribute(\"eid\")));)a=a.parentNode;return b||google.kEI};google.getLEI=function(a){for(var b=null;a&&(!a.getAttribute||!(b=a.getAttribute(\"leid\")));)a=a.parentNode;return b};google.https=function(){return\"https:\"==window.location.protocol};google.ml=function(){return null};google.wl=function(a,b){try{google.ml(Error(a),!1,b)}catch(d){}};google.time=function(){return(new Date).getTime()};google.log=function(a,b,d,e,g){a=google.logUrl(a,b,d,e,g);if(\"\"!=a){b=new Image;var c=google.lc,f=google.li;c[f]=b;b.onerror=b.onload=b.onabort=function(){delete c[f]};window.google&&window.google.vel&&window.google.vel.lu&&window.google.vel.lu(a);b.src=a;google.li=f+1}};google.logUrl=function(a,b,d,e,g){var c=\"\",f=google.ls||\"\";if(!d&&-1==b.search(\"&ei=\")){var h=google.getEI(e),c=\"&ei=\"+h;-1==b.search(\"&lei=\")&&((e=google.getLEI(e))?c+=\"&lei=\"+e:h!=google.kEI&&(c+=\"&lei=\"+google.kEI))}a=d||\"/\"+(g||\"gen_204\")+\"?atyp=i&ct=\"+a+\"&cad=\"+b+c+f+\"&zx=\"+google.time();/^http:/i.test(a)&&google.https()&&(google.ml(Error(\"a\"),!1,{src:a,glmm:1}),a=\"\");return a};google.y={};google.x=function(a,b){google.y[a.id]=[a,b];return!1};google.load=function(a,b,d){google.x({id:a+k++},function(){google.load(a,b,d)})};var k=0;})();var _gjwl=location;function _gjuc(){var a=_gjwl.href.indexOf(\"#\");if(0<=a&&(a=_gjwl.href.substring(a),0<a.indexOf(\"&q=\")||0<=a.indexOf(\"#q=\"))&&(a=a.substring(1),-1==a.indexOf(\"#\"))){for(var d=0;d<a.length;){var b=d;\"&\"==a.charAt(b)&&++b;var c=a.indexOf(\"&\",b);-1==c&&(c=a.length);b=a.substring(b,c);if(0==b.indexOf(\"fp=\"))a=a.substring(0,d)+a.substring(c,a.length),c=d;else if(\"cad=h\"==b)return 0;d=c}_gjwl.href=\"/search?\"+a+\"&cad=h\";return 1}return 0}\n" ;
      i++;
     Testhtml[i] = "function _gjh(){!_gjuc()&&window.google&&google.x&&google.x({id:\"GJH\"},function(){google.nav&&google.nav.gjh&&google.nav.gjh()})};window._gjh&&_gjh();</script><style>#gbar,#guser{font-size:13px;padding-top:1px !important;}#gbar{height:22px}#guser{padding-bottom:7px !important;text-align:right}.gbh,.gbd{border-top:1px solid #c9d7f1;font-size:1px}.gbh{height:0;position:absolute;top:24px;width:100%}@media all{.gb1{height:22px;margin-right:.5em;vertical-align:top}#gbar{float:left}}a.gb1,a.gb4{text-decoration:underline !important}a.gb1,a.gb4{color:#00c !important}.gbi .gb4{color:#dd8e27 !important}.gbf .gb4{color:#900 !important}\n" ;
     i++;
     Testhtml[i]  = "</style><style>body,td,a,p,.h{font-family:arial,sans-serif}body{margin:0;overflow-y:scroll}#gog{padding:3px 8px 0}td{line-height:.8em}.gac_m td{line-height:17px}form{margin-bottom:20px}.h{color:#36c}.q{color:#00c}.ts td{padding:0}.ts{border-collapse:collapse}em{font-weight:bold;font-style:normal}.lst{height:25px;width:496px}.gsfi,.lst{font:18px arial,sans-serif}.gsfs{font:17px arial,sans-serif}.ds{display:inline-box;display:inline-block;margin:3px 0 4px;margin-left:4px}input{font-family:inherit}a.gb1,a.gb2,a.gb3,a.gb4{color:#11c !important}body{background:#fff;color:black}a{color:#11c;text-decoration:none}a:hover,a:active{text-decoration:underline}.fl a{color:#36c}a:visited{color:#551a8b}a.gb1,a.gb4{text-decoration:underline}a.gb3:hover{text-decoration:none}#ghead a.gb2:hover{color:#fff !important}.sblc{padding-top:5px}.sblc a{display:block;margin:2px 0;margin-left:13px;font-size:11px}.lsbb{background:#eee;border:solid 1px;border-color:#ccc #999 #999 #ccc;height:30px}.lsbb{display:block}.ftl,#fll a{display:inline-block;margin:0 12px}.lsb{background:url(/images/nav_logo229.png) 0 -261px repeat-x;border:none;color:#000;cursor:pointer;height:30px;margin:0;outline:0;font:15px arial,sans-serif;vertical-align:top}.lsb:active{background:#ccc}.lst:focus{outline:none}</style><script></script><link href=\"/images/branding/product/ico/googleg_lodp.ico\" rel=\"shortcut icon\"></head><body bgcolor=\"#fff\"><script>(function(){var src='/images/nav_logo229.png';var iesg=false;document.body.onload = function(){window.n && window.n();if (document.images){new Image().src=src;}\n" ;
     i++;
     Testhtml[i]  = "if (!iesg){document.f&&document.f.q.focus();document.gbqf&&document.gbqf.q.focus();}\n" ;
     i++;
     Testhtml[i]  = "}\n" ;
     i++;
     Testhtml[i] = "})();</script><div id=\"mngb\">    <div id=gbar><nobr><b class=gb1>Search</b> <a class=gb1 href=\"https://www.google.com/imghp?hl=en&tab=wi\">Images</a> <a class=gb1 href=\"https://maps.google.com/maps?hl=en&tab=wl\">Maps</a> <a class=gb1 href=\"https://play.google.com/?hl=en&tab=w8\">Play</a> <a class=gb1 href=\"https://www.youtube.com/?tab=w1\">YouTube</a> <a class=gb1 href=\"https://news.google.com/nwshp?hl=en&tab=wn\">News</a> <a class=gb1 href=\"https://mail.google.com/mail/?tab=wm\">Gmail</a> <a class=gb1 href=\"https://drive.google.com/?tab=wo\">Drive</a> <a class=gb1 style=\"text-decoration:none\" href=\"https://www.google.com/intl/en/options/\"><u>More</u> &raquo;</a></nobr></div><div id=guser width=100%><nobr><span id=gbn class=gbi></span><span id=gbf class=gbf></span><span id=gbe></span><a href=\"http://www.google.com/history/optout?hl=en\" class=gb4>Web History</a> | <a  href=\"/preferences?hl=en\" class=gb4>Settings</a> | <a target=_top id=gb_70 href=\"https://accounts.google.com/ServiceLogin?hl=en&continue=https://www.google.com/\" class=gb4>Sign in</a></nobr></div><div class=gbh style=left:0></div><div class=gbh style=right:0></div>    </div><center><span id=\"prt\" style=\"display:block\"> <div><style>.pmoabs{background-color:#fff;border:1px solid #E5E5E5;color:#666;font-size:13px;padding-bottom:20px;position:absolute;right:2px;top:3px;z-index:986}#pmolnk{border-radius:2px;-moz-border-radius:2px;-webkit-border-radius:2px}.kd-button-submit{border:1px solid #3079ed;background-color:#4d90fe;background-image:-webkit-gradient(linear,left top,left bottom,from(#4d90fe),to(#4787ed));background-image:-webkit-linear-gradient(top,#4d90fe,#4787ed);background-image:-moz-linear-gradient(top,#4d90fe,#4787ed);background-image:-ms-linear-gradient(top,#4d90fe,#4787ed);background-image:-o-linear-gradient(top,#4d90fe,#4787ed);background-image:linear-gradient(top,#4d90fe,#4787ed);filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#4d90fe',EndColorStr='#4787ed')}.kd-button-submit:hover{border:1px solid #2f5bb7;background-color:#357ae8;background-image:-webkit-gradient(linear,left top,left bottom,from(#4d90fe),to(#357ae8));background-image:-webkit-linear-gradient(top,#4d90fe,#357ae8);background-image:-moz-linear-gradient(top,#4d90fe,#357ae8);background-image:-ms-linear-gradient(top,#4d90fe,#357ae8);background-image:-o-linear-gradient(top,#4d90fe,#357ae8);background-image:linear-gradient(top,#4d90fe,#357ae8);filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#4d90fe',EndColorStr='#357ae8')}.kd-button-submit:active{-webkit-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);-moz-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);box-shadow:inset 0 1px 2px rgba(0,0,0,0.3)}#pmolnk a{color:#fff;display:inline-block;font-weight:bold;padding:5px 20px;text-decoration:none;white-space:nowrap}.xbtn{color:#999;cursor:pointer;font-size:23px;line-height:5px;padding-top:5px}.padi{padding:0 8px 0 10px}.padt{padding:5px 20px 0 0;color:#444}.pads{text-align:left;max-width:200px}</style> <div class=\"pmoabs\" id=\"pmocntr2\" style=\"behavior:url(#default#userdata);display:none\"> <table border=\"0\"> <tr> <td colspan=\"2\"> <div class=\"xbtn\" onclick=\"google.promos&&google.promos.toast&& google.promos.toast.cpc()\" style=\"float:right\">&times;</div> </td> </tr> <tr> <td class=\"padi\" rowspan=\"2\"> <img src=\"/images/icons/product/chrome-48.png\"> </td> <td class=\"pads\">A better way to browse the web</td> </tr> <tr> <td class=\"padt\"> <div class=\"kd-button-submit\" id=\"pmolnk\"> <a href=\"/chrome/browser/?hl=en&amp;brand=CHNG&amp;utm_source=en-hpp&amp;utm_medium=hpp&amp;utm_campaign=en\" onclick=\"google.promos&&google.promos.toast&& google.promos.toast.cl()\">Get Google Chrome</a> </div> </td> </tr> </table> </div> <script type=\"text/javascript\">(function(){var a={v:{}};a.v.Ya=50;a.v.Wa=10;a.v.Fa=\"body\";a.v.Eb=!0;a.v.Hb=function(b,c){var d=a.v.rb();a.v.ub(d,b,c);a.v.Ib(d);a.v.Eb&&a.v.Fb(d)};a.v.Ib=function(b){(b=a.v.Ha(b))&&0<b.forms.length&&b.forms[0].submit()};a.v.rb=function(){var b=document.createElement(\"iframe\");b.height=0;b.width=0;b.style.overflow=\"hidden\";b.style.top=b.style.left=\"-100px\";b.style.position=\"absolute\";document.body.appendChild(b);return b};a.v.Ha=function(b){return b.contentDocument||b.contentWindow.document};a.v.ub=function(b,c,d){b=a.v.Ha(b);b.open();d=[\"<\",a.v.Fa,'><form method=POST action=\"',d,'\">'];for(var e in c)c.hasOwnProperty(e)&&d.push('<textarea name=\"',e,'\">',c[e],\"</textarea>\");d.push(\"</form></\",a.v.Fa,\">\");b.write(d.join(\"\"));b.close()};a.v.Ja=function(b,c){c>a.v.Wa?google&&google.ml&&google.ml(Error(\"ogcdr\"),!1,{cause:\"timeout\"}):b.contentWindow?a.v.Gb(b):window.setTimeout(function(){a.v.Ja(b,c+1)},a.v.Ya)};a.v.Gb=function(b){document.body.removeChild(b)};a.v.Fb=function(b){a.v.pb(b,\"load\",function(){a.v.Ja(b,0)})};a.v.pb=function(b,c,d){b.addEventListener?b.addEventListener(c,d,!1):b.attachEvent&&b.attachEvent(\"on\"+c,d)};var m={Lb:0,U:1,V:2,na:5};a.s={};a.s.pa={Sa:\"i\",ma:\"d\",Ua:\"l\"};a.s.R={qa:\"0\",W:\"1\"};a.s.ra={oa:1,ma:2,ka:3};a.s.O={Ma:\"a\",Qa:\"g\",T:\"c\",lb:\"u\",kb:\"t\",qa:\"p\",Xa:\"pid\",Oa:\"eid\",mb:\"at\"};a.s.Ta=window.location.protocol+\"//www.google.com/_/og/promos/\";a.s.Pa=\"g\";a.s.nb=\"z\";a.s.ya=function(b,c,d,e){var f=null;switch(c){case m.U:f=window.gbar.up.gpd(b,d,!0);break;case m.na:f=window.gbar.up.gcc(e)}return null==f?0:parseInt(f,10)};a.s.Ab=function(b,c,d){return c==m.U?null!=window.gbar.up.gpd(b,d,!0):!1};a.s.ta=function(b,c,d,e,f,h,k,l){var g={};g[a.s.O.qa]=b;g[a.s.O.Qa]=c;g[a.s.O.Ma]=d;g[a.s.O.mb]=e;g[a.s.O.Oa]=f;g[a.s.O.Xa]=1;k&&(g[a.s.O.T]=k);l&&(g[a.s.O.lb]=l);if(h)g[a.s.O.kb]=h;else return google.ml(Error(\"knu\"),!1,{cause:\"Token is not found\"}),null;return g};a.s.Ca=function(b,c,d){if(b){var e=c?a.s.Pa:a.s.nb;c&&d&&(e+=\"?authuser=\"+d);a.v.Hb(b,a.s.Ta+e)}};a.s.tb=function(b,c,d,e,f,h,k){b=a.s.ta(c,b,a.s.pa.ma,a.s.ra.ma,d,f,null,e);a.s.Ca(b,h,k)};a.s.wb=function(b,c,d,e,f,h,k){b=a.s.ta(c,b,a.s.pa.Sa,a.s.ra.oa,d,f,e,null);a.s.Ca(b,h,k)};a.s.Db=function(b,c,d,e,f,h,k,l,g,n){switch(c){case m.na:window.gbar.up.dpc(e,f);break;case m.U:window.gbar.up.spd(b,d,1,!0);break;case m.V:g=g||!1,l=l||\"\",h=h||0,k=k||a.s.R.W,n=n||0,a.s.tb(e,h,k,f,l,g,n)}};a.s.Bb=function(b,c,d,e,f){return c==m.U?0<d&&a.s.ya(b,c,e,f)>=d:!1};a.s.vb=function(b,c,d,e,f,h,k,l,g,n){switch(c){case m.na:window.gbar.up.iic(e,f);break;case m.U:c=a.s.ya(b,c,d,e)+1;window.gbar.up.spd(b,d,c.toString(),!0);break;case m.V:g=g||!1,l=l||\"\",h=h||0,k=k||a.s.R.qa,n=n||0,a.s.wb(e,h,k,1,l,g,n)}};a.s.Cb=function(b,c,d,e,f,h){b=a.s.ta(c,b,a.s.pa.Ua,a.s.ra.ka,d,e,null,null);a.s.Ca(b,f,h)};var p={Jb:\"a\",Mb:\"l\",Kb:\"c\",Na:\"d\",ka:\"h\",oa:\"i\",Wb:\"n\",W:\"x\",Tb:\"ma\",Ub:\"mc\",Vb:\"mi\",Nb:\"pa\",Ob:\"pc\",Qb:\"pi\",Sb:\"pn\",Rb:\"px\",Pb:\"pd\",Xb:\"gpa\",Zb:\"gpi\",$b:\"gpn\",ac:\"gpx\",Yb:\"gpd\"};a.o={};a.o.N={Va:\"hplogo\",jb:\"pmocntr2\"};a.o.R={ab:\"0\",W:\"1\",La:\"2\"};a.o.w=document.getElementById(a.o.N.jb);a.o.Ra=16;a.o.Za=2;a.o.$a=20;google.promos=google.promos||{};google.promos.toast=google.promos.toast||{};a.o.$=function(b){a.o.w&&(a.o.w.style.display=b?\"\":\"none\",a.o.w.parentNode&&(a.o.w.parentNode.style.position=b?\"relative\":\"\"))};a.o.Ka=function(b){try{if(a.o.w&&b&&b.es&&b.es.m){var c=window.gbar.rtl(document.body)?\"left\":\"right\";a.o.w.style[c]=b.es.m-a.o.Ra+a.o.Za+\"px\";a.o.w.style.top=a.o.$a+\"px\"}}catch(d){google.ml(d,!1,{cause:a.o.P+\"_PT\"})}};google.promos.toast.cl=function(){try{a.o.va==m.V&&a.s.Cb(a.o.Aa,a.o.S,a.o.R.La,a.o.Ea,a.o.Ba,a.o.Da),window.gbar.up.sl(a.o.S,a.o.P,p.ka,a.o.wa(),1)}catch(b){google.ml(b,!1,{cause:a.o.P+\"_CL\"})}};google.promos.toast.cpc=function(){try{a.o.w&&(a.o.$(!1),a.s.Db(a.o.w,a.o.va,a.o.N.Ga,a.o.Aa,a.o.qb,a.o.S,a.o.R.W,a.o.Ea,a.o.Ba,a.o.Da),window.gbar.up.sl(a.o.S,a.o.P,p.Na,a.o.wa(),1))}catch(b){google.ml(b,!1,{cause:a.o.P+\"_CPC\"})}};a.o.Ia=function(){try{if(a.o.w){var b=276,c=document.getElementById(a.o.N.Va);c&&(b=Math.max(b,c.offsetWidth));var d=parseInt(a.o.w.style.right,10)||0;a.o.w.style.visibility=2*(a.o.w.offsetWidth+d)+b>document.body.clientWidth?\"hidden\":\"\"}}catch(e){google.ml(e,!1,{cause:a.o.P+\"_HOSW\"})}};a.o.ob=function(){var b=[\"gpd\",\"spd\",\"aeh\",\"sl\"];if(!window.gbar||!window.gbar.up)return!1;for(var c=0,d;d=b[c];c++)if(!(d in window.gbar.up))return!1;return!0};a.o.yb=function(){return a.o.w.currentStyle&&\"absolute\"!=a.o.w.currentStyle.position};google.promos.toast.init=function(b,c,d,e,f,h,k,l,g,n,q,r){try{if(!a.o.ob())google.ml(Error(\"apa\"),!1,{cause:a.o.P+\"_INIT\"});else if(a.o.w)if(e==m.V&&!l==!g)google.ml(Error(\"tku\"),!1,{cause:\"zwieback: \"+g+\", gaia: \"+l}),a.o.$(!1);else if(a.o.N.T=\"toast_count_\"+c+(q?\"_\"+q:\"\"),a.o.N.Ga=\"toast_dp_\"+c+(r?\"_\"+r:\"\"),a.o.P=d,a.o.S=b,a.o.va=e,a.o.Aa=c,a.o.qb=f,a.o.Ea=l?l:g,a.o.Ba=!!l,a.o.Da=k,a.s.Ab(a.o.w,e,a.o.N.Ga,c)||a.s.Bb(a.o.w,e,h,a.o.N.T,c)||a.o.yb())a.o.$(!1);else{a.s.vb(a.o.w,e,a.o.N.T,c,f,a.o.S,a.o.R.ab,a.o.Ea,a.o.Ba,a.o.Da);if(!n){try{window.gbar.up.aeh(window,\"resize\",a.o.Ia)}catch(t){}window.lol=a.o.Ia;window.gbar.elr&&a.o.Ka(window.gbar.elr());window.gbar.elc&&window.gbar.elc(a.o.Ka);a.o.$(!0)}window.gbar.up.sl(a.o.S,a.o.P,p.oa,a.o.wa())}}catch(t){google.ml(t,!1,{cause:a.o.P+\"_INIT\"})}};a.o.wa=function(){var b=a.s.ya(a.o.w,a.o.va,a.o.N.T,a.o.Aa);return\"ic=\"+b};})();</script> <script type=\"text/javascript\">(function(){var sourceWebappPromoID=144002;var sourceWebappGroupID=5;var payloadType=5;var cookieMaxAgeSec=2592000;var dismissalType=5;var impressionCap=25;var gaiaXsrfToken='';var zwbkXsrfToken='';var kansasDismissalEnabled=false;var sessionIndex=0;var invisible=false;window.gbar&&gbar.up&&gbar.up.r&&gbar.up.r(payloadType,function(show){if (show){google.promos.toast.init(sourceWebappPromoID,sourceWebappGroupID,payloadType,dismissalType,cookieMaxAgeSec,impressionCap,sessionIndex,gaiaXsrfToken,zwbkXsrfToken,invisible,'0612');}\n" ;
     i++;
     Testhtml[i] ="});})();</script> </div> </span><br clear=\"all\" id=\"lgpd\"><div id=\"lga\"><img alt=\"Google\" height=\"92\" src=\"/images/branding/googlelogo/1x/googlelogo_white_background_color_272x92dp.png\" style=\"padding:28px 0 14px\" width=\"272\" id=\"hplogo\" onload=\"window.lol&&lol()\"><br><br></div><form action=\"/search\" name=\"f\"><table cellpadding=\"0\" cellspacing=\"0\"><tr valign=\"top\"><td width=\"25%\">&nbsp;</td><td align=\"center\" nowrap=\"\"><input name=\"ie\" value=\"ISO-8859-1\" type=\"hidden\"><input value=\"en\" name=\"hl\" type=\"hidden\"><input name=\"source\" type=\"hidden\" value=\"hp\"><input name=\"biw\" type=\"hidden\"><input name=\"bih\" type=\"hidden\"><div class=\"ds\" style=\"height:32px;margin:4px 0\"><input style=\"color:#000;margin:0;padding:5px 8px 0 6px;vertical-align:top\" autocomplete=\"off\" class=\"lst\" value=\"\" title=\"Google Search\" maxlength=\"2048\" name=\"q\" size=\"57\"></div><br style=\"line-height:0\"><span class=\"ds\"><span class=\"lsbb\"><input class=\"lsb\" value=\"Google Search\" name=\"btnG\" type=\"submit\"></span></span><span class=\"ds\"><span class=\"lsbb\"><input class=\"lsb\" value=\"I'm Feeling Lucky\" name=\"btnI\" onclick=\"if(this.form.q.value)this.checked=1; else top.location='/doodles/'\" type=\"submit\"></span></span></td><td class=\"fl sblc\" align=\"left\" nowrap=\"\" width=\"25%\"><a href=\"/advanced_search?hl=en&amp;authuser=0\">Advanced search</a><a href=\"/language_tools?hl=en&amp;authuser=0\">Language tools</a></td></tr></table><input id=\"gbv\" name=\"gbv\" type=\"hidden\" value=\"1\"></form><div id=\"gac_scont\"></div><div style=\"font-size:83%;min-height:3.5em\"><br></div><span id=\"footer\"><div style=\"font-size:10pt\"><div style=\"margin:19px auto;text-align:center\" id=\"fll\"><a href=\"/intl/en/ads/\">Advertising&nbsp;Programs</a><a href=\"/services/\">Business Solutions</a><a href=\"https://plus.google.com/116899029375914044550\" rel=\"publisher\">+Google</a><a href=\"/intl/en/about.html\">About Google</a></div></div><p style=\"color:#767676;font-size:8pt\">&copy; 2015 - <a href=\"/intl/en/policies/privacy/\">Privacy</a> - <a href=\"/intl/en/policies/terms/\">Terms</a></p></span></center><script>(function(){window.google.cdo={height:0,width:0};(function(){var a=window.innerWidth,b=window.innerHeight;if(!a||!b)var c=window.document,d=\"CSS1Compat\"==c.compatMode?c.documentElement:c.body,a=d.clientWidth,b=d.clientHeight;a&&b&&(a!=google.cdo.width||b!=google.cdo.height)&&google.log(\"\",\"\",\"/client_204?&atyp=i&biw=\"+a+\"&bih=\"+b+\"&ei=\"+google.kEI);})();})();</script><div id=\"xjsd\"></div><div id=\"xjsi\" data-jiis=\"bp\"><script>(function(){function c(b){window.setTimeout(function(){var a=document.createElement(\"script\");a.src=b;document.getElementById(\"xjsd\").appendChild(a)},0)}google.dljp=function(b,a){google.xjsu=b;c(a)};google.dlj=c;})();(function(){window.google.xjsrm=[];})();if(google.y)google.y.first=[];if(!google.xjs){window._=window._||{};window._._DumpException=function(e){throw e};if(google.timers&&google.timers.load.t){google.timers.load.t.xjsls=new Date().getTime();}google.dljp('/xjs/_/js/k\\x3dxjs.hp.en_US.SEu8vvgkWuM.O/m\\x3dsb_he,d/rt\\x3dj/d\\x3d1/t\\x3dzcms/rs\\x3dACT90oHHo3fj0ziCQcdScnwUpZnA1iyYww','/xjs/_/js/k\\x3dxjs.hp.en_US.SEu8vvgkWuM.O/m\\x3dsb_he,d/rt\\x3dj/d\\x3d1/t\\x3dzcms/rs\\x3dACT90oHHo3fj0ziCQcdScnwUpZnA1iyYww');google.xjs=1;}google.pmc={\"sb_he\":{\"agen\":true,\"cgen\":true,\"client\":\"heirloom-hp\",\"dh\":true,\"ds\":\"\",\"fl\":true,\"host\":\"google.com\",\"isbh\":28,\"jam\":0,\"jsonp\":true,\"msgs\":{\"cibl\":\"Clear Search\",\"dym\":\"Did you mean:\",\"lcky\":\"I\\u0026#39;m Feeling Lucky\",\"lml\":\"Learn more\",\"oskt\":\"Input tools\",\"psrc\":\"This search was removed from your \\u003Ca href=\\\"/history\\\"\\u003EWeb History\\u003C/a\\u003E\",\"psrl\":\"Remove\",\"sbit\":\"Search by image\",\"srch\":\"Google Search\"},\"ovr\":{\"spsxb\":1},\"pq\":\"\",\"refoq\":true,\"refpd\":true,\"rfs\":[],\"scd\":10,\"sce\":5,\"stok\":\"DcwkUYND-n308NEFEMxtBVLEbss\"},\"d\":{}};google.y.first.push(function(){if(google.med){google.med('init');google.initHistory();google.med('history');}});if(google.j&&google.j.en&&google.j.xi){window.setTimeout(google.j.xi,0);}\n" ;
     i++;
     Testhtml[i] ="</script></div></body></html>" ;
     
       String actual[] = new String[100];
               actual = PlaylistApp.Connect(2015);
               i = 0 ;
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
               if (actual[i] != null)
               {
                   assertEquals(Testhtml[i] , actual[i]);
                   i++;
               }
     
     }
    
    
    
}
