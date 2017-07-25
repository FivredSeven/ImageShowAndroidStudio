package com.suo.image.img;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

import com.nostra13.universalimageloader.utils.L;
import com.suo.image.bean.ContentBean;
import com.suo.image.util.Log;

import android.content.Context;

public class ImageUrl {

	public Context context;
	public String[] url;
	public String[] url0,url1,url2,url3,url4,url5,url6,url7,url8,url9;
	public String[] url10,url11,url12,url13,url14,url15,url16,url17,url18,url19;
	public String[] url20,url21,url22,url23,url24,url25,url26,url27,url28,url29;
	public String[] url30,url31,url32,url33,url34,url35,url36,url37,url38,url39;
	public String[] url40,url41,url42,url43,url44,url45,url46,url47,url48,url49;
	public String[] url50,url51,url52,url53,url54,url55,url56,url57,url58,url59;
	public String[] url60,url61,url62,url63,url64,url65,url66,url67,url68,url69;
	public String[] url70,url71,url72,url73,url74,url75,url76,url77,url78,url79;
	public String[] url80,url81,url82,url83,url84,url85,url86,url87,url88,url89;
	
	public String[] text;
	public String[] text0,text1,text2,text3,text4,text5,text6,text7,text8,text9;
	public String[] text10,text11,text12,text13,text14,text15,text16,text17,text18,text19;
	public String[] text20,text21,text22,text23,text24,text25,text26,text27,text28,text29;
	public String[] text30,text31,text32,text33,text34,text35,text36,text37,text38,text39;
	public String[] text40,text41,text42,text43,text44,text45,text46,text47,text48,text49;
	public String[] text50,text51,text52,text53,text54,text55,text56,text57,text58,text59;
	public String[] text60,text61,text62,text63,text64,text65,text66,text67,text68,text69;
	public String[] text70,text71,text72,text73,text74,text75,text76,text77,text78,text79;
	public String[] text80,text81,text82,text83,text84,text85,text86,text87,text88,text89;
	private Map<String, Object> map;
	public static int SIZE_OF_PAGE = 10;
	
	
	public ImageUrl(Context context) {
		this.context = context;
		initUrl();
		initText();
//		url = getUrl();
//		text = getText();
	}
	
	public void initUrl()
	{
		url = new String[90];
		url[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=0962c061e61190ef01fb92d7fe1a9df7/6423744f78f0f73623945c8d0b55b319eac4139f.jpg";
		url[1] = "http://imgsrc.baidu.com/forum/w%3D580/sign=5cbacd3951da81cb4ee683c56264d0a4/42a98226cffc1e177b56a9fc4a90f603728de916.jpg";
		url[2] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b331971108fa513d51aa6cd60d6f554c/932743a85edf8db1e9ad7ea90923dd54544e74c7.jpg";
		url[3] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b9aedc051a4c510faec4e212505b2528/ea58e2cad1c8a786f7fd48c36709c93d72cf50eb.jpg";
		url[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=3327ca2658ee3d6d22c687c3732d0e52/3c99c38f8c5494ee9205d6982cf5e0fe98257ed0.jpg";
		url[5] = "http://imgsrc.baidu.com/forum/w%3D580/sign=d17a7f3336d3d539c13d0fcb0a85e927/75e6ba11728b4710a182a201c3cec3fdfd032311.jpg";
		url[6] = "http://imgsrc.baidu.com/forum/w%3D580/sign=094174513c6d55fbc5c6762e5d204f40/04543e540923dd547998bfe7d009b3de9d824819.jpg";
		url[7] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C354%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C362/sign=2c249bdb024f78f0800b9afb490a6925/48039cf81a4c510f0e30e7956159252dd52aa515.jpg";
		url[8] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C482%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C490/sign=de3dc0dea9d3fd1f3609a2320075466f/3944048da9773912efadd691f9198618377ae27b.jpg";
		url[9] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=955577020b46f21fc9345e5bc61f0810/3c99c38f8c5494eeb28036e02cf5e0fe98257e74.jpg";
		
		url[10] = "http://imgsrc.baidu.com/forum/w%3D580/sign=2f0b0931838ba61edfeec827713597cc/2663cf99a9014c08f038275e0b7b02087af4f496.jpg";
		url[11] = "http://imgsrc.baidu.com/forum/w%3D580/sign=d6440f635fdf8db1bc2e7c6c3922dddb/f655c41bb051f8190c3c0db1dbb44aed2f73e7fc.jpg";
		url[12] = "http://imgsrc.baidu.com/forum/w%3D580/sign=e6ab7af45243fbf2c52ca62b807cca1e/5d02a188d43f8794843517d2d31b0ef419d53acf.jpg";
		url[13] = "http://imgsrc.baidu.com/forum/w%3D580/sign=29e34761caef76093c0b99971edca301/c663dc18972bd40710ed90017a899e510eb309ef.jpg";
		url[14] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b3ed46e52cf5e0feee1889096c6234e5/45c5ce014a90f603307fd5bb3812b31bb251edc3.jpg";
		url[15] = "http://imgsrc.baidu.com/forum/w%3D580/sign=3462f3070b46f21fc9345e5bc6256b31/7e7244fa828ba61e4b7b75d34034970a314e5979.jpg";
		url[16] = "http://imgsrc.baidu.com/forum/w%3D580/sign=f226d5f26609c93d07f20effaf3cf8bb/de98deec8a13632759e15dcf908fa0ec09fac782.jpg";
		url[17] = "http://imgsrc.baidu.com/forum/w%3D580/sign=ea5cc14d810a19d8cb03840d03f882c9/e838e92f0708283839d344e8b999a9014d08f13c.jpg";
		url[18] = "http://imgsrc.baidu.com/forum/w%3D580/sign=8d4180051a4c510faec4e21250582528/ea58e2cad1c8a786c31214c36709c93d71cf508e.jpg";
		url[19] = "http://imgsrc.baidu.com/forum/w%3D580/sign=d52258f41e30e924cfa49c397c096e66/8085a2628535e5dd353be02377c6a7efcf1b62fb.jpg";
		url[20] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b35f3388eaf81a4c2632ecc1e72b6029/ff09521f95cad1c818ea7ddb7e3e6709c83d5145.jpg";
		url[21] = "http://imgsrc.baidu.com/forum/w%3D580/sign=acda1d077acb0a4685228b315b62f63e/7379c63533fa828b0637621efc1f4134960a5afb.jpg";
		url[22] = "http://imgsrc.baidu.com/forum/w%3D580/sign=95a406077acb0a4685228b315b62f63e/7379c63533fa828b3f49791efc1f4134960a5aa9.jpg";
		url[23] = "http://imgsrc.baidu.com/forum/w%3D580/sign=eeea40c191ef76c6d0d2fb23ad17fdf6/cc080ff0f736afc37206ad85b219ebc4b645128b.jpg";
		url[24] = "http://imgsrc.baidu.com/forum/w%3D580/sign=7492143fcf1b9d168ac79a69c3dfb4eb/60840e310a55b319e990049542a98226cefc17a8.jpg";
		url[25] = "http://imgsrc.baidu.com/forum/w%3D580/sign=376a1ed14d086e066aa83f43320a7b5a/2856e7ef76c6a7ef41e82ac6fcfaaf51f1de66c8.jpg";
		url[26] = "http://imgsrc.baidu.com/forum/w%3D580/sign=2fdea850d058ccbf1bbcb53229d9bcd4/4846d68b87d6277f022f33da29381f30e824fcdf.jpg";
		url[27] = "http://imgsrc.baidu.com/forum/w%3D580/sign=327bf6d818d8bc3ec60806c2b289a6c8/5168700828381f30b7dece4ba8014c086c06f0d1.jpg";
		url[28] = "http://imgsrc.baidu.com/forum/w%3D580/sign=51f474261ad5ad6eaaf964e2b1c939a3/c3b4a0ca7bcb0a4671f0c4db6a63f6246960afce.jpg";
		url[29] = "http://imgsrc.baidu.com/forum/w%3D580/sign=8c9aae0fa2cc7cd9fa2d34d109002104/298a0c899e510fb32f11c275d833c895d0430c8b.jpg";
		
		url[30] = "http://imgsrc.baidu.com/forum/w%3D580/sign=5b997f20b3119313c743ffb8553a0c10/1b78f094a4c27d1edac18a261ad5ad6edcc43830.jpg";
		url[31] = "http://imgsrc.baidu.com/forum/w%3D580/sign=f7cfd067c8ea15ce41eee00186023a25/379ba600baa1cd11867fccc2b812c8fcc1ce2dcb.jpg";
		url[32] = "http://imgsrc.baidu.com/forum/w%3D580/sign=32065bef71cf3bc7e800cde4e101babd/4554142762d0f703c480323e09fa513d2797c5ee.jpg";
		url[33] = "http://imgsrc.baidu.com/forum/w%3D580/sign=9e2d262942166d223877159c76210945/1213214e9258d10978080850d058ccbf6d814d35.jpg";
		url[34] = "http://imgsrc.baidu.com/forum/w%3D580/sign=d5c5ad55e850352ab16125006342fb1a/07bbb4cec3fdfc037d73415ad53f8794a5c22695.jpg";
		url[35] = "http://imgsrc.baidu.com/forum/w%3D580/sign=4514cefe10dfa9ecfd2e561f52d2f754/4313e3eef01f3a299a32792c9825bc315d607c26.jpg";
		url[36] = "http://imgsrc.baidu.com/forum/w%3D580/sign=050a4bf86159252da3171d0c0499032c/0650083e6709c93dac3ca7159e3df8dcd30054ca.jpg";
		url[37] = "http://imgsrc.baidu.com/forum/w%3D580/sign=f26fd4f608f79052ef1f47363cf1d738/53c5a658ccbf6c8152c18b0dbd3eb13532fa402d.jpg";
		url[38] = "http://imgsrc.baidu.com/forum/w%3D580/sign=fd386629c2cec3fd8b3ea77de689d4b6/9abcc5fb43166d220b608e71472309f79152d28c.jpg";
		url[39] = "http://imgsrc.baidu.com/forum/w%3D580/sign=66a94ed429381f309e198da199004c67/541738c2d56285351d5baecd91ef76c6a6ef636f.jpg";
		
		url[40] = "http://imgsrc.baidu.com/forum/w%3D580/sign=50b73f133ac79f3d8fe1e4388aa0cdbc/ac6015d0f703918f39664726503d269758eec46b.jpg";
		url[41] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=58d63508902397ddd679980c69b9d1c7/1e8fd086c9177f3e5ae7f0e271cf3bc79d3d56d1.jpg";
		url[42] = "http://imgsrc.baidu.com/forum/w%3D580/sign=4b55739521a446237ecaa56aa8237246/1e4ec4de9c82d158eac8505e810a19d8bd3e425a.jpg";
		url[43] = "http://imgsrc.baidu.com/forum/w%3D580/sign=17578cce738b4710ce2ffdc4f3ccc3b2/9e7a519759ee3d6df80df32442166d224d4adeda.jpg";
		url[44] = "http://imgsrc.baidu.com/forum/w%3D580/sign=2e1e56f56159252da3171d0c0499032c/0650083e6709c93d8728ba189e3df8dcd30054cb.jpg";
		url[45] = "http://imgsrc.baidu.com/forum/w%3D580/sign=364a4058e850352ab16125006341fb1a/07bbb4cec3fdfc039efcac57d53f8794a5c22624.jpg";
		url[46] = "http://imgsrc.baidu.com/forum/w%3D580/sign=1faeb5f372f082022d9291377bf9fb8a/f994a239b6003af388628db0342ac65c1238b6ca.jpg";
		url[47] = "http://imgsrc.baidu.com/forum/w%3D580/sign=9fb5fbf6fcfaaf5184e381b7bc5694ed/c512c419ebc4b7451207e4c6cefc1e178b821512.jpg";
		url[48] = "http://imgsrc.baidu.com/forum/w%3D580/sign=daec97ff4034970a47731027a5cbd1c0/a1416a950a7b020809cb603163d9f2d3562cc8ac.jpg";
		url[49] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C648%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C656/sign=a30fcffbb151f819f1250342ea8f299d/f994a239b6003af3a09a95b0342ac65c1138b682.jpg";
		
		url[50] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=f9b5e1b10eb30f24359aec0bf8aeb233/3d58c9096b63f624e95c73d38644ebf81b4ca3a1.jpg";
		url[51] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=4a7c61191b4c510faec4e2125062465d/73762b6034a85edf408941f248540923dc5475a6.jpg";
		url[52] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=216168f8eac4b7453494b71effc77d67/c374f044ebf81a4c7a3b0218d62a6059242da69a.jpg";
		url[53] = "http://imgsrc.baidu.com/forum/w%3D580/sign=ce7fba52ca1349547e1ee86c664f92dd/7f168f198618367a4a147d0e2f738bd4b21ce508.jpg";
		url[54] = "http://imgsrc.baidu.com/forum/w%3D580/sign=d0deb452ca1349547e1ee86c664f92dd/7f168f198618367a54b5730e2f738bd4b21ce5e9.jpg";
		url[55] = "http://imgsrc.baidu.com/forum/w%3D580/sign=34ee902ba686c91708035231f93c70c6/ad9e85d3572c11df08c8cbf0622762d0f603c294.jpg";
		url[56] = "http://imgsrc.baidu.com/forum/w%3D580/sign=9ad0fec6dc54564ee565e43183df9cde/f93dadb44aed2e73585044f98601a18b86d6fa77.jpg";
		url[57] = "http://imgsrc.baidu.com/forum/w%3D580/sign=25fbf3e59345d688a302b2ac94c37dab/a265384a20a44623eff19fb49922720e0df3d7f1.jpg";
		url[58] = "http://imgsrc.baidu.com/forum/w%3D580/sign=a751a4e63bf33a879e6d0012f65d1018/8857ce12c8fcc3ceb195eee59345d688d53f2052.jpg";
		url[59] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=879d9561e850352ab161250063789882/fcbdf58ba61ea8d34071eed2960a304e241f5859.jpg";
		
		url[60] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=3796dfe01c950a7b75354ecc3aea01a9/7df0a7a20cf431adb071c7ef4a36acaf2fdd9809.jpg";
		url[61] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C555%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C563/sign=92b11f09cf1b9d168ac79a69c3e5d7ff/645fe02bd40735fa02bac36f9f510fb30e240862.jpg";
		url[62] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C348%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C356/sign=dfc5c06f9f510fb37819779fe908abe5/8c511a224f4a20a47f2bb21191529822730ed0f3.jpg";
		url[63] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C309%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C317/sign=7a4db48735a85edffa8cfe2b796f6a53/6b483cfbfbedab64c5339017f636afc378311e68.jpg";
		url[64] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C448%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C456/sign=d85e72daf9dcd100cd9cf82942b02460/4846d68b87d6277f7db6eaef29381f30e824fc0e.jpg";
		url[65] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C625%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C633/sign=0a022c566d81800a6ee58906810e508a/8ceef526cffc1e1751d859e84b90f603728de949.jpg";
		url[66] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=9fb8a2408326cffc692abfba893a29e0/d50b260fd9f9d72a48a4c4c4d52a2834369bbbeb.jpg";
		url[67] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=3bdeba6bb3b7d0a27bc90495fbd41579/b0791009c93d70cfad2d7cd4f9dcd100b8a12bd8.jpg";
		url[68] = "http://imgsrc.baidu.com/forum/w%3D580/sign=76853b89024f78f0800b9afb49300a83/091b67385343fbf23f7903feb17eca8064388f5a.jpg";
		url[69] = "http://imgsrc.baidu.com/forum/w%3D580/sign=233705e24afbfbeddc59367748f1f78e/f5c09e50352ac65c69a0f2aefaf2b21192138a0a.jpg";
		
		url[70] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C729%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C737/sign=0d4be7c996dda144da096cba828cb3d2/68c1be177f3e6709c8a106253ac79f3df9dc550a.jpg";
		url[71] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C475%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C483/sign=3acbf82163d9f2d3201124e799d7e963/63e859dda3cc7cd9cc2ff3193801213fb90e91bc.jpg";
		url[72] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=17d6d654472309f7e76fad1a42356f83/3c99c38f8c5494eea883ccd92cf5e0fe98257e11.jpg";
		url[73] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C315%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C323/sign=4dc50e640b7b02080cc93fe952e291a3/b39efa1001e9390102fcabff7aec54e737d19638.jpg";
		url[74] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C240%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C248/sign=4c4405640b7b02080cc93fe952e291a3/ee78cf0e7bec54e7149337dfb8389b504ec26abf.jpg";
		url[75] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C548%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C556/sign=75fc3a6658ee3d6d22c687c3732d0e52/767fec504fc2d562a1f4f92ce61190ef77c66c3e.jpg";
		url[76] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C336%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C344/sign=e2b27840ca1349547e1ee86c6675f128/6423744f78f0f73613ae8cc00b55b319eac41363.jpg";
		url[77] = "http://imgsrc.baidu.com/forum/w%3D580/sign=ebe84ac4adaf2eddd4f149e1bd120102/1b4042fae6cd7b8903b00e410e2442a7db330edf.jpg";
		url[78] = "http://imgsrc.baidu.com/forum/w%3D580/sign=74ac7773810a19d8cb03840d03fb82c9/e838e92f07082838a723f2d6b999a9014d08f18a.jpg";
		url[79] = "http://imgsrc.baidu.com/forum/w%3D580/sign=bfea9dead31b0ef46ce89856edc551a1/5765050e0cf3d7ca60e3eab2f31fbe096a63a9a1.jpg";
		
		url[80] = "http://imgsrc.baidu.com/forum/w%3D580/sign=0917a4f6203fb80e0cd161df06d32ffb/dd54564e9258d109bb200175d058ccbf6d814d31.jpg";
		url[81] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b394add3aa18972ba33a00c2d6cc7b9d/4a90f603738da9775a9017ecb151f8198718e3be.jpg";
		url[82] = "http://imgsrc.baidu.com/forum/w%3D580/sign=f7eeffbceaf81a4c2632ecc1e7286029/d0a20cf431adcbef8dd433ceadaf2edda2cc9f12.jpg";
		url[83] = "http://imgsrc.baidu.com/forum/w%3D580/sign=146557dcbd315c6043956be7bdb3cbe6/70cf3bc79f3df8dc259b7458cc11728b46102851.jpg";
		url[84] = "http://imgsrc.baidu.com/forum/w%3D580/sign=1a14d4f37aec54e741ec1a1689399bfd/9258d109b3de9c82ea73a0426d81800a18d843ec.jpg";
		url[85] = "http://imgsrc.baidu.com/forum/w%3D580/sign=c2bc5dfc4b90f60304b09c4f0913b370/a9ec8a13632762d0bf3d7572a1ec08fa503dc6f8.jpg";
		url[86] = "http://imgsrc.baidu.com/forum/w%3D580/sign=f8c09964023b5bb5bed720f606d1d523/8d1001e93901213f68fad61355e736d12e2e9530.jpg";
		url[87] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b534c00f83025aafd3327ec3cbecab8d/a18b87d6277f9e2f632f9bc71e30e924b999f3e3.jpg";
		url[88] = "http://imgsrc.baidu.com/forum/w%3D580/sign=0bee6ec6a5efce1bea2bc8c29f51f3e8/a61ea8d3fd1f41340c0b284e271f95cad1c85ec5.jpg";
		url[89] = "http://imgsrc.baidu.com/forum/w%3D580/sign=9b1ec7ee3f6d55fbc5c6762e5d234f40/36d3d539b6003af3870e7750372ac65c1038b64e.jpg";
		
		url0 = new String[5];
		url0[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=0962c061e61190ef01fb92d7fe1a9df7/6423744f78f0f73623945c8d0b55b319eac4139f.jpg";
		url0[1] = "http://imgsrc.baidu.com/forum/w%3D580/sign=1b3ba2e6b051f819f1250342eab54a76/09fa513d269759ee1f444406b2fb43166c22dfe2.jpg";
		url0[2] = "http://imgsrc.baidu.com/forum/w%3D580/sign=48166de3d21b0ef46ce89856edc651a1/78310a55b319ebc45b9153548226cffc1f171615.jpg";
		url0[3] = "http://imgsrc.baidu.com/forum/w%3D580/sign=eb01bd93ddc451daf6f60ce386ff52a5/b64543a98226cffceec39a7fb9014a90f703ea16.jpg";
		url0[4] = "http://imgsrc.baidu.com/forum/w%3D580/sign=14cc8720a144ad342ebf878fe0a00c08/b58f8c5494eef01fbfc63d08e0fe9925bd317d28.jpg";
	
		url1 = new String[5];
		url1[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=5cbacd3951da81cb4ee683c56264d0a4/42a98226cffc1e177b56a9fc4a90f603728de916.jpg";
		url1[1] = "http://imgsrc.baidu.com/forum/w%3D580/sign=addb3ed3b9389b5038ffe05ab534e5f1/cdbf6c81800a19d82734a0c833fa828ba71e46c3.jpg";
		url1[2] = "http://imgsrc.baidu.com/forum/w%3D580/sign=a0312787dab44aed594ebeec831d876a/3c6d55fbb2fb43164b0b5eb720a4462308f7d3e2.jpg";
		url1[3] = "http://imgsrc.baidu.com/forum/w%3D580/sign=3858c05f0cf431adbcd243317b34ac0f/2cf5e0fe9925bc31d68f24555edf8db1ca137028.jpg";
		url1[4] = "http://imgsrc.baidu.com/forum/w%3D580/sign=055a5e3fd562853592e0d229a0ee76f2/18d8bc3eb13533fa1c81b7e3a8d3fd1f40345bc3.jpg";

		url2 = new String[5];
		url2[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b331971108fa513d51aa6cd60d6f554c/932743a85edf8db1e9ad7ea90923dd54544e74c7.jpg";
		url2[1] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C238%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C246/sign=875152b57aec54e741ec1a168903f820/1d5c79f41bd5ad6e7baabb6180cb39dbb7fd3cb6.jpg";
		url2[2] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C664%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C672/sign=1337e0fdf31fbe091c5ec31c5b5b6f43/3f584d292df5e0fef1d9568a5d6034a85cdf72c4.jpg";
		url2[3] = "http://imgsrc.baidu.com/forum/w%3D580/sign=ba165ab54a36acaf59e096f44cdb8d03/586ca30735fae6cd0a70b2ed0eb30f2443a70f39.jpg";
		url2[4] = "http://imgsrc.baidu.com/forum/w%3D580/sign=088c856ffc1f4134e0370576151e95c1/834f19061d950a7bac9a56480bd162d9f3d3c953.jpg";
		
		url3 = new String[5];
		url3[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b9aedc051a4c510faec4e212505b2528/ea58e2cad1c8a786f7fd48c36709c93d72cf50eb.jpg";
		url3[1] = "http://imgsrc.baidu.com/forum/w%3D580/sign=52d20eefb31bb0518f24b3200678da77/b94e3c36acaf2edd58694b248d1001e93801932f.jpg";
		url3[2] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C254%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C262/sign=992b7be3d009b3deebbfe460fc840ff1/7c5e9cc4b74543a94d4326471f178a82b80114ad.jpg";
		url3[3] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C346%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C354/sign=b13859a78601a18bf0eb1247ae146478/05c712380cd79123ad314bffac345982b3b78034.jpg";
		url3[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C768%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C776/sign=7651b00ec8ea15ce41eee001863b5983/9909e558d109b3dee9e83ae3cdbf6c81810a4caa.jpg";
		
		url4 = new String[5];
		url4[0] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=3327ca2658ee3d6d22c687c3732d0e52/3c99c38f8c5494ee9205d6982cf5e0fe98257ed0.jpg";
		url4[1] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C330%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C338/sign=5c5eb56e267f9e2f70351d002f0b8a54/feeabcef76094b36517a1c65a2cc7cd98c109d12.jpg";
		url4[2] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C429%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C437/sign=e1e360a100e9390156028d364bd73797/5d02a188d43f879439f890afd31b0ef41ad53af0.jpg";
		url4[3] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C330%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C338/sign=ce217986f9dcd100cd9cf82942b02460/834f19061d950a7bf7ee9d4f0bd162d9f3d3c92f.jpg";
		url4[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=923f037fb64543a9f51bfac42e2ce9f2/d50b260fd9f9d72a417fcd96d52a2834359bbbee.jpg";
		
		url5 = new String[5];
		url5[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=d17a7f3336d3d539c13d0fcb0a85e927/75e6ba11728b4710a182a201c3cec3fdfd032311.jpg";
		url5[1] = "http://imgsrc.baidu.com/forum/w%3D580/sign=1636c9317cd98d1076d40c39113db807/b4cee9510fb30f247a4cb3cec895d143af4b03f4.jpg";
		url5[2] = "http://imgsrc.baidu.com/forum/w%3D580/sign=e2415bb3251f95caa6f592bef9167fc5/cd4f0cf40ad162d987983cd111dfa9ec8b13cd55.jpg";
		url5[3] = "http://imgsrc.baidu.com/forum/w%3D580/sign=18535226b6fd5266a72b3c1c9b1a9799/a42481246b600c331edc80051a4c510fd8f9a11a.jpg";
		url5[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C548%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C556/sign=f5fff36eac6eddc426e7b4f309e0d58d/3d94202c11dfa9ec71188b9c63d0f703908fc1d4.jpg";
	
		url6 = new String[5];
		url6[0] = "http://imgsrc.baidu.com/forum/w%3D580/sign=094174513c6d55fbc5c6762e5d204f40/04543e540923dd547998bfe7d009b3de9d824819.jpg";
		url6[1] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b1c5a969267f9e2f70351d002f31e962/f996582eb9389b505f8cfbdd8435e5dde6116e91.jpg";
		url6[2] = "http://imgsrc.baidu.com/forum/w%3D580/sign=f1958950cf1b9d168ac79a69c3dfb4eb/60840e310a55b3196c9799fa42a98226cefc179e.jpg";
		url6[3] = "http://imgsrc.baidu.com/forum/w%3D580/sign=b0a362b76f061d957d4637304bf50a5d/5fa801c6a7efce1b84b4d345ae51f3deb58f656d.jpg";
		url6[4] = "http://imgsrc.baidu.com/forum/w%3D580/sign=a59fd552aa64034f0fcdc20e9fc27980/fa6db15c1038534315969cae9213b07ecb8088a8.jpg";
		
		url7 = new String[5];
		url7[0] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C354%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C362/sign=2c249bdb024f78f0800b9afb490a6925/48039cf81a4c510f0e30e7956159252dd52aa515.jpg";
		url7[1] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C548%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C556/sign=ebfeb2b518d8bc3ec60806c2b2b0c56e/2483c04543a9822648832ca88b82b9014b90eb43.jpg";
		url7[2] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C403%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C411/sign=52ca3d0c0e2442a7ae0efdade178ce3b/188d0ccb0a46f21f729259dcf7246b600d33ae67.jpg";
		url7[3] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C837%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C845/sign=3125ae3dd058ccbf1bbcb53229e3df4e/3871d8c379310a5531e2d97bb64543a9802610c6.jpg";
		url7[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C379%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C387/sign=2d1a9b6cfc1f4134e03705761524f6ba/d150fd82b9014a907d074032a8773912b21beec8.jpg";
	
		url8 = new String[5];
		url8[0] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C482%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C490/sign=de3dc0dea9d3fd1f3609a2320075466f/3944048da9773912efadd691f9198618377ae27b.jpg";
		url8[1] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C330%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C338/sign=09863d75c8ea15ce41eee001863b5983/32583634970a304e2fa2f30ad0c8a786c8175c01.jpg";
		url8[2] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C405%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C413/sign=dc2781d191ef76c6d0d2fb23ad2d9e8a/fabd91cd7b899e51364969e443a7d933ca950dc6.jpg";
		url8[3] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C554%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C562/sign=4e3ae1d8377adab43dd01b4bbbefd06c/091b67385343fbf20432f4d3b17eca8064388fe8.jpg";
		url8[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C364%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C372/sign=a23326f4960a304e5222a0f2e1f3c4f6/7c5cc751f81986186956bd744bed2e738ad4e6f1.jpg";
		
		url9 = new String[5];
		url9[0] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=955577020b46f21fc9345e5bc61f0810/3c99c38f8c5494eeb28036e02cf5e0fe98257e74.jpg";
		url9[1] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C354%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C362/sign=5b9c91dffcfaaf5184e381b7bc6ff79e/b4cee9510fb30f24d720d5fac995d143ac4b035c.jpg";
		url9[2] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C838%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C846/sign=61370ff25ab5c9ea62f303ebe502d570/5d1fa609b3de9c8284f4c0766d81800a18d84379.jpg";
		url9[3] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C709%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C717/sign=a43a1685500fd9f9a01755611516b75a/42f6bc134954092392965a879358d109b2de4917.jpg";
		url9[4] = "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C763%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C771/sign=0ef747ffadaf2eddd4f149e1bd2b6299/8857ce12c8fcc3cebb03f0ca9345d688d63f20cb.jpg";
	
		url10 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=2f0b0931838ba61edfeec827713597cc/2663cf99a9014c08f038275e0b7b02087af4f496.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=47f615e5b8389b5038ffe05ab534e5f1/bcb7f5025aafa40f3adcc126aa64034f79f019fe.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f246df16e61190ef01fb92d7fe1a9df7/6423744f78f0f736d8b043fa0b55b319eac41342.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=472343fa0b55b3199cf9827d73ab8286/5c54c77eca806538e437abe896dda144ac348230.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bdbbd1331b4c510faec4e212505b2528/ea58e2cad1c8a786f3e845f56609c93d72cf50d6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=90d1309eb219ebc4c0787691b224cf79/7f39bd8065380cd778c3ad16a044ad3458828130.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=0fa4ae25f11f3a295ac8d5c6a927bce3/00bb69178a82b901c960ccc8728da9773b12efc0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=58f9d10fb64543a9f51bfac42e158a7b/aa7f7bd7912397dd4aa497ff5882b2b7d1a28730.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=20a61fe6d52a283443a636036bb7c92e/a84ebe3d70cf3bc7dfc2c217d000baa1cf112ad6.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=706439f05ab5c9ea62f303ebe53bb622/507a8fdcd100baa189ee48404610b912cafc2ed6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=680ea3eebd315c6043956be7bdb3cbe6/3944048da97739123beb8a9af9198618347ae2c0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1d4af32114ce36d3a20483380af13a24/1e47cda1cd11728b01ef83d9c9fcc3cec1fd2cd6.jpg").split("@hj@");
	
		url11 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=d6440f635fdf8db1bc2e7c6c3922dddb/f655c41bb051f8190c3c0db1dbb44aed2f73e7fc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=cd969a8fac345982c58ae59a3cf5310b/9e9df6cb39dbb6fd082debdd0824ab18962b379a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d0d1c815b58f8c54e3d3c5270a282dee/780234a98226cffc6197b149b8014a90f703ea50.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=7afbf836fd039245a1b5e107b795a4a8/8c511a224f4a20a4ff16323c91529822730ed08d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=67eb1b6f472309f7e76fad1a420f0c39/7c99eb82d158ccbf4420bbc118d8bc3eb0354170.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=340e40429f510fb37819779fe931c893/af1e522dd42a2834e65838f05ab5c9ea14cebf13.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1acc2213bd3eb13544c7b7b3961ca8cb/c84f5f381f30e924225f92ca4d086e061c95f71e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8c699b2709fa513d51aa6cd60d6f554c/932743a85edf8db1d6f5729f0823dd54574e743d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e582f14b64380cd7e61ea2e59146ad14/1d5c79f41bd5ad6e88386a1180cb39dbb4fd3ccb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c91e1516a2cc7cd9fa2d34d109002104/298a0c899e510fb36a95796cd833c895d0430c00.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4d8b83c57aec54e741ec1a1689399bfd/07d2a643ad4bd1131f44b9c95bafa40f4afb0503.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=461b759f0823dd542173a760e108b3df/495f417adab44aeda37bb71fb21c8701a08bfbd8.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9e12369eb219ebc4c0787691b227cf79/7f39bd8065380cd77600ab16a044ad34588281f3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2d130f31838ba61edfeec827713597cc/2663cf99a9014c08f220215e0b7b02087af4f4fe.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=42228f159d82d158bb8259b9b00b19d5/7c5bf001a18b87d6b454a2e4060828381e30fdfb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bb7ca4e9730e0cf3a0f74ef33a47f23d/a3c6f70a19d8bc3e9a1b0f31838ba61ea9d34585.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3a950a1a2e2eb938ec6d7afae56385fe/1e5404f082025aafca7d7730faedab64024f1a41.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=002dedc2b2de9c82a665f9875c8080d2/4493c41c8701a18b15a31bb49f2f07082938fe4d.jpg").split("@hj@");
		
		url12 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=e6ab7af45243fbf2c52ca62b807cca1e/5d02a188d43f8794843517d2d31b0ef419d53acf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ecd6a5d79c16fdfad86cc6e6848e8cea/b6767d55b319ebc4fc7c28658326cffc1f171689.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b602c2bb3812b31bc76ccd21b6193674/04a801094b36acafeb52c8007dd98d1000e99c60.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=38d7b60850da81cb4ee683c56267d0a4/c501851fbe096b63639d00ac0d338744eaf8ac0a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=df007e0237d3d539c13d0fcb0a85e927/75e6ba11728b4710aff8a330c2cec3fdfd03233a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=629cc5cd4d086e066aa83f4332097b5a/2856e7ef76c6a7ef141ef1dafcfaaf51f2de66de.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d9c1f29d0eb30f24359aec0bf894d192/ea6aa32a2834349ba1733779c8ea15ce37d3be99.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=583cea58a5c27d1ea5263bcc2bd4adaf/c6b0e7529822720e80f0ba067acb0a46f31fabdc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fc6cb7784bed2e73fce98624b700a16d/425776e93901213f7218162055e736d12e2e95ef.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b125153cf636afc30e0c3f6d8318eb85/9c048cf2b21193130214a74c64380cd790238dbb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e4c59621aa64034f0fcdc20e9fc27980/fa6db15c1038534354ccdfdd9213b07ecb808897.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=13e93cc3d8f9d72a17641015e42b282a/1e8fd086c9177f3e6eaca4f171cf3bc79e3d567d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d237bae66159252da3171d0c0499032c/0650083e6709c93d7b01560b9e3df8dcd0005426.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1091d4f49a504fc2a25fb00dd5dfe7f0/4d452dafa40f4bfbc452c6a8024f78f0f6361817.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3f7e617f0e2442a7ae0efdade142ad95/1b6d5f34349b033bfa9aa72614ce36d3d439bd80.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3f01617f0e2442a7ae0efdade142ad95/1b6d5f34349b033bfae5a72614ce36d3d439bda1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=690798e86a600c33f079dec02a4d5134/32583634970a304e277bfb06d0c8a786c8175cbc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bee611f26609c93d07f20effaf3ff8bb/de98deec8a136327152199cf908fa0ec0afac7c2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6e92e81a267f9e2f70351d002f31e962/f996582eb9389b5080dbbaae8435e5dde6116eea.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=84d1374eb3b7d0a27bc90495fbed760d/f69cc1fd5266d01620c1c5d4962bd40734fa353d.jpg").split("@hj@");
	
		url13 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=29e34761caef76093c0b99971edca301/c663dc18972bd40710ed90017a899e510eb309ef.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=18dfccf49a504fc2a25fb00dd5dfe7f0/4d452dafa40f4bfbcc1cdea8024f78f0f53618c1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=db7aa1e66159252da3171d0c049a032c/0650083e6709c93d724c4d0b9e3df8dcd0005453.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=86576d19ac6eddc426e7b4f309dab6a2/188d0ccb0a46f21f36aa1daff7246b600d33ae7c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=21502c63a50f4bfb8cd09e5c334e788f/f5b44d87e950352a650e66f45243fbf2b3118ba3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a38290017a899e51788e3a1c72a6d990/186d1759252dd42abe4c4257023b5bb5c8eab849.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5d0fd80f78310a55c424defc87444387/7d56e413b07eca80cf017b1b902397dda044838a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ddc5a7da0824ab18e016e13f05fbe69a/c374f044ebf81a4cdeacae35d62a6059242da67c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f1f1fb9895eef01f4d1418cdd0ff99e0/4d61b8fc1e178a82fc7f3d5cf703738da877e857.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=ebd88f10d000baa1ba2c47b37712b9b1/5ec8d7ec08fa513d52722e223c6d55fbb3fbd93e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d12680faaec379317d688621dbc6b784/34b5c5119313b07e635612f40dd7912396dd8c2f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d276c4fd5d6034a829e2b889fb1249d9/bccade773912b31bfb0280d58718367adbb4e1ac.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=0abc4117b7fd5266a72b3c1c9b199799/a42481246b600c330c3393341b4c510fd8f9a148.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2c2fc60f0df3d7ca0cf63f7ec21fbe3c/4f4d6ed8bc3eb13587f7368aa71ea8d3fd1f4493.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0c88325cf703738dde4a0c2a831ab073/1fe57bf431adcbefc38033faadaf2edda2cc9f5a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=8af057bf8ad4b31cf03c94b3b7d7276f/f646563fb80e7bec94fa4f1d2e2eb9389a506bf6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a73ab34c64380cd7e61ea2e59145ad14/1d5c79f41bd5ad6eca80281680cb39dbb7fd3c9c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c061b130c2cec3fd8b3ea77de689d4b6/9abcc5fb43166d2236395968472309f79152d24c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2abba40850da81cb4ee683c56264d0a4/c501851fbe096b6371f112ac0d338744eaf8ac2e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=17484e645fdf8db1bc2e7c6c3922dddb/f655c41bb051f819cd304cb6dbb44aed2f73e7f9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4d6edd23cf1b9d168ac79a69c3dfb4eb/60840e310a55b319d06ccd8942a98226cefc1778.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=a48a7a253801213fcf334ed464e636f8/c06335a7d933c895f8d9d687d01373f08302006a.jpg").split("@hj@");
	
		url14 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=b3ed46e52cf5e0feee1889096c6234e5/45c5ce014a90f603307fd5bb3812b31bb251edc3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8522ef89d788d43ff0a991fa4d1fd2aa/800d57a4462309f7e973e5ee730e0cf3d6cad6f2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f084ac04a686c91708035231f93c70c6/ad9e85d3572c11dfcca2f7df622762d0f603c2a7.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=eb8ccfdd9213b07ebdbd50003cd69113/48d3d3c27d1ed21b1e8a6619ac6eddc450da3f56.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f5bf4d82241f95caa6f592bef9167fc5/cd4f0cf40ad162d990662ae010dfa9ec8b13cd0e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b719cf3742166d223877159c76210945/1213214e9258d109513ce14ed058ccbf6d814d33.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=056a77efdc54564ee565e43183df9cde/f93dadb44aed2e73c7eacdd08601a18b86d6fa97.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e73ffbf9e4dde711e7d243fe97eecef4/34aadc64034f78f0c56bd10f78310a55b2191cb5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=46b259b39f2f07085f052a08d925b865/e069ce389b504fc21406fbf9e4dde71191ef6dbd.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9d5931b2cb8065387beaa41ba7dca115/b259a51b0ef41bd5a3245c0850da81cb38db3d9a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=075939c27aec54e741ec1a1689399bfd/07d2a643ad4bd113559603ce5bafa40f4afb05be.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1228c85cf703738dde4a0c2a831ab073/1fe57bf431adcbefdd20c9faadaf2edda2cc9ffa.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1578b361caef76093c0b99971edca301/c663dc18972bd4072c7664017a899e510eb30964.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b6b81722f11f3a295ac8d5c6a927bce3/00bb69178a82b901707c75cf728da9773b12efc5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ebef149e9922720e7bcee2f24bca0a3a/03f81b81800a19d85e2635f932fa828ba71e46e9.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f1b5200e7c1ed21b79c92eed9d6fddae/5f15ef22720e0cf3a1ebff070b46f21fbf09aaf2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1f0d1694d009b3deebbfe460fcbe6cd3/e134fcd4b31c8701e8c8031a267f9e2f0608ff9c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=14ddbe0b9e3df8dca63d8f99fd1072bf/ad978003918fa0ec6ce8d4f1279759ee3c6ddbe3.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=eb1b149e9922720e7bcee2f24bc90a3a/03f81b81800a19d85ed235f932fa828ba41e46c5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=61fd057dca1349547e1ee86c664f92dd/7f168f198618367ae596c2212f738bd4b21ce5f3.jpg").split("@hj@");
	
		url15 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=3462f3070b46f21fc9345e5bc6256b31/7e7244fa828ba61e4b7b75d34034970a314e5979.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=dbe5fbc54a36acaf59e096f44cd88d03/586ca30735fae6cd6b83139d0eb30f2443a70fda.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2d03ce658326cffc692abfba89004a7d/5e64e0dda144ad34c3c43f7bd1a20cf430ad859f.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c4e6f8c54a36acaf59e096f44cd88d03/586ca30735fae6cd7480109d0eb30f2443a70fd9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=dd384630c2cec3fd8b3ea77de689d4b6/9abcc5fb43166d222b60ae68472309f79152d2fb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fa915944d53f8794d3ff4826e2190ead/efe3312309f79052f0f6fdc20df3d7ca7acbd52d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=7f1db4d394cad1c8d0bbfc2f4f3f67c4/b4b37dd162d9f2d3187f8013a8ec8a136227ccac.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b0b846f38694a4c20a23e7233ef51bac/89647ef790529822143e9e3fd6ca7bcb0b46d481.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=cb9217f9e4dde711e7d243fe97edcef4/34aadc64034f78f0e9c63d0f78310a55b1191cc0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=87f9f137b3fb43161a1f7a7210a54642/c664aa54564e92586b9d17129d82d158cdbf4e6d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3b0d1bc56a63f6241c5d390bb745eb32/6959dfd3fd1f41345e189582241f95cad0c85ee3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=146fad36503d26972ed3085565fab24f/fbef29df8db1cb13fdd7acefdc54564e93584b5c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bba274c5b2de9c82a665f9875c8380d2/4493c41c8701a18bae2c82b39f2f07082a38fecb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=33209d0b9e3df8dca63d8f99fd1372bf/ad978003918fa0ec4b15f7f1279759ee3f6ddbc0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e55b9d4be850352ab16125006342fb1a/07bbb4cec3fdfc034ded7144d53f8794a5c22679.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f34d6030c2cec3fd8b3ea77de689d4b6/9abcc5fb43166d2205158868472309f79152d2b0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ec95079df2deb48ffb69a1d6c01e3aef/2483c04543a98226de93b6db8b82b9014b90eb40.jpg").split("@hj@");
	
		url16 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=f226d5f26609c93d07f20effaf3cf8bb/de98deec8a13632759e15dcf908fa0ec09fac782.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2df832ee730e0cf3a0f74ef33a47f23d/a3c6f70a19d8bc3e0c9f9936838ba61ea9d3457b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bead06632fdda3cc0be4b82831e83905/fabd91cd7b899e51fa28a5e843a7d933c9950d74.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=75f13dc6314e251fe2f7e4f09784c9c2/c53c75087bf40ad1561c581f562c11dfa8ecce1e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c84959d3bf096b6381195e583c328733/4dccd11ea8d3fd1f833b3cc6314e251f94ca5fe0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=46589f645fdf8db1bc2e7c6c3922dddb/f655c41bb051f8199c209db6dbb44aed2f73e789.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=573ae1212f738bd4c421b239918a876c/ceae4e01213fb80ef662ff2b37d12f2eb8389467.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=57c0e1212f738bd4c421b239918a876c/ceae4e01213fb80ef698ff2b37d12f2eb838944d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7c160c23cf1b9d168ac79a69c3dcb4eb/60840e310a55b319e1141c8942a98226cefc1720.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=ebfc6d90113853438ccf8729a311b01f/3344e545d688d43f59420f0e7c1ed21b0ff43b2f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b7cc05208b13632715edc23ba18ea056/3f584d292df5e0fe3f3610fd5d6034a85fdf72ec.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a243d7380bd162d985ee621421dea950/32bdd851f3deb48f2c1f3822f11f3a292cf578a4.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1f9b2ece5bafa40f3cc6ced59b65038c/79474df33a87e95059416a9011385343faf2b444.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=352099e6c75c1038247ececa8210931c/0cba8b039245d688084f2b58a5c27d1ed31b2441.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=554007d4962bd40742c7d3f54b889e9c/24bf6d4c510fd9f98b4ecc95242dd42a2934a4bd.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=8ed5de474610b912bfc1f6f6f3fffcb5/e9d02eee3d6d55fbf13fefda6c224f4a21a4dd1d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e1273d2377c6a7efb926a82ecdfbafe9/b7b78036afc379310c631ed5eac4b74542a9118e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a0962718b21c8701d6b6b2ee177d9e6e/ee78cf0e7bec54e7b83483e2b8389b504ec26a3e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f0ac04bb3812b31bc76ccd21b6193674/04a801094b36acafadfc0e007dd98d1000e99cf2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2a5435ee730e0cf3a0f74ef33a47f23d/a3c6f70a19d8bc3e0b339e36838ba61ea9d345df.jpg").split("@hj@");
	
		url17 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=ea5cc14d810a19d8cb03840d03f882c9/e838e92f0708283839d344e8b999a9014d08f13c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5e1467f171cf3bc7e800cde4e101babd/4554142762d0f703a8920e2009fa513d2797c5f6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=72531eb2cb8065387beaa41ba7dca115/b259a51b0ef41bd54c2e730850da81cb38db3d91.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=72071eb2cb8065387beaa41ba7dca115/b259a51b0ef41bd54c7a730850da81cb38db3ded.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c1b6981fd439b6004dce0fbfd9513526/0256058b4710b9121c846d02c2fdfc0393452249.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=949305a8024f78f0800b9afb49300a83/091b67385343fbf2dd6f3ddfb17eca8064388f57.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f648019df2deb48ffb69a1d6c01e3aef/2483c04543a98226c44eb0db8b82b9014b90eb03.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5ef967f171cf3bc7e800cde4e102babd/4554142762d0f703a87f0e2009fa513d2497c5c1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1b72309d0eb30f24359aec0bf897d192/ea6aa32a2834349b63c0f579c8ea15ce34d3bed4.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=58817f6e0df431adbcd243317b37ac0f/9d21a7160924ab187d1d7bcb34fae6cd7a890b8f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3b0ba33830adcbef01347e0e9cae2e0e/1f517e24ab18972b3fae9a36e7cd7b899f510a7a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=242d319d0eb30f24359aec0bf894d192/ea6aa32a2834349b5c9ff479c8ea15ce37d3be7d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2d91b580500fd9f9a0175561152cd42b/5a8da6c8a786c917b957c8c5c83d70cf3ac757ba.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d55a9617b7fd5266a72b3c1c9b199799/a42481246b600c33d3d544341b4c510fd8f9a162.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8aa0071ffc1f4134e0370576151d95c1/834f19061d950a7b2eb6d4380bd162d9f3d3c917.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=003630f1f9dcd100cd9cf829428947be/3844e68fa0ec08fa6acc895b58ee3d6d57fbdac2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b405b1db8b82b9013dadc33b438fa97e/62732e82b2b7d0a2770d9e61caef760949369aca.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b7462ee306082838680ddc1c8898a964/767fec504fc2d562150c5511e61190ef77c66c8a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=01f92ff1f9dcd100cd9cf829428a47be/3844e68fa0ec08fa6b03965b58ee3d6d54fbda97.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=26ba02dd9213b07ebdbd50003cd69113/48d3d3c27d1ed21bd3bcab19ac6eddc450da3f99.jpg").split("@hj@");
	
		url18 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=8d4180051a4c510faec4e21250582528/ea58e2cad1c8a786c31214c36709c93d71cf508e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=035a87b6dbb44aed594ebeec831d876a/b39efa1001e93901a47d09c27aec54e737d19693.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=34d533eacefc1e17fdbf8c397a91f67c/589ad644ad345982c5cb616e0df431adcaef8455.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bf0c3d9895eef01f4d1418cdd0ff99e0/4d61b8fc1e178a82b282fb5cf703738da877e85c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c74d46cf908fa0ec7fc764051696594a/5662cb315c6034a8fb423c7dca13495408237676.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=48df85645fdf8db1bc2e7c6c3921dddb/f655c41bb051f81992a787b6dbb44aed2f73e710.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=991fbc381ad5ad6eaaf964e2b1ca39a3/c3b4a0ca7bcb0a46b91b0cc56a63f6246a60afdd.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c2579fbf8ad4b31cf03c94b3b7d7276f/f646563fb80e7becdc5d871d2e2eb9389a506b0b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fdc1cef26609c93d07f20effaf3ff8bb/de98deec8a136327560646cf908fa0ec09fac72f.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c2f563ccbba1cd1105b672288913c8b0/6fab7ffa513d269763c78fa154fbb2fb4216d8fa.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=97cd9af41e30e924cfa49c397c0a6e66/8085a2628535e5dd77d4222377c6a7efcf1b621e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=baf4239e9922720e7bcee2f24bca0a3a/03f81b81800a19d80f3d02f932fa828ba71e46dc.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6427893f3b87e9504217f3642039531b/7655bffcc3cec3fd2e242189d788d43f869427f8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=055485b6dbb44aed594ebeec831d876a/b39efa1001e93901a2730bc27aec54e737d196a5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=980978df48540923aa696376a259d1dc/375ef118367adab45f559dbf8ad4b31c8601e409.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3d1217c34afbfbeddc59367748f1f78e/f5c09e50352ac65c7785e08ffaf2b21192138a16.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8d1bc741a8773912c4268569c8188675/feeabcef76094b36d7b79a11a2cc7cd98c109de9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=436419f85882b2b7a79f39cc01accb0a/4e8c4edbb6fd52663236bde8aa18972bd50736f1.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b30f3388eaf81a4c2632ecc1e72b6029/ff09521f95cad1c818ba7ddb7e3e6709c83d5195.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=164cbe99b219ebc4c0787691b227cf79/7f39bd8065380cd7fe5e2311a044ad3458828156.jpg").split("@hj@");
	
		url19 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=d52258f41e30e924cfa49c397c096e66/8085a2628535e5dd353be02377c6a7efcf1b62fb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3d2bf6d4377adab43dd01b4bbbd5b36b/6c8b0bd98d1001e9fc3351f3b90e7bec55e79783.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=25294457023b5bb5bed720f606d2d523/f480e83df8dcd100b7bcbddd738b4710b8122ff5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=0b62238ffaf2b211e42e8546fa816511/19cfa33f8794a4c26644a2d70ff41bd5ac6e39aa.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5f8f7e381ad5ad6eaaf964e2b1ca39a3/c3b4a0ca7bcb0a467f8bcec56a63f6246a60af6d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f45586cf728da9774e2f86238053f872/c3b346adcbef7609f5f3dc632fdda3cc7dd99e1e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b243e611a044ad342ebf878fe0a30c08/128326da81cb39db959d23aad1160924aa1830b0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3264d623cf1b9d168ac79a69c3dfb4eb/60840e310a55b319af66c68942a98226cefc1772.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2215b490113853438ccf8729a312b01f/3344e545d688d43f90abd60e7c1ed21b0ff43b97.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4878f8df622762d0803ea4b790ed0849/f56e5af5e0fe99255da52eac35a85edf8cb1716d.jpg@hj@").split("@hj@");
	
		url20 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=b35f3388eaf81a4c2632ecc1e72b6029/ff09521f95cad1c818ea7ddb7e3e6709c83d5145.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3d2081e6c75c1038247ececa8210931c/0cba8b039245d688004f3358a5c27d1ed31b2441.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a57a7ad79c16fdfad86cc6e6848e8cea/b6767d55b319ebc4b5d0f7658326cffc1f17166d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4f9e2694d009b3deebbfe460fcbd6cd3/e134fcd4b31c8701b85b331a267f9e2f0608ff21.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d96d7f2377094b36db921be593ce7c00/645fe02bd40735fa0e0dcf459f510fb30e240811.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=99cf4936ae51f3dec3b2b96ca4ecf0ec/7c5e9cc4b74543a986ff7b301f178a82b8011429.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=a1c2ad14bd3eb13544c7b7b3961ca8cb/c84f5f381f30e92499511dcd4d086e061c95f719.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c3365e08b64543a9f51bfac42e168a7b/aa7f7bd7912397ddd16b18f85882b2b7d1a28780.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=81d5ec223c6d55fbc5c6762e5d234f40/04543e540923dd54f10c2794d009b3de9d824893.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=340b32cda08b87d65042ab1737092860/b4ab23e736d12f2e3e2f2e9c4ec2d562843568e8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=55482443a1ec08fa260013af69ef3d4d/73762b6034a85edf2ffa7edf48540923dc5475a4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6b4e26dfb17eca80120539efa1229712/6b850a1ed21b0ef4c28a18a2dcc451da80cb3eb0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=be47ce459f510fb37819779fe932c893/af1e522dd42a28346c11b6f75ab5c9ea14cebf5b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f54e01438d5494ee87220f111df4e0e1/8ceef526cffc1e178c120ccd4b90f603728de961.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3f6a11c34afbfbeddc59367748f2f78e/f5c09e50352ac65c75fde68ffaf2b21192138a1e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=688f3f4eb8014a90813e46b599763971/96c5c5b7d0a20cf447357e2377094b36adaf9969.jpg").split("@hj@");
	
		url21 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=acda1d077acb0a4685228b315b62f63e/7379c63533fa828b0637621efc1f4134960a5afb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=245f89db6c224f4a5799731b39f69044/9909e558d109b3de0a261b95cdbf6c81810a4c7e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7600b1060b46f21fc9345e5bc6266b31/7e7244fa828ba61e091937d24034970a314e5924.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9d396d22cf1b9d168ac79a69c3dcb4eb/60840e310a55b319003b7d8842a98226cdfc17d1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8311fb83241f95caa6f592bef9167fc5/cd4f0cf40ad162d9e6c89ce110dfa9ec8b13cdf5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=747db7148c1001e94e3c1407880f7b06/511678b30f2442a70e820358d043ad4bd0130203.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d4f8bb023ac79f3d8fe1e4388aa3cdbc/ac6015d0f703918fbd29c337503d269758eec41f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a9a3680f7c1ed21b79c92eed9d6fddae/5f15ef22720e0cf3f9fdb7060b46f21fbf09aa89.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f07a766ccc11728b302d8c2af8fdc3b3/c7bd263d269759ee1c179936b3fb43166c22df54.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=eb480f30fd039245a1b5e107b795a4a8/8c511a224f4a20a46ea5c53a91529822730ed058.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9e5b100950da81cb4ee683c56267d0a4/c501851fbe096b63c511a6ad0d338744eaf8ac8f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a496407cca1349547e1ee86c664f92dd/7f168f198618367a20fd87202f738bd4b21ce5a4.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=ea87c4e9aa18972ba33a00c2d6cc7b9d/48039cf81a4c510fe3681ae76159252dd52aa563.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ee2e8d648326cffc692abfba89004a7d/5e64e0dda144ad3400e97c7ad1a20cf430ad8545.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e5580d30fd039245a1b5e107b795a4a8/8c511a224f4a20a460b5c73a91529822730ed068.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d58437d48718367aad897fd51e718b68/e19ad4cc7cd98d10643cf6cc203fb80e7aec902f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=45117ddc9213b07ebdbd50003cd59113/48d3d3c27d1ed21bb017d418ac6eddc450da3f3d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=85aac915bd3eb13544c7b7b3961fa8cb/c84f5f381f30e924bd3979cc4d086e061c95f772.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c9addcfe8644ebf86d716437e9fbd736/584d474e251f95ca7305774bc8177f3e66095227.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=711bac148c1001e94e3c1407880c7b06/511678b30f2442a70be41858d043ad4bd0130229.jpg").split("@hj@");
	
		url22 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=95a406077acb0a4685228b315b62f63e/7379c63533fa828b3f49791efc1f4134960a5aa9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6e3a6cc46a63f6241c5d390bb745eb32/6959dfd3fd1f41340b2fe283241f95cad0c85eff.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0d7f194d64380cd7e61ea2e59145ad14/1d5c79f41bd5ad6e60c5821780cb39dbb7fd3cd3.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=dd1f9fc56f061d957d4637304bf50a5d/5fa801c6a7efce1be9082e37ae51f3deb58f65f0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=258ac818ac6eddc426e7b4f309dab6a2/188d0ccb0a46f21f9577b8aef7246b600d33ae50.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=db0c53cca08b87d65042ab1737092860/b4ab23e736d12f2ed1284f9d4ec2d562843568e2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b3c045ee96dda144da096cba82b6d009/6229aac451da81cb86cc62305366d016082431e9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2a14c512a8ec8a13141a57e8c7029157/5ba9871f3a292df59dc64de8bd315c6035a8738a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f2806cc37aec54e741ec1a16893a9bfd/07d2a643ad4bd113a04f56cf5bafa40f4afb0511.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2e8f4af0f9dcd100cd9cf829428a47be/3844e68fa0ec08fa4475f35a58ee3d6d54fbda9a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=07e52fc3622762d0803ea4b790ed0849/f56e5af5e0fe99251238f9b035a85edf8cb171e6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=571a8b0da2cc7cd9fa2d34d109002104/298a0c899e510fb3f491e777d833c895d0430c0a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=8d4f55cf3b292df597c3ac1d8c305ce2/d150fd82b9014a90efa2d65da8773912b21bee7e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7fda39edf9dcd100cd9cf829428a47be/3844e68fa0ec08fa1520804758ee3d6d54fbdaf2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f5b4f593faf2b211e42e8546fa816511/19cfa33f8794a4c2989274cb0ff41bd5ac6e3961.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=36b6e5798326cffc692abfba89034a7d/5e64e0dda144ad34d8711467d1a20cf433ad85c8.jpg").split("@hj@");
	
		url23 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=eeea40c191ef76c6d0d2fb23ad17fdf6/cc080ff0f736afc37206ad85b219ebc4b645128b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ba470e3c8b13632715edc23ba18ea056/3f584d292df5e0fe32bd1be15d6034a85fdf7275.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d46ff9dfd8f9d72a17641015e42b282a/1e8fd086c9177f3ea92a61ed71cf3bc79e3d56f8.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=cce85ed3728da9774e2f86238050f872/c3b346adcbef7609cd4e047f2fdda3cc7dd99e55.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0f971cd03bf33a879e6d0012f65d1018/8857ce12c8fcc3ce195356d39345d688d53f2003.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f7d4da1f3ac79f3d8fe1e4388aa3cdbc/ac6015d0f703918f9e05a22a503d26975beec4c6.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=453798785fdf8db1bc2e7c6c3922dddb/f655c41bb051f8199f4f9aaadbb44aed2f73e7b4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2f77c9e80dd79123e0e0947c9d365917/c1b36cd5ad6eddc4b42d2d1b38dbb6fd506633d4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=dbc3a70163d9f2d3201124e799ed8a53/601684deb48f8c5434d95dcf3b292df5e1fe7f94.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9358e52bb3fb43161a1f7a7210a54642/c664aa54564e92587f3c030e9d82d158cdbf4e8a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fd1eceee6609c93d07f20effaf3cf8bb/de98deec8a13632756d946d3908fa0ec09fac7e6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=905ee42bb3fb43161a1f7a7210a54642/c664aa54564e92587c3a020e9d82d158cdbf4e88.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=dd7afd9a21a446237ecaa56aa8237246/1e4ec4de9c82d1587ce7de51810a19d8bd3e42b5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=37e0123c09fa513d51aa6cd60d6c554c/932743a85edf8db16d7cfb840823dd54574e744c.jpg").split("@hj@");
	
		url24 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=7492143fcf1b9d168ac79a69c3dfb4eb/60840e310a55b319e990049542a98226cefc17a8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c8f1e093faf2b211e42e8546fa826511/19cfa33f8794a4c2a5d761cb0ff41bd5ac6e3926.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e149b90163d9f2d3201124e799ee8a53/601684deb48f8c540e5343cf3b292df5e1fe7f12.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4d38d3d9c83d70cf4cfaaa05c8ddd1ba/66abfd13632762d0c505255fa1ec08fa503dc6db.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8f9bf3f308f79052ef1f47363cf2d738/53c5a658ccbf6c812f35ac08bd3eb13532fa409c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=47319b0da2cc7cd9fa2d34d109002104/298a0c899e510fb3e4baf777d833c895d0430c73.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6a0f25c3b17eca80120539efa1229712/6b850a1ed21b0ef4c3cb1bbedcc451da80cb3ef3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4facd1d9c83d70cf4cfaaa05c8ddd1ba/66abfd13632762d0c791275fa1ec08fa503dc66f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=95f4b8241ad5ad6eaaf964e2b1c939a3/c3b4a0ca7bcb0a46b5f008d96a63f6246960afcc.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=32a835f6cefc1e17fdbf8c397a91f67c/589ad644ad345982c3b667720df431adcaef84de.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d21241f46a600c33f079dec02a4d5134/32583634970a304e9c6e221ad0c8a786c8175c4e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=322c35f6cefc1e17fdbf8c397a91f67c/589ad644ad345982c33267720df431adcaef845a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3f4720f2730e0cf3a0f74ef33a47f23d/a3c6f70a19d8bc3e1e208b2a838ba61ea9d345ea.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9c9eda09f3d3572c66e29cd4ba126352/3c99c38f8c5494ee665082f92cf5e0fe98257eac.jpg").split("@hj@");
	
		url25 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=376a1ed14d086e066aa83f43320a7b5a/2856e7ef76c6a7ef41e82ac6fcfaaf51f1de66c8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=aa5fe9ed279759ee4a5060c382fa434e/9198fab1cb134954ab866584574e9258d0094a7a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c537c8e38644ebf86d716437e9f8d736/584d474e251f95ca7f9f6356c8177f3e660952b4.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=789e0c76472309f7e76fad1a420c0c39/7c99eb82d158ccbf5b55acd818d8bc3eb035412a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6b10f9f82934349b74066e8df9eb1521/067a07cf3bc79f3db6e1fcd2bba1cd11738b2993.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9bce4d8b242dd42a5f0901a333395b2f/b0791009c93d70cf7723b2eff9dcd100bba12b3a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=16d4e92bd62a60595210e1121836342d/68c1be177f3e67098ee6401d3ac79f3df9dc5531.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c3a81f0fa2cc7cd9fa2d34d109002104/298a0c899e510fb360237375d833c895d0430ce5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8b8b3b87b219ebc4c0787691b224cf79/7f39bd8065380cd76399a60fa044ad3458828111.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=384da097d788d43ff0a991fa4d1fd2aa/800d57a4462309f7541caaf0730e0cf3d6cad6ad.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9e8b1ae6359b033b2c88fcd225cf3620/bf884cc79f3df8dc9ba18873cc11728b4610287f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=08f38ee35d6034a829e2b889fb1149d9/bccade773912b31b2187cacb8718367adbb4e135.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9d531be6359b033b2c88fcd225cf3620/bf884cc79f3df8dc98798973cc11728b46102857.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9d531be6359b033b2c88fcd225cf3620/bf884cc79f3df8dc98798973cc11728b46102857.jpg").split("@hj@");
	
		url26 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=2fdea850d058ccbf1bbcb53229d9bcd4/4846d68b87d6277f022f33da29381f30e824fcdf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=78654bec6609c93d07f20effaf3cf8bb/de98deec8a136327d3a2c3d1908fa0ec09fac749.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3b8ca4809922720e7bcee2f24bca0a3a/03f81b81800a19d88e4585e732fa828ba71e4651.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c4a20e159e3df8dca63d8f99fd1072bf/ad978003918fa0ecbc9764ef279759ee3c6ddb4c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=76d1825d8d5494ee87220f111df4e0e1/8ceef526cffc1e170f8d8fd34b90f603728de9ee.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=99ebd1c391ef76c6d0d2fb23ad17fdf6/cc080ff0f736afc305073c87b219ebc4b6451294.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1b546d29b3fb43161a1f7a7210a54642/c664aa54564e9258f7308b0c9d82d158cdbf4e97.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9961eff86159252da3171d0c049a032c/0650083e6709c93d305703159e3df8dcd0005476.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5cf50f01d439b6004dce0fbfd9513526/0256058b4710b91281c7fa1cc2fdfc0393452291.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=e68f383b3801213fcf334ed464e636f8/c06335a7d933c895badc9499d01373f08302007d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4ba1c1cb8718367aad897fd51e718b68/e19ad4cc7cd98d10fa1900d3203fb80e79ec90cf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d3815ddbc83d70cf4cfaaa05c8ded1ba/66abfd13632762d05bbcab5da1ec08fa503dc61e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1db89dcca9d3fd1f3609a232004f25ce/66463b086e061d95954839da7af40ad163d9ca8a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=44047029faedab6474724dc8c737af81/2617422ac65c1038b348c020b3119313b17e89e2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f2122ab235a85edffa8cfe2b795509d8/66304e12b31bb051b63af0ca377adab44bede0fa.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=647653ffd52a283443a636036bb4c92e/a84ebe3d70cf3bc79b128e0ed000baa1cc112a8d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d17b9ff6b999a9013b355b3e2d940a58/4a7292dde71190efb88dd13dcf1b9d16fcfa60a2.jpg").split("@hj@");
	
		url27 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=327bf6d818d8bc3ec60806c2b289a6c8/5168700828381f30b7dece4ba8014c086c06f0d1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=619eeef0730e0cf3a0f74ef33a44f23d/a3c6f70a19d8bc3e40f94528838ba61ea9d34523.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=592e52cd94cad1c8d0bbfc2f4f3f67c4/b4b37dd162d9f2d33e4c660da8ec8a136227ccbf.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=774ea2b08435e5dd902ca5d746c7a7f5/84bc8cedab64034f407c80e4aec379310b551d62.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fcef85cdbf096b6381195e583c328733/4dccd11ea8d3fd1fb79de0d8314e251f94ca5f00.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4f8ada99d01373f0f53f6f97940d4b8b/da8941d3d539b600a43a4d55e850352ac75cb720.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b2365e4558ee3d6d22c687c373176d41/42f6bc13495409233e5f2e9c9358d109b2de49e2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=aa7b15f04e4a20a4311e3ccfa0539847/5d1fa609b3de9c823835b46d6d81800a18d8434c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7f477405902397ddd679980c6983b216/d492da6eddc451da9bb44109b7fd5266d116325d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=dd45e93d77c6a7efb926a82ecdfbafe9/b7b78036afc379313001cacbeac4b74542a911aa.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7cba7505902397ddd679980c6983b216/d492da6eddc451da98494009b7fd5266d1163258.jpg").split("@hj@");
	
		url28 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=51f474261ad5ad6eaaf964e2b1c939a3/c3b4a0ca7bcb0a4671f0c4db6a63f6246960afce.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6dc1f959a71ea8d38a22740ca70b30cf/77dede014c086e0643ae71a903087bf40bd1cb92.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=148e1cdbc83d70cf4cfaaa05c8ddd1ba/66abfd13632762d09cb3ea5da1ec08fa503dc60f.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=13e3679e500fd9f9a0175561152cd42b/5a8da6c8a786c91787251adbc83d70cf3ac757f2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8467b16d6d81800a6ee58906813433d6/4891507f9e2f07087d0762e2e824b899a801f29e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1b8e9616b64543a9f51bfac42e168a7b/aa7f7bd7912397dd09d3d0e65882b2b7d1a28776.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=e178aa187acb0a4685228b315b62f63e/7379c63533fa828b4b95d501fc1f4134960a5a62.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=df4cdbcca9d3fd1f3609a232004c25ce/66463b086e061d9557bc7fda7af40ad163d9ca26.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=21242afe10dfa9ecfd2e561f52d2f754/4313e3eef01f3a29fe029d2c9825bc315e607cd6.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1ba045159e3df8dca63d8f99fd1072bf/ad978003918fa0ec63952fef279759ee3c6ddb4e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=cc79722630adcbef01347e0e9cad2e0e/1f517e24ab18972bc8dc4b28e7cd7b899f510a31.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8313cfaccb8065387beaa41ba7dca115/b259a51b0ef41bd5bd6ea21650da81cb38db3dde.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c272d63e8b13632715edc23ba18ea056/3f584d292df5e0fe4a88c3e35d6034a85fdf720c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c53139f108f79052ef1f47363cf2d738/53c5a658ccbf6c81659f660abd3eb13532fa4074.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2c33b43d77094b36db921be593cd7c00/645fe02bd40735fafb53045b9f510fb30e24087c.jpg").split("@hj@");
	
		url29 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=8c9aae0fa2cc7cd9fa2d34d109002104/298a0c899e510fb32f11c275d833c895d0430c8b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c4202f83f2deb48ffb69a1d6c01d3aef/2483c04543a98226f6269ec58b82b9014b90eb31.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7c82b4032e2eb938ec6d7afae56385fe/1e5404f082025aaf8c6ac929faedab64024f1abb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b7f2163cf11f3a295ac8d5c6a924bce3/00bb69178a82b901713674d1728da9773812ef05.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e7d1b128838ba61edfeec827713697cc/2663cf99a9014c0838e29f470b7b02087af4f43b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a4a253700df431adbcd243317b37ac0f/9d21a7160924ab18813e57d534fae6cd7a890beb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5cf20ec200e9390156028d364bed54f9/c0f4782442a7d933e8be5291ac4bd11372f00181.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=19a13ddb6a63f6241c5d390bb746eb32/6959dfd3fd1f41347cb4b39c241f95cad0c85e1d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e08472d1728da9774e2f86238050f872/c3b346adcbef7609e122287d2fdda3cc7dd99eeb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=0a6c57c90ff41bd5da53e8fc61db81a0/bd497bf3d7ca7bcb7d3477cdbf096b63f724a849.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=23b1ade6359b033b2c88fcd225cf3620/bf884cc79f3df8dc269b3f73cc11728b46102872.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=134652d534fae6cd0cb4ab693fb20f9e/9e48aef9d72a6059a14052f82934349b023bba4c.jpg").split("@hj@");
	
		url30 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=5b997f20b3119313c743ffb8553a0c10/1b78f094a4c27d1edac18a261ad5ad6edcc43830.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=27444d3d77094b36db921be593ce7c00/645fe02bd40735faf024fd5b9f510fb30d2408c7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e27d515ad53f8794d3ff4826e21a0ead/efe3312309f79052e81af5dc0df3d7ca7acbd597.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2a101ff9d50735fa91f04eb1ae500f9f/d50b260fd9f9d72ae151adffd52a2834359bbbe7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fd320de7e4dde711e7d243fe97eecef4/34aadc64034f78f0df66271178310a55b2191cae.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d5a3551650da81cb4ee683c56264d0a4/c501851fbe096b638ee9e3b20d338744eaf8ac2c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=877587f643a7d933bfa8e47b9d49d194/e773439b033b5bb5412c9d1c37d3d539b700bc25.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9433e7f04e4a20a4311e3ccfa0539847/5d1fa609b3de9c82067d466d6d81800a18d84384.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=dbf5be49023b5bb5bed720f606d1d523/f480e83df8dcd100496047c3738b4710b8122f18.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6ffd26bcdcc451daf6f60ce386fc52a5/b48c7d46f21fbe091f4b7df66a600c338644ad87.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7a0a9107ac6eddc426e7b4f309d9b6a2/188d0ccb0a46f21fcaf7e1b1f7246b600e33aedd.jpg").split("@hj@");
	
		url31 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=f7cfd067c8ea15ce41eee00186023a25/379ba600baa1cd11867fccc2b812c8fcc1ce2dcb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1c1dba7fcaef76093c0b99971edfa301/c663dc18972bd40725136d1f7a899e510db309c7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a34c82261ad5ad6eaaf964e2b1ca39a3/c3b4a0ca7bcb0a46834832db6a63f6246a60afb6.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f716e3d41c950a7b75354ecc3ad0625c/b981d0efce1b9d1646e42283f2deb48f8d5464fd.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=301f34ea9a504fc2a25fb00dd5dce7f0/4d452dafa40f4bfbe4dc26b6024f78f0f636188f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=83d20606b21c8701d6b6b2ee177e9e6e/ee78cf0e7bec54e79b70a2fcb8389b504ec26a78.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f6f808e7e4dde711e7d243fe97eecef4/34aadc64034f78f0d4ac221178310a55b2191c70.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9c723dcbeac4b7453494b71efffd1e78/05c712380cd7912301fa2f96ac345982b3b78086.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8fb840c99c16fdfad86cc6e6848e8cea/b6767d55b319ebc49f12cd7b8326cffc1f1716b5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=a3b97c01562c11dfded1bf2b53266255/7bc8fb5494eef01ffb49a327e1fe9925bd317dbf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e119a0a18ad4b31cf03c94b3b7d4276f/f646563fb80e7becff13b8032e2eb93899506bcb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2b11a1fcb8389b5038ffe05ab537e5f1/bcb7f5025aafa40f563b753faa64034f79f0191e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b48b44c148540923aa696376a259d1dc/375ef118367adab473d7a1a18ad4b31c8601e491.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=80bc41c99c16fdfad86cc6e6848e8cea/b6767d55b319ebc49016cc7b8326cffc1f1716a9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=dfbe3b5d8d5494ee87220f111df4e0e1/8ceef526cffc1e17a6e236d34b90f603728de9bf.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3f8646ef71cf3bc7e800cde4e101babd/4554142762d0f703c9002f3e09fa513d2797c56e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8a9879f66a600c33f079dec02a4e5134/32583634970a304ec4e41a18d0c8a786cb175cd2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f937a328838ba61edfeec827713597cc/2663cf99a9014c0826048d470b7b02087af4f4d9.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=28ab10d818d8bc3ec60806c2b28aa6c8/5168700828381f30ad0e284ba8014c086f06f081.jpg").split("@hj@");
	
		url32 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=32065bef71cf3bc7e800cde4e101babd/4554142762d0f703c480323e09fa513d2797c5ee.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4536a8213b87e9504217f3642039531b/7655bffcc3cec3fd0f350097d788d43f86942795.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8839b7ffd52a283443a636036bb4c92e/a84ebe3d70cf3bc7775d6a0ed000baa1cc112abf.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=94af3396ac345982c58ae59a3cf5310b/9e9df6cb39dbb6fd511442c40824ab18962b3748.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=48adf1f563d0f703e6b295d438f85148/e2b297fe9925bc319edea67a5fdf8db1ca13701d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=da38265d8d5494ee87220f111df7e0e1/8ceef526cffc1e17a3642bd34b90f603718de9c5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3108f38b242dd42a5f0901a3333a5b2f/b0791009c93d70cfdde50ceff9dcd100bba12bf9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=34fdf6ea0dd79123e0e0947c9d355917/c1b36cd5ad6eddc4afa7121938dbb6fd5366335c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1da1dfda6f061d957d4637304bf50a5d/5fa801c6a7efce1b29b66e28ae51f3deb58f657f.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=a17e64d1908fa0ec7fc764051696594a/5662cb315c6034a89d711e63ca1349540823760d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b4949fe18644ebf86d716437e9fbd736/584d474e251f95ca0e3c3454c8177f3e650952cb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=65b89c28503d26972ed3085565fab24f/fbef29df8db1cb138c009df1dc54564e93584bab.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=cea20df7bd315c6043956be7bdb0cbe6/3944048da97739129d472483f9198618377ae2b3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=24dda2a8dbb44aed594ebeec831e876a/b39efa1001e9390183fa2cdc7aec54e737d19624.jpg").split("@hj@");
	
		url33 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=9e2d262942166d223877159c76210945/1213214e9258d10978080850d058ccbf6d814d35.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=40e9387d2fdda3cc0be4b82831eb3905/fabd91cd7b899e51046c9bf643a7d933c9950d3d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=df3302f9d50735fa91f04eb1ae500f9f/d50b260fd9f9d72a1472b0ffd52a2834359bbb82.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=59382d4ba8014c08193b28ad3a7a025b/2a9a901190ef76c617f35bc99c16fdfaae5167f3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=cc4b6e3faa64034f0fcdc20e9fc27980/fa6db15c103853437c4227c39213b07ecb80880f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e22d31107c1ed21b79c92eed9d6cddae/5f15ef22720e0cf3b273ee190b46f21fbf09aa10.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=be0e5ec148540923aa696376a25ad1dc/375ef118367adab47952bba18ad4b31c8601e41e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e4ed5d2ec2cec3fd8b3ea77de68ad4b6/9abcc5fb43166d2212b5b576472309f79252d2de.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=834a973b3801213fcf334ed464e636f8/c06335a7d933c895df193b99d01373f0830200b0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b2aef40bf3d3572c66e29cd4ba126352/3c99c38f8c5494ee4860acfb2cf5e0fe98257e5e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8304d910d462853592e0d229a0ee76f2/6b483cfbfbedab641b1bee22f636afc378311eaa.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=88299e2591529822053339cbe7cb7b3b/1e1fbbbf6c81800ad7d22becb03533fa838b47e1.jpg").split("@hj@");
	
		url34 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=d5c5ad55e850352ab16125006342fb1a/07bbb4cec3fdfc037d73415ad53f8794a5c22695.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f17960e4aec379317d688621dbc5b784/34b5c5119313b07e4309f2ea0dd7912396dd8c60.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=88bc9e2591529822053339cbe7cb7b3b/1e1fbbbf6c81800ad7472becb03533fa838b477e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=cb57c6ef279759ee4a5060c382fa434e/9198fab1cb134954ca8e4a86574e9258d0094a0c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9082148695eef01f4d1418cdd0ff99e0/4d61b8fc1e178a829d0cd242f703738da877e8ec.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2775d329faedab6474724dc8c737af81/2617422ac65c1038d0396320b3119313b17e8951.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=618feb5fa8773912c4268569c8188675/feeabcef76094b363b23b60fa2cc7cd98c109d63.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c526451650da81cb4ee683c56267d0a4/c501851fbe096b639e6cf3b20d338744eaf8aca7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=de4dfa02f603918fd7d13dc2613c264b/2fb9ee25bc315c6089c2c60d8cb1cb1348547741.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=28ca51ef71cf3bc7e800cde4e102babd/4554142762d0f703de4c383e09fa513d2797c51a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e4193101fc1f4134e0370576151e95c1/834f19061d950a7b400fe2260bd162d9f3d3c9e6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=cc3bad49023b5bb5bed720f606d2d523/f480e83df8dcd1005eae54c3738b4710b8122fee.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=cfbbefdb4a36acaf59e096f44cd88d03/586ca30735fae6cd7fdd07830eb30f2443a70faa.jpg").split("@hj@");
	
		url35 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=4514cefe10dfa9ecfd2e561f52d2f754/4313e3eef01f3a299a32792c9825bc315d607c26.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=575519d818d8bc3ec60806c2b289a6c8/5168700828381f30d2f0214ba8014c086f06f02b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bee590f6aa18972ba33a00c2d6cf7b9d/48039cf81a4c510fb70a4ef86159252dd62aa5ca.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bc4d503814ce36d3a20483380af13a24/1e47cda1cd11728ba0e820c0c9fcc3cec1fd2cd7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0731aff8c75c1038247ececa8210931c/0cba8b039245d6883a5e1d46a5c27d1ed31b24b8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f59a0bf196dda144da096cba82b6d009/6229aac451da81cbc0962c2f5366d016082431ac.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=ea8767cd4034970a47731027a5cbd1c0/a1416a950a7b020839a0900363d9f2d3562cc8ab.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9a9ba7bf54fbb2fb342b581a7f4b2043/86137e23dd54564e512d4bdbb2de9c82d0584f54.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6b6905eff9dcd100cd9cf829428a47be/3844e68fa0ec08fa0193bc4558ee3d6d54fbda0d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9a77a7bf54fbb2fb342b581a7f4b2043/86137e23dd54564e51c14bdbb2de9c82d0584f70.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fd1f7dc391ef76c6d0d2fb23ad14fdf6/cc080ff0f736afc361f39087b219ebc4b6451218.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c174caddd8f9d72a17641015e42b282a/1e8fd086c9177f3ebc3152ef71cf3bc79e3d5697.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=a1204adbb2de9c82a665f9875c8080d2/4493c41c8701a18bb4aebcad9f2f07082938fe57.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3fcea2c0b21bb0518f24b3200678da77/b94e3c36acaf2edd3575e70b8c1001e938019310.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a6680e97d788d43ff0a991fa4d1fd2aa/800d57a4462309f7ca3904f0730e0cf3d6cad642.jpg").split("@hj@");
	
		url36 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=050a4bf86159252da3171d0c0499032c/0650083e6709c93dac3ca7159e3df8dcd30054ca.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9bb361d19345d688a302b2ac94c37dab/a265384a20a4462351b90d809922720e0df3d7ad.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bf7f21e35d6034a829e2b889fb1249d9/bccade773912b31b960b65cb8718367adbb4e1b1.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2de154ef71cf3bc7e800cde4e102babd/4554142762d0f703db673d3e09fa513d2497c5c7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b35c6d0cb58f8c54e3d3c5270a282dee/780234a98226cffc021a1450b8014a90f703eaec.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3bc0b1fcb8389b5038ffe05ab534e5f1/bcb7f5025aafa40f46ea653faa64034f79f019ef.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b6fd4fd2bba1cd1105b672288913c8b0/6fab7ffa513d269717cfa3bf54fbb2fb4216d8f8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=142b27c0c9fcc3ceb4c0c93ba244d6b7/f22a22fbb2fb43163e19d19821a4462308f7d392.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=98f8c73c3c6d55fbc5c6762e5d234f40/04543e540923dd54e8210c8ad009b3de9d82484e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=0667a7d3203fb80e0cd161df06d02ffb/8de0ae33c895d143aac54fc172f082025baf076c.jpg").split("@hj@");
	
		url37 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=f26fd4f608f79052ef1f47363cf1d738/53c5a658ccbf6c8152c18b0dbd3eb13532fa402d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=31964e81574e9258a63486e6ac80d1d1/15f33ded2e738bd48ba914d4a08b87d6267ff917.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=95444e614bed2e73fce98624b700a16d/425776e93901213f1b30ef3955e736d12e2e9598.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f4e99c80b219ebc4c0787691b224cf79/7f39bd8065380cd71cfb0108a044ad3458828132.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2540bd99500fd9f9a0175561152fd42b/5a8da6c8a786c917b186c0dcc83d70cf3ac75712.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=41699c7d5fdf8db1bc2e7c6c3922dddb/f655c41bb051f8199b119eafdbb44aed2f73e7e3.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b27d6040d043ad4ba62e46c8b2035a89/94f2beea15ce36d3be771ed53bf33a87e850b1a8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c8afe9e1960a304e5222a0f2e1c9a7c3/d2d27d7b02087bf43f61ca0cf3d3572c10dfcf0a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ec704ec491ef76c6d0d2fb23ad17fdf6/cc080ff0f736afc3709ca380b219ebc4b645120e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=34b3edc5b812c8fcb4f3f6c5cc0292b4/96a94a6d55fbb2fb052ec7f74e4a20a44723dc92.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b1d119ceb151f819f1250342eab64a76/8471dbaf2edda3ccf41a27c500e93901203f9225.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e4ff3af696dda144da096cba82b6d009/6229aac451da81cbd1f31d285366d01608243182.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3ff92ef3cefc1e17fdbf8c397a91f67c/589ad644ad345982cee77c770df431adcaef84aa.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2eb4f20a8cb1cb133e693c1bed5556da/7c5cc751f81986182c6676614bed2e738ad4e6fe.jpg").split("@hj@");
	
		url38 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=fd386629c2cec3fd8b3ea77de689d4b6/9abcc5fb43166d220b608e71472309f79152d28c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6dc8a1f143a7d933bfa8e47b9d4ad194/e773439b033b5bb5ab91bb1b37d3d539b700bc5d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=329d10dc6a63f6241c5d390bb745eb32/6959dfd3fd1f413457889e9b241f95cad0c85e64.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6d5ca1f143a7d933bfa8e47b9d49d194/e773439b033b5bb5ab05bb1b37d3d539b400bcc9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7e3c29cd377adab43dd01b4bbbd5b36b/6c8b0bd98d1001e9bf248eeab90e7bec55e79787.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c6a8a593f31fbe091c5ec31c5b610c30/fcbdf58ba61ea8d3407ceee1960a304e241f5845.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=8634a5ae03087bf47dec57e1c2d2575e/015cea16fdfaaf51687f1b5a8d5494eef11f7a7b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=86c5a302902397ddd679980c6980b216/d492da6eddc451da6236960eb7fd5266d21632df.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=712c0e91ac345982c58ae59a3cf6310b/9e9df6cb39dbb6fdb4977fc30824ab18952b37cb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5b3e60770df431adbcd243317b37ac0f/9d21a7160924ab187ea264d234fae6cd7a890b63.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6eb3f272d833c895a67e9873e1127397/fbdc743b5bb5c9ea74598606d439b6003bf3b371.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c7168606d439b6004dce0fbfd9523526/0256058b4710b9121a24731bc2fdfc0393452232.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d43508ed9a504fc2a25fb00dd5dce7f0/4d452dafa40f4bfb00f61ab1024f78f0f63618fd.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6ea857187a899e51788e3a1c72a6d990/186d1759252dd42a7366854e023b5bb5c8eab8b4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=dfd3e0dad8f9d72a17641015e42b282a/1e8fd086c9177f3ea29678e871cf3bc79e3d5679.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4e34c93955e736d158138c00ab514ffc/1e04da4bd11373f07438e87aa50f4bfbfaed049c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=91d1e72eb3fb43161a1f7a7210a64642/c664aa54564e92587db5010b9d82d158cdbf4e1e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=74c2143acf1b9d168ac79a69c3dfb4eb/60840e310a55b319e9c0049042a98226cefc17e5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=8df6872fe7cd7b89e96c3a8b3f264291/16bea02a6059252d8ddb9ae1359b033b59b5b9cb.jpg").split("@hj@");
	
		url39 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=66a94ed429381f309e198da199004c67/541738c2d56285351d5baecd91ef76c6a6ef636f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6f29b5df9345d688a302b2ac94c07dab/a265384a20a44623a523d98e9922720e0df3d73d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=15ec37c2d31b0ef46ce89856edc551a1/5765050e0cf3d7cacae5409af31fbe096a63a997.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4867ed5ac8177f3e1034fc0540cd3bb9/3d94202c11dfa9ec13bc29fb63d0f703908fc110.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a49265af8ad4b31cf03c94b3b7d7276f/f646563fb80e7becba987d0d2e2eb9389a506b60.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7dd5f3d27aec54e741ec1a16893a9bfd/07d2a643ad4bd1132f1ac9de5bafa40f49fb05ca.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=39c59a54d53f8794d3ff4826e21a0ead/efe3312309f7905233a23ed20df3d7ca7acbd561.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f8723a1aa6efce1bea2bc8c29f50f3e8/3871d8c379310a55db84a718b64543a983261005.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6a1a4ad429381f309e198da199004c67/541738c2d562853511e8aacd91ef76c6a6ef639e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1f04c8c4377adab43dd01b4bbbd5b36b/6c8b0bd98d1001e9de1c6fe3b90e7bec55e79786.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=664afdc08601a18bf0eb1247ae2e0761/77490cec54e736d1c2b0f7e49a504fc2d4626907.jpg").split("@hj@");
	
		url40 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=50b73f133ac79f3d8fe1e4388aa0cdbc/ac6015d0f703918f39664726503d269758eec46b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9711e08df2deb48ffb69a1d6c01d3aef/2483c04543a98226a51751cb8b82b9014890ebd4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b30118880823dd542173a760e108b3df/495f417adab44aed5661da08b21c8701a08bfbf3.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6c3f70e3b90e7bec23da03e91f2fb9fa/1674bf95d143ad4b842d222c83025aafa50f06a6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8e47b7117a899e51788e3a1c72a5d990/186d1759252dd42a93896547023b5bb5c8eab826.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f85129280bd162d985ee621421dea950/32bdd851f3deb48f760dc632f11f3a292cf578ba.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=317e5bffdc54564ee565e43183df9cde/f93dadb44aed2e73f3fee1c08601a18b86d6fa8b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f71f847e0df431adbcd243317b37ac0f/9d21a7160924ab18d28380db34fae6cd7a890b08.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6de572a39f2f07085f052a08d925b865/e069ce389b504fc23f51d0e9e4dde71191ef6d9c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=abd8e6029d82d158bb8259b9b00819d5/7c5bf001a18b87d65daecbf3060828381e30fd32.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f0b8bcf8b999a9013b355b3e2d940a58/4a7292dde71190ef994ef233cf1b9d16fcfa6069.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=570ddfcf622762d0803ea4b790ee0849/f56e5af5e0fe992542d009bc35a85edf8fb171c2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=7fbdf7cf622762d0803ea4b790ed0849/f56e5af5e0fe99256a6021bc35a85edf8cb171b2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=534ad21f78310a55c424defc87444387/7d56e413b07eca80c144710b902397dda0448365.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bee8c47dcc11728b302d8c2af8fec3b3/c7bd263d269759ee52852b27b3fb43166f22dfc9.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1e0af80a267f9e2f70351d002f31e962/f996582eb9389b50f043aabe8435e5dde6116e62.jpg").split("@hj@");
		
		url41 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=58d63508902397ddd679980c69b9d1c7/1e8fd086c9177f3e5ae7f0e271cf3bc79d3d56d1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C225%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C233/sign=d1448aa1cb8065387beaa41ba7e6c234/bf884cc79f3df8dc9357807ecc11728b461028ba.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C518%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C526/sign=ee36bad518d8bc3ec60806c2b2b0c56e/4d61b8fc1e178a823bb6704ff703738da877e81b.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C319%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C327/sign=9585b9f9cefc1e17fdbf8c397aab9573/fbdc743b5bb5c9eac3e20d0cd439b6003bf3b390.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C303%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C311/sign=af4196b1dcc451daf6f60ce386c63116/e9d02eee3d6d55fb066f78c96c224f4a21a4dd78.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C716%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C724/sign=e4fb8ddf3bf33a879e6d0012f6677348/fcbdf58ba61ea8d3ccdd7aeb960a304e241f582d.jpg").split("@hj@");
		
		url42 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=4b55739521a446237ecaa56aa8237246/1e4ec4de9c82d158eac8505e810a19d8bd3e425a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2db30f25838ba61edfeec827713597cc/2663cf99a9014c08f280214a0b7b02087af4f46a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b439a0c9fcfaaf5184e381b7bc5594ed/c512c419ebc4b745398bbff9cefc1e178b82158d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=86d4e18b574e9258a63486e6ac80d1d1/15f33ded2e738bd43cebbbdea08b87d6257ff9db.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C223%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C231/sign=5e4442e16609c93d07f20effaf069bac/5168700828381f307e778546a8014c086f06f0bf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8cc456bcf7246b607b0eb27cdbfa1a35/67948a1f4134970a028318c094cad1c8a6865d30.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=db730a775fdf8db1bc2e7c6c3922dddb/f655c41bb051f819010b08a5dbb44aed2f73e7ff.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=645da7fabd315c6043956be7bdb0cbe6/3944048da977391237b88e8ef9198618377ae20f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5edab809267f9e2f70351d002f31e962/f996582eb9389b50b093eabd8435e5dde6116ebd.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4f50e3137dd98d1076d40c39113eb807/b4cee9510fb30f24232a99ecc995d143ac4b0370.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ed91f946a8014c08193b28ad3a79025b/2a9a901190ef76c6a35a8fc49c16fdfaae516718.jpg").split("@hj@");
		
		url43 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=17578cce738b4710ce2ffdc4f3ccc3b2/9e7a519759ee3d6df80df32442166d224d4adeda.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=64269b26d62a60595210e1121835342d/68c1be177f3e6709fc1432103ac79f3df9dc5594.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6b9e893077094b36db921be593cd7c00/645fe02bd40735fabcfe39569f510fb30e24089e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=afc377f5c75c1038247ececa8210931c/0cba8b039245d68892acc54ba5c27d1ed31b247e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f67cd731f11f3a295ac8d5c6a924bce3/00bb69178a82b90130b8b5dc728da9773812ef94.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f2d4eeeb5882b2b7a79f39cc01accb0a/4e8c4edbb6fd526683864afbaa18972bd5073673.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=84fb26e70dd79123e0e0947c9d355917/c1b36cd5ad6eddc41fa1c21438dbb6fd53663366.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=402379b254fbb2fb342b581a7f482043/86137e23dd54564e8b9595d6b2de9c82d0584f30.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=852026f863d0f703e6b295d438fb5148/e2b297fe9925bc31535371775fdf8db1ca13709e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3ff07c04b7fd5266a72b3c1c9b199799/a42481246b600c33397fae271b4c510fd8f9a1a7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9a5bf5ccb17eca80120539efa1229712/6b850a1ed21b0ef4339fcbb1dcc451da80cb3eb5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=94f24602a2cc7cd9fa2d34d109002104/298a0c899e510fb337792a78d833c895d0430c40.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=cd5d8c02e61190ef01fb92d7fe1a9df7/6423744f78f0f736e7ab10ee0b55b319eac4134b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ab40208b0823dd542173a760e108b3df/495f417adab44aed4e20e20bb21c8701a08bfbbf.jpg").split("@hj@");
		
		url44 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=2e1e56f56159252da3171d0c0499032c/0650083e6709c93d8728ba189e3df8dcd30054cb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6d08c2c96c224f4a5799731b39f59044/9909e558d109b3de43715087cdbf6c81820a4cdf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=40485f8b574e9258a63486e6ac83d1d1/15f33ded2e738bd4fa7705dea08b87d6267ff957.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1bbbe5d6c83d70cf4cfaaa05c8ddd1ba/66abfd13632762d093861350a1ec08fa503dc669.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b1bfad02a2cc7cd9fa2d34d109002104/298a0c899e510fb31234c178d833c895d0430cf3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1a6ea2e0b90e7bec23da03e91f2fb9fa/1674bf95d143ad4bf27cf02f83025aafa50f0652.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5c411ce2f9dcd100cd9cf829428a47be/3844e68fa0ec08fa36bba54858ee3d6d54fbda6a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=05bb56c40ff41bd5da53e8fc61db81a0/bd497bf3d7ca7bcb72e376c0bf096b63f724a809.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c5d031508d5494ee87220f111df4e0e1/8ceef526cffc1e17bc8c3cde4b90f603728de9f2.jpg").split("@hj@");
		
		url45 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=364a4058e850352ab16125006341fb1a/07bbb4cec3fdfc039efcac57d53f8794a5c22624.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7a1bafbd8435e5dd902ca5d746c4a7f5/84bc8cedab64034f4d298de9aec3793108551dc4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0bb8314ff703738dde4a0c2a8319b073/1fe57bf431adcbefc4b030e9adaf2edda2cc9f25.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=cc94c8508d5494ee87220f111df4e0e1/8ceef526cffc1e17b5c8c5de4b90f603728de9b6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C377%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C385/sign=b4f8722b1ad5ad6eaaf964e2b1f05aab/ad9e85d3572c11dfcf0ff6cc622762d0f503c2cf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a74f8325ae51f3dec3b2b96ca4eff0ec/7c5e9cc4b74543a9b87fb1231f178a82b8011444.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=905529919358d109c4e3a9bae159ccd0/85aa59738bd4b31cca00de5486d6277f9f2ff8ed.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=cc8218fabd315c6043956be7bd8aa863/95e8d30f4bfbfbed8718829079f0f736aec31f67.jpg").split("@hj@");
		
		url46 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=1faeb5f372f082022d9291377bf9fb8a/f994a239b6003af388628db0342ac65c1238b6ca.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=93af92e3908fa0ec7fc764051696594a/5662cb315c6034a8afa0e851ca1349540823766c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=aa95cef8962bd40742c7d3f54b8b9e9c/24bf6d4c510fd9f9749b05b9242dd42a2934a41e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4fe92ed6adaf2eddd4f149e1bd120102/1b4042fae6cd7b89a7b16a530e2442a7db330ecc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3a22544dcaef76093c0b99971edfa301/c663dc18972bd407032c832d7a899e510eb3093a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=645005c763d0f703e6b295d438fb5148/e2b297fe9925bc31b22352485fdf8db1ca1370a8.jpg").split("@hj@");
		
		url47 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=9fb5fbf6fcfaaf5184e381b7bc5694ed/c512c419ebc4b7451207e4c6cefc1e178b821512.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=415a1d699f510fb37819779fe932c893/af1e522dd42a2834930c65db5ab5c9ea14cebf04.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=135bc2227c1ed21b79c92eed9d6cddae/5f15ef22720e0cf343051d2b0b46f21fbf09aa3c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=41672cd6adaf2eddd4f149e1bd110102/1b4042fae6cd7b89a93f68530e2442a7d8330e52.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1b1b30cc10dfa9ecfd2e561f52d2f754/4313e3eef01f3a29c43d871e9825bc315d607c35.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8b1183181b4c510faec4e21250582528/ea58e2cad1c8a786c54217de6609c93d71cf50b9.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=e89eccef4afbfbeddc59367748f1f78e/f5c09e50352ac65ca2093ba3faf2b21192138a9e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=14ca39efd8f9d72a17641015e42b282a/1e8fd086c9177f3e698fa1dd71cf3bc79e3d566a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=980d7335ac6eddc426e7b4f309d9b6a2/188d0ccb0a46f21f28f00383f7246b600e33aee6.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=041b48dfb90e7bec23da03e91f2fb9fa/1674bf95d143ad4bec091a1083025aafa50f0686.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f098dafbb151f819f1250342eab54a76/8471dbaf2edda3ccb553e4f000e93901203f9277.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6cfad0d89a504fc2a25fb00dd5dfe7f0/4d452dafa40f4bfbb839c284024f78f0f6361838.jpg").split("@hj@");
		
		url48 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=daec97ff4034970a47731027a5cbd1c0/a1416a950a7b020809cb603163d9f2d3562cc8ac.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=486196e39345d688a302b2ac94c37dab/a265384a20a44623826bfab29922720e0df3d701.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=775bd857d1a20cf44690fed7460b4b0c/79ba2566d016092485c1fdcbd50735fae4cd34c5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bc403dae9358d109c4e3a9bae159ccd0/85aa59738bd4b31ce615ca6b86d6277f9f2ff8f9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=187868af79f0f736d8fe4c093a54b382/df7f2443fbf2b211200fdb9ecb8065380dd78e81.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C403%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C411/sign=34bad8fc8601a18bf0eb1247ae146478/62732e82b2b7d0a2b39a5a4dcaef76094a369a53.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C478%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C486/sign=6704e6f000e9390156028d364bd73797/07bbb4cec3fdfc038998bd68d53f8794a6c226c1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=9cff86e39345d688a302b2ac94f91e6e/77dede014c086e064297709b03087bf40bd1cbef.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=3a85a7b4574e9258a63486e6acb9b228/95e8d30f4bfbfbed98c279af79f0f736aec31f0a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C560%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C568/sign=e9eb8cd6aec379317d688621dbffd435/186d1759252dd42ab92f4f7b023b5bb5c8eab880.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C354%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C362/sign=06f1e5b10eb30f24359aec0bf8aeb233/89647ef7905298220f767713d6ca7bcb0b46d465.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=f61a1761810a19d8cb03840d03c1e1fb/60840e310a55b319d161cca542a98226cefc1709.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=0f5b4a4dcaef76093c0b99971ee6c0bc/507a8fdcd100baa1cebe096b4610b912c9fc2e13.jpg").split("@hj@");
		
		url49 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C648%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C656/sign=a30fcffbb151f819f1250342ea8f299d/f994a239b6003af3a09a95b0342ac65c1138b682.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C734%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C742/sign=7c8b59ff94cad1c8d0bbfc2f4f050479/375ef118367adab4062852938ad4b31c8601e42a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=a392be1dfd039245a1b5e107b7afc7b2/d2d27d7b02087bf46a8d1f39f3d3572c10dfcf41.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=fd6b13e61c950a7b75354ecc3aea01a9/c3b346adcbef7609fa55d14f2fdda3cc7dd99e48.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=c1d06438bd3eb13544c7b7b39625cba3/d150fd82b9014a90b7d90e6da8773912b11beec7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C592%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C600/sign=8b9a3f47d833c895a67e9873e1281080/3d58c9096b63f624efde71d38644ebf81b4ca323.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C480%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C488/sign=9ada02de6609c93d07f20effaf069bac/4846d68b87d6277fcde27ae829381f30e824fc32.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=b05770141ad5ad6eaaf964e2b1f05aab/b4b37dd162d9f2d335606f3fa8ec8a136227ccb1.jpg").split("@hj@");
	
		url50 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=f9b5e1b10eb30f24359aec0bf8aeb233/3d58c9096b63f624e95c73d38644ebf81b4ca3a1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=92ceccf9eac4b7453494b71effc77d67/1a7ec1003af33a8771cb4acac75c10385243b500.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=e8b94df1738b4710ce2ffdc4f3f5a08d/4891507f9e2f07087a209fd0e824b899a801f285.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=e77f4c5f6d81800a6ee58906810e508a/b6767d55b319ebc48162c3498326cffc1f17168b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=1299b5cac75c1038247ececa822af063/067a07cf3bc79f3d031551e0bba1cd11738b2936.jpg").split("@hj@");
		
		url51 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=4a7c61191b4c510faec4e2125062465d/73762b6034a85edf408941f248540923dc5475a6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C354%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C362/sign=7faf1deb314e251fe2f7e4f097bdaa67/375ef118367adab47476a4928ad4b31c8601e401.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C364%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C372/sign=e7819b3ea8ec8a13141a57e8c738f2ff/ee78cf0e7bec54e7867ca5cfb8389b504ec26a13.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=d9bed054c8ea15ce41eee001863b5983/1e1fbbbf6c81800ac35d37dfb03533fa838b476b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C350%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C358/sign=9f89482fc2fdfc03e578e3b0e404e4e4/ad9e85d3572c11dffe9901f2622762d0f603c25b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=f33593740b7b02080cc93fe952e291a3/96c5c5b7d0a20cf4ac9e450e77094b36adaf9999.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C736%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C744/sign=41aa0350ca1349547e1ee86c6675f128/95e8d30f4bfbfbedb4118dae79f0f736aec31f5a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C383%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C391/sign=3d17750caa64034f0fcdc20e9ff81a41/39631c600c3387449d1494ad500fd9f9d52aa0d2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C693%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C701/sign=db9e5ff272f082022d9291377bc0989d/39631c600c3387449d2d94ad500fd9f9d62aa03b.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=fe23a97658ee3d6d22c687c3732d0e52/f996582eb9389b50e0dc5a838435e5dde6116e8c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=038305f2622762d0803ea4b790d76b8a/f646563fb80e7becfe88b9302e2eb9389a506b5d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C628%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C636/sign=0f6578d7aec379317d688621dbffd435/c374f044ebf81a4c269a5618d62a6059242da67b.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C769%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C777/sign=da835969d53f8794d3ff4826e2206d84/d0779e24b899a90104cee1e71c950a7b0308f534.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C661%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C669/sign=add71da4d788d43ff0a991fa4d25b16b/b4b37dd162d9f2d306f89e3ea8ec8a136227cc3a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=ba354dcad50735fa91f04eb1ae6a6cc3/5ec8d7ec08fa513d37ba830f3c6d55fbb3fbd993.jpg").split("@hj@");
		
		url52 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=216168f8eac4b7453494b71effc77d67/c374f044ebf81a4c7a3b0218d62a6059242da69a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=48afd19a03087bf47dec57e1c2e8345c/04a801094b36acaf7be7782d7dd98d1000e99ca0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C356%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C364/sign=8eb09bf1b812c8fcb4f3f6c5cc38f135/2663cf99a9014c08923dc1740b7b02087af4f4a2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C355%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C363/sign=6766243dd000baa1ba2c47b3772bda62/5168700828381f30117f6478a8014c086f06f042.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C735%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C743/sign=e18c3c1f9825bc312b5d01906ee4eec1/1e04da4bd11373f04e7b864ea50f4bfbfaed0467.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C345%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C353/sign=cbb0af6ca8773912c4268569c822e568/f5b44d87e950352afbefccd95243fbf2b3118b19.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C355%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C363/sign=28146740cc11728b302d8c2af8c7a0be/e77f6830e924b899501591e96f061d950b7bf6fb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C732%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C740/sign=2d1d176164380cd7e61ea2e5917fce44/a84ebe3d70cf3bc7025e253dd000baa1cc112a49.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C329%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C337/sign=5eb8201bae51f3dec3b2b96ca4d5936f/298a0c899e510fb3cc8a9f46d833c895d0430c1c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C548%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C556/sign=32fe681c5366d0167e199e20a710b777/ad978003918fa0ec03df8fdc279759ee3c6ddb8b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C389%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C397/sign=d0100fa2ac4bd11304cdb73a6a94c77f/800d57a4462309f788d746c3730e0cf3d6cad66b.jpg").split("@hj@");
		
		url53 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=ce7fba52ca1349547e1ee86c664f92dd/7f168f198618367a4a147d0e2f738bd4b21ce508.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4e723da5f31fbe091c5ec31c5b620c30/fcbdf58ba61ea8d3c8a676d7960a304e241f5820.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d5032daf500fd9f9a0175561152fd42b/5a8da6c8a786c91741c550eac83d70cf39c757e2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6a9355c14e4a20a4311e3ccfa0539847/5d1fa609b3de9c82f8ddf45c6d81800a18d84374.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=07500d19e7cd7b89e96c3a8b3f254291/16bea02a6059252d077d10d7359b033b5ab5b947.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2faca6cc06082838680ddc1c889ba964/767fec504fc2d5628de6dd3ee61190ef77c66c3a.jpg").split("@hj@");
		
		url54 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=d0deb452ca1349547e1ee86c664f92dd/7f168f198618367a54b5730e2f738bd4b21ce5e9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=45a86256c8ea15ce41eee00186013a25/379ba600baa1cd1134187ef3b812c8fcc2ce2d7a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=37c8b5b795eef01f4d1418cdd0ff99e0/4d61b8fc1e178a823a467373f703738da877e8b7.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=92305cdb0dd79123e0e0947c9d365917/c1b36cd5ad6eddc4096ab82838dbb6fd5366331f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ef41b061b8014a90813e46b599763971/96c5c5b7d0a20cf4c0fbf10c77094b36adaf9946.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ba529eec4afbfbeddc59367748f2f78e/f5c09e50352ac65cf0c569a0faf2b21191138aed.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=c45da9bbd009b3deebbfe460fcbe6cd3/e134fcd4b31c87013398bc35267f9e2f0608fffb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=40f268a0faf2b211e42e8546fa826511/19cfa33f8794a4c22dd4e9f80ff41bd5ac6e3931.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=38aac9fcbf096b6381195e583c318733/4dccd11ea8d3fd1f73d8ace9314e251f97ca5fd3.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bd4b3419503d26972ed3085565f9b24f/fbef29df8db1cb1354f335c0dc54564e93584b16.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5e7e6ea0faf2b211e42e8546fa816511/19cfa33f8794a4c23358eff80ff41bd5ac6e39b5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=47b50438b7fd5266a72b3c1c9b199799/a42481246b600c33413ad61b1b4c510fd8f9a16e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=e1006acf10dfa9ecfd2e561f52d2f754/4313e3eef01f3a293e26dd1d9825bc315d607c3a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6ce5e22750da81cb4ee683c56267d0a4/c501851fbe096b6337af54830d338744eaf8ac73.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=257e966bd53f8794d3ff4826e21a0ead/efe3312309f790522f1932ed0df3d7ca7acbd5a3.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f70eedd75882b2b7a79f39cc01accb0a/4e8c4edbb6fd5266865c49c7aa18972bd50736b1.jpg").split("@hj@");
		
		url55 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=34ee902ba686c91708035231f93c70c6/ad9e85d3572c11df08c8cbf0622762d0f603c294.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b9124819503d26972ed3085565f9b24f/fbef29df8db1cb1350aa49c0dc54564e90584bed.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d2868ff89c16fdfad86cc6e6848e8cea/b6767d55b319ebc4c22c024a8326cffc1f171650.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d2628ff89c16fdfad86cc6e6848e8cea/b6767d55b319ebc4c2c8024a8326cffc1f17167c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=55a30b73f703738dde4a0c2a831ab073/1fe57bf431adcbef9aab0ad5adaf2edda2cc9f0a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b546dac1730e0cf3a0f74ef33a47f23d/a3c6f70a19d8bc3e94217119838ba61ea9d345fb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=05a1e50ccf1b9d168ac79a69c3dfb4eb/60840e310a55b31998a3f5a642a98226cefc1756.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=77b797dab7003af34dbadc68052bc619/bdcc3010b912c8fc82aa811efd039245d788214b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=13fa7678023b5bb5bed720f606d1d523/f480e83df8dcd100816f8ff2738b4710b8122f3d.jpg").split("@hj@");
		
		url56 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=9ad0fec6dc54564ee565e43183df9cde/f93dadb44aed2e73585044f98601a18b86d6fa77.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8d2bce3eb7fd5266a72b3c1c9b1a9799/a42481246b600c338ba41c1d1b4c510fdbf9a1ca.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fbd6131d1b4c510faec4e21250582528/ea58e2cad1c8a786b58587db6609c93d71cf5004.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3c660fe6908fa0ec7fc764051695594a/5662cb315c6034a800697554ca13495408237620.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ed31554a2fdda3cc0be4b82831e83905/fabd91cd7b899e51a9b4f6c143a7d933c9950df1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=891d30d871cf3bc7e800cde4e101babd/4554142762d0f7037f9b590909fa513d2797c587.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=575dd1d1359b033b2c88fcd225cf3620/bf884cc79f3df8dc52774344cc11728b46102861.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=76819764d058ccbf1bbcb53229d9bcd4/4846d68b87d6277f5b700cee29381f30e824fc4a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3438ed2b7a899e51788e3a1c72a5d990/186d1759252dd42a29f63f7d023b5bb5c8eab834.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2e45c20c14ce36d3a20483380af13a24/1e47cda1cd11728b32e0b2f4c9fcc3cec1fd2cda.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=653591f0fcfaaf5184e381b7bc5594ed/c512c419ebc4b745e8878ec0cefc1e178b821598.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=63463a35d439b6004dce0fbfd9513526/0256058b4710b912be74cf28c2fdfc0393452272.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=77c2bdd332fa828bd1239debcd1d41cd/d0779e24b899a90187f462e01c950a7b0008f5ef.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=16ad9a3ba044ad342ebf878fe0a30c08/128326da81cb39db31735f80d1160924aa183078.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=76a048c508f79052ef1f47363cf2d738/53c5a658ccbf6c81d60e173ebd3eb13532fa40f6.jpg").split("@hj@");
		
		url57 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=25fbf3e59345d688a302b2ac94c37dab/a265384a20a44623eff19fb49922720e0df3d7f1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=687188a2eaf81a4c2632ecc1e72b6029/ff09521f95cad1c8c3c4c6f17e3e6709c83d51b4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=43b0f73ad000baa1ba2c47b37711b9b1/5ec8d7ec08fa513dfa1a56083c6d55fbb3fbd978.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=fd9ca7a342a98226b8c12b2fba83b97a/c390e62397dda144bb6c4964b3b7d0a20df48642.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c70d88c4730e0cf3a0f74ef33a47f23d/a3c6f70a19d8bc3ee66a231c838ba61ea9d34549.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=50cdb80a8b13632715edc23ba18ea056/3f584d292df5e0fed837add75d6034a85fdf7284.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5ca1c0becdbf6c81f7372ce08c3fb1d7/6eccf0d6277f9e2fc72b39de1e30e924b999f396.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e77dbe2578310a55c424defc87444387/7d56e413b07eca8075731d31902397dda04483bd.jpg").split("@hj@");
		
		url58 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=a751a4e63bf33a879e6d0012f65d1018/8857ce12c8fcc3ceb195eee59345d688d53f2052.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f0bd5041d833c895a67e9873e1127397/fbdc743b5bb5c9eaea572435d439b6003bf3b30c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0d3f4f8635a85edffa8cfe2b795509d8/66304e12b31bb051491795fe377adab44bede0f9.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=0b1ba947cc11728b302d8c2af8fdc3b3/c7bd263d269759eee776461db3fb43166c22df8e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=23fc88b64ec2d562f208d0e5d71390f3/95e8d30f4bfbfbed31a010a979f0f736aec31f36.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ec359ef600e9390156028d364bee54f9/c0f4782442a7d9335879c2a5ac4bd11371f001de.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=69ce19b3b219ebc4c0787691b224cf79/7f39bd8065380cd781dc843ba044ad345b8281e9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a1ef3bc8b8389b5038ffe05ab534e5f1/bcb7f5025aafa40fdcc5ef0baa64034f79f019a8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0992e738b58f8c54e3d3c5270a2b2dee/780234a98226cffcb8d49e64b8014a90f703ea36.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5c7db0e94afbfbeddc59367748f2f78e/f5c09e50352ac65c16ea47a5faf2b21191138ac4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1fb5b260c8177f3e1034fc0540ce3bb9/3d94202c11dfa9ec446e76c163d0f703908fc168.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=60b9bd35fc1f4134e0370576151d95c1/834f19061d950a7bc4af6e120bd162d9f3d3c912.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b5d576c163d0f703e6b295d438f85148/e2b297fe9925bc3163a6214e5fdf8db1ca137030.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5e4db9b7f2deb48ffb69a1d6c01d3aef/2483c04543a982266c4b08f18b82b9014b90eb22.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=37cb6c120bd162d985ee621421dda950/32bdd851f3deb48fb9978308f11f3a292cf57835.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=22add073d043ad4ba62e46c8b2035a89/94f2beea15ce36d32ea7aee63bf33a87e850b109.jpg").split("@hj@");
		
		url59 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=879d9561e850352ab161250063789882/fcbdf58ba61ea8d34071eed2960a304e241f5859.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=7827d920a6efce1bea2bc8c29f6a90ae/f69cc1fd5266d016e1ec04fe962bd40734fa3533.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=c57e06e74d086e066aa83f4332331884/7df0a7a20cf431adb608d9ef4a36acaf2cdd98d2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=a54fcb6f9f510fb37819779fe908abe5/7dbc34166d224f4a6326f6c508f790529922d175.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C736%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C744/sign=7fa03a64b8014a90813e46b5994c5a62/fbdc743b5bb5c9ea74798635d439b6003bf3b322.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C641%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C649/sign=f4b5869cdbb44aed594ebeec8327e471/5c54c77eca8065387e7a21c596dda144ac348218.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C565%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C573/sign=bfc8831c838ba61edfeec827710ff47a/d150fd82b9014a90f8fec36ba8773912b11beee8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C592%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C600/sign=fe10fa1dfaedab6474724dc8c70dccb3/16bea02a6059252d8e3599d2359b033b5ab5b98a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=5a4e6b524bed2e73fce98624b73ac2fb/091b67385343fbf2de2522f5b17eca8064388fa7.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=733799de1e30e924cfa49c397c330d76/aa7f7bd7912397ddd57b1cd25882b2b7d1a287aa.jpg").split("@hj@");
	
		url60 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C468%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C476/sign=3796dfe01c950a7b75354ecc3aea01a9/7df0a7a20cf431adb071c7ef4a36acaf2fdd9809.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C618%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C626/sign=668699d2359b033b2c88fcd225f555a3/7c99eb82d158ccbfde2d31ec18d8bc3eb035411f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=61c00dd75d6034a829e2b889fb282a24/620ca61373f08202a24a15e94afbfbeda9641bd0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C732%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C740/sign=d6b1feee6f061d957d4637304bcf69a1/b94e3c36acaf2edddc7cce3f8c1001e93801931b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C683%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C691/sign=1e0f08d8b03533faf5b6932698e89e6f/8ceef526cffc1e178d550de74b90f603718de9c2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C868%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C876/sign=db5ef9ee6f061d957d4637304bcf69a1/5e64e0dda144ad342bdd0751d1a20cf430ad854a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C608%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C616/sign=882f62cc2934349b74066e8df9d176be/7c99eb82d158ccbfc18336ec18d8bc3eb03541f5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C702%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C710/sign=639def64b3b7d0a27bc90495fbd41579/8857ce12c8fcc3ce0d544ae59345d688d53f201c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C653%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C661/sign=86f686a8241f95caa6f592bef92c1c4e/7f168f198618367acb48fc0b2f738bd4b11ce5ef.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C781%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C789/sign=ef3b821ce7cd7b89e96c3a8b3f1f21d7/9abcc5fb43166d2274769742472309f79152d2af.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C627%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C635/sign=6b685ec2b999a9013b355b3e2dae690b/96c5c5b7d0a20cf445f57c0977094b36adaf9943.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=f1f50ede9a504fc2a25fb00dd5e68461/9e9df6cb39dbb6fd8cbd67f00824ab18952b37ce.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=4e32e48635a85edffa8cfe2b796f6a53/1e5404f082025aaf560cf31dfaedab64024f1af6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C734%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C742/sign=edf697c8b8389b5038ffe05ab50e86ad/6229aac451da81cbe2fc0e1b5366d01608243192.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=1930a5730b7b02080cc93fe952e291a3/feeabcef76094b36db99963ba2cc7cd98c109da1.jpg").split("@hj@");
		
		url61 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C555%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C563/sign=92b11f09cf1b9d168ac79a69c3e5d7ff/645fe02bd40735fa02bac36f9f510fb30e240862.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C740%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C748/sign=b78909d332fa828bd1239debcd242244/bccade773912b31bbbe640ff8718367adbb4e122.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C627%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C635/sign=b0e0803db7fd5266a72b3c1c9b23f45b/3844e68fa0ec08fa60169f7158ee3d6d54fbda9e.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=c215e7398cb1cb133e693c1bed6f353e/84bc8cedab64034f8e4d4ed0aec379310b551d28.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C608%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C616/sign=4ce02eec314e251fe2f7e4f097bdaa67/7c5cc751f81986183bae63524bed2e7389d4e6c7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=aa4ce0083c6d55fbc5c6762e5d192c3a/2a9a901190ef76c62b3477fd9c16fdfaad5167ce.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=d325d7c44e4a20a4311e3ccfa069fb52/015cea16fdfaaf5163ed0e698d5494eef11f7aa6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=d29e081d42166d223877159c76186a87/541738c2d562853562b85df791ef76c6a6ef6350.jpg").split("@hj@");
		
		url62 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C348%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C356/sign=dfc5c06f9f510fb37819779fe908abe5/8c511a224f4a20a47f2bb21191529822730ed0f3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=eb7b6af572f082022d9291377bc0989d/3d58c9096b63f6242d50b7d58644ebf81b4ca39b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C299%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C307/sign=9bfdb8dd5ab5c9ea62f303ebe502d570/7379c63533fa828b09781335fc1f4134960a5a51.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C736%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C744/sign=a697e8a5faf2b211e42e8546fabb0648/8e73e00a304e251f23656a2ea686c9177e3e531a.jpg").split("@hj@");
		
		url63 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C309%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C317/sign=7a4db48735a85edffa8cfe2b796f6a53/6b483cfbfbedab64c5339017f636afc378311e68.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C667%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C675/sign=bb76d260e850352ab161250063789882/d69fcb3eb13533fa030e4ef9a9d3fd1f40345b71.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C635%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C643/sign=9c257eed314e251fe2f7e4f097bdaa67/7c5cc751f8198618eb6b33534bed2e738ad4e686.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=56d29fee4a36acaf59e096f44ce2ee60/07bbb4cec3fdfc030f783f6fd53f8794a5c226a9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C732%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C740/sign=d34faaf16c224f4a5799731b39ccf322/015cea16fdfaaf51926a5d688d5494eef11f7a20.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C670%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C678/sign=644d58d232fa828bd1239debcd242244/85d78103738da977e1615afcb151f8198718e360.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C647%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C655/sign=7e9cc4948ad4b31cf03c94b3b7ed440f/df7f2443fbf2b211a7625a99cb8065380dd78e65.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C733%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C741/sign=4b3f20f448540923aa696376a263b279/6423744f78f0f736694d92d60b55b319eac4137a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C298%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C306/sign=dce188c063d0f703e6b295d438c1324d/541738c2d5628535b32f0cf691ef76c6a5ef63e6.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=f9fc7e2dd0c8a786be2a4a065732aa4d/7f168f198618367a0657a10a2f738bd4b11ce5d0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=b880bbcb10dfa9ecfd2e561f52eb9473/b39efa1001e939016b6c54e97aec54e737d19647.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=2f73111dae51f3dec3b2b96ca4d5936f/1b4042fae6cd7b892c34e3540e2442a7d8330e51.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C434%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C442/sign=2e0bcd43472309f7e76fad1a42356f83/3c99c38f8c5494ee915ed7ce2cf5e0fe98257eb5.jpg").split("@hj@");
		
		url64 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C448%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C456/sign=d85e72daf9dcd100cd9cf82942b02460/4846d68b87d6277f7db6eaef29381f30e824fc0e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=aa2fae4e8326cffc692abfba893a29e0/9e48aef9d72a6059384739cd2934349b023bba5e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=903b7fbfd009b3deebbfe460fc840ff1/b7b78036afc37931cc205efeeac4b74542a91161.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C332%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C340/sign=e42af3f08b82b9013dadc33b43b6ca07/79474df33a87e9501efc2bbb11385343f9f2b4c2.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C298%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C306/sign=5220332350da81cb4ee683c5625db366/c7bd263d269759eec223bb1cb3fb43166c22dfbb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C732%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C740/sign=4ba63f2fa686c91708035231f90613bf/85aa59738bd4b31c596d4f6c86d6277f9f2ff859.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C635%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C643/sign=8473f4ab500fd9f9a01755611516b75a/86137e23dd54564efdd33feeb2de9c82d0584f7f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C742%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C750/sign=32efa125d462853592e0d229a0d415b6/f69cc1fd5266d016a09b45ff962bd40734fa352b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C648%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C656/sign=55077eb59922720e7bcee2f24bf06936/015cea16fdfaaf51af2e5a688d5494eef21f7ae4.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C648%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C656/sign=1b8334534bed2e73fce98624b73ac2fb/2617422ac65c10387eba1515b3119313b27e89ed.jpg").split("@hj@");
		
		url65 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C625%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C633/sign=0a022c566d81800a6ee58906810e508a/8ceef526cffc1e1751d859e84b90f603728de949.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C644%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C652/sign=81afdb2e9e3df8dca63d8f99fd2a11fb/6eccf0d6277f9e2ff668c8d11e30e924b999f357.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C615%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C623/sign=0f657734a044ad342ebf878fe0996f84/507a8fdcd100baa1535792624610b912c9fc2ebc.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C383%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C391/sign=530685d10dd79123e0e0947c9d0f3af2/b0791009c93d70cfa2417fd4f9dcd100bba12b7c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C304%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C312/sign=240207f891ef76c6d0d2fb23ad2d9e8a/b4cee9510fb30f24837839dac995d143af4b03d5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C580%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C588/sign=f40b6afa622762d0803ea4b790d76b8a/9ba041d12f2eb938c6b7af2bd4628535e7dd6fdd.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=fb9230aaac4bd11304cdb73a6aaea488/06ad62ce36d3d5398507db1a3b87e950342ab0fd.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=685352f2b151f819f1250342eab54a76/8471dbaf2edda3cc2d986cf900e93901203f92b7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=3050dbc02cf5e0feee1889096c5b57d8/b4cee9510fb30f2482e838dac995d143ac4b0345.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C675%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C683/sign=0be26dbd95eef01f4d1418cdd0c5fa55/298a0c899e510fb3b049a34ed833c895d0430c5b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C478%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C486/sign=33216b6bb8014a90813e46b5994c5a62/ea6aa32a2834349b2e0dba5cc8ea15ce37d3beac.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d927c6969f2f07085f052a08d926b865/e069ce389b504fc28b9364dce4dde71192ef6de7.jpg").split("@hj@");
		
		url66 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=9fb8a2408326cffc692abfba893a29e0/d50b260fd9f9d72a48a4c4c4d52a2834369bbbeb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ca8fa9dfadaf2eddd4f149e1bd110102/1b4042fae6cd7b8922d7ed5a0e2442a7d8330e7c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C608%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C616/sign=72037efffcfaaf5184e381b7bc6ff79e/fabd91cd7b899e51b3abeccd43a7d933c9950d8e.jpg").split("@hj@");
		
		url67 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C668%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C676/sign=3bdeba6bb3b7d0a27bc90495fbd41579/b0791009c93d70cfad2d7cd4f9dcd100b8a12bd8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=0a79e81ad6ca7bcb7d7bc7278e320813/04543e540923dd542e3976b1d009b3de9d82486d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C275%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C283/sign=782612ea728da9774e2f8623806a9b69/f994a239b6003af308310db9342ac65c1138b62c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C343%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C351/sign=0413ca34a2cc7cd9fa2d34d1093a424f/1b78f094a4c27d1e7aa7ea1d1ad5ad6edcc4382a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=7f004d3afc1f4134e03705761524f6ba/d150fd82b9014a902f1d9664a8773912b21bee95.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C635%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C643/sign=d776b10e37d12f2ece05ae687ff9b612/c1b36cd5ad6eddc4fd40642238dbb6fd53663308.jpg").split("@hj@");
		
		url68 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=76853b89024f78f0800b9afb49300a83/091b67385343fbf23f7903feb17eca8064388f5a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=33184cb9574e9258a63486e6ac83d1d1/15f33ded2e738bd4892716eca08b87d6267ff9b5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2ca8d5fdb812c8fcb4f3f6c5cc0292b4/96a94a6d55fbb2fb1d35ffcf4e4a20a44723dc9d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2bfff5e4c83d70cf4cfaaa05c8ded1ba/66abfd13632762d0a3c20362a1ec08fa503dc633.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0ac904e7314e251fe2f7e4f09784c9c2/c53c75087bf40ad12924613e562c11dfabeccef7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=caf9ac6ae850352ab16125006342fb1a/07bbb4cec3fdfc03624f4065d53f8794a5c22684.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d4449a1930adcbef01347e0e9cad2e0e/1f517e24ab18972bd0e1a317e7cd7b899c510adf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3df37c29b64543a9f51bfac42e158a7b/aa7f7bd7912397dd2fae3ad95882b2b7d2a287e4.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=88464ed28694a4c20a23e7233ef61bac/89647ef7905298222cc0961ed6ca7bcb0846d4c0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d40000fbfcfaaf5184e381b7bc5594ed/c512c419ebc4b74559b21fcbcefc1e178b821594.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ce93560277094b36db921be593cd7c00/645fe02bd40735fa19f3e6649f510fb30e2408b0.jpg").split("@hj@");
		
		url69 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=233705e24afbfbeddc59367748f1f78e/f5c09e50352ac65c69a0f2aefaf2b21192138a0a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=732cc98ef7246b607b0eb27cdbf91a35/67948a1f4134970afd6b87f294cad1c8a6865d9f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e53d6bfa7e3e6709be0045f70bc59fb8/986b66dfa9ec8a13219cc03df603918fa1ecc035.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=8b645f17ae51f3dec3b2b96ca4eff0ec/7c5e9cc4b74543a994546d111f178a82b8011463.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ba8ca99603087bf47dec57e1c2d2575e/015cea16fdfaaf5154c717628d5494eef11f7a8b.jpg").split("@hj@");
	
		url70 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C729%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C737/sign=0d4be7c996dda144da096cba828cb3d2/68c1be177f3e6709c8a106253ac79f3df9dc550a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C607%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C615/sign=7384c0af42a98226b8c12b2fbab9da71/1b6d5f34349b033bc3f5be0014ce36d3d439bdb7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C439%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C447/sign=db0a40c32cf5e0feee1889096c5b57d8/8de0ae33c895d143865eabf972f082025baf0783.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C377%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C385/sign=ba548ad98644ebf86d716437e9c2b45a/73762b6034a85edf5c854df948540923dc5475a3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C311%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C319/sign=c21b0bcabd315c6043956be7bd8aa863/3871d8c379310a5591fc792bb64543a9802610d8.jpg").split("@hj@");
	
		url71 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C475%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C483/sign=3acbf82163d9f2d3201124e799d7e963/63e859dda3cc7cd9cc2ff3193801213fb90e91bc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C344%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C352/sign=0f3ecf9d54fbb2fb342b581a7f7143d4/b981d0efce1b9d16ab2a5da1f2deb48f8e5464cd.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C314%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C322/sign=d86923b3ac4bd11304cdb73a6a94c77f/714e1c63f6246b601ccf75b4eaf81a4c530fa2f1.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C718%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C726/sign=4ea496c80dd79123e0e0947c9d0f3af2/68c1be177f3e67094d19833f3ac79f3df9dc5599.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7a412238a686c91708035231f93c70c6/ad9e85d3572c11df466779e3622762d0f603c201.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4b96fe8b03087bf47dec57e1c2d2575e/015cea16fdfaaf51a5dd407f8d5494eef11f7af8.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=9826c0585fdf8db1bc2e7c6c3918be24/7c5e9cc4b74543a946603b0c1f178a82b80114bb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C407%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C415/sign=97a4b8f86f061d957d4637304bcf69a1/8471dbaf2edda3cc427c79e000e93901203f921a.jpg").split("@hj@");
		
		url72 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=17d6d654472309f7e76fad1a42356f83/3c99c38f8c5494eea883ccd92cf5e0fe98257e11.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C368%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C376/sign=70690d640b7b02080cc93fe952e291a3/c3b346adcbef76095559bc5e2fdda3cc7dd99e6c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C330%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C338/sign=ba1c3fdfb8389b5038ffe05ab50e86ad/645fe02bd40735fa6a006b789f510fb30d2408c2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=850d903a38dbb6fd255be52e391fc868/de98deec8a136327b607e6f2908fa0ec0afac7d5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C568%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C576/sign=3e29c8454bed2e73fce98624b73ac2fb/f5c09e50352ac65c186b41b2faf2b21192138a48.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C478%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C486/sign=ed5d81e2b17eca80120539efa118f4ad/8e73e00a304e251fca86c339a686c9177e3e5341.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C251%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C259/sign=52f7192063d9f2d3201124e799d7e963/b4ab23e736d12f2e903b88a14ec2d562843568f8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=972da1ed8601a18bf0eb1247ae146478/c3b346adcbef760957cfbe5e2fdda3cc7ed99ef6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C316%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C324/sign=f76dab68a8014c08193b28ad3a406178/b94e3c36acaf2eddbd856f288c1001e938019346.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C515%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C523/sign=3e94600183025aafd3327ec3cbd6c814/714e1c63f6246b60e3b494b5eaf81a4c500fa205.jpg").split("@hj@");
		
		url73 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C315%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C323/sign=4dc50e640b7b02080cc93fe952e291a3/b39efa1001e9390102fcabff7aec54e737d19638.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C478%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C486/sign=403f1b420e2442a7ae0efdade178ce3b/9abcc5fb43166d2291243455472309f79152d26c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1597ce454bed2e73fce98624b703a16d/425776e93901213f9be36f1d55e736d12d2e95e2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=c250c0938435e5dd902ca5d746fdc49f/511678b30f2442a754a1dd64d043ad4bd013020f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C473%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C481/sign=48083adfb8389b5038ffe05ab50e86ad/6229aac451da81cb4702a30c5366d0160b2431d6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C647%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C655/sign=8973318e9f2f07085f052a08d91fdbe9/05c712380cd791239978b7b5ac345982b3b7801a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=59722f2ab7fd5266a72b3c1c9b23f45b/9e7a519759ee3d6d8d42a40a42166d224e4ade37.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C306%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C314/sign=710b0a640b7b02080cc93fe952e291a3/b39efa1001e939013e32afff7aec54e737d19682.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C302%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C310/sign=72773755472309f7e76fad1a42356f83/e2b297fe9925bc31615d23595fdf8db1ca1370b2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C343%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C351/sign=bf2e1b0530adcbef01347e0e9c944dad/07bbb4cec3fdfc03fdc9c179d53f8794a5c22601.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C350%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C358/sign=8b63963a38dbb6fd255be52e391fc868/f22a22fbb2fb4316b79b58bb21a4462308f7d337.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C353%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C361/sign=03e019051ad5ad6eaaf964e2b1f05aab/ac6015d0f703918f71171f0b503d26975beec4f1.jpg").split("@hj@");
		
		url74 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C240%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C248/sign=4c4405640b7b02080cc93fe952e291a3/ee78cf0e7bec54e7149337dfb8389b504ec26abf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C286%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C294/sign=75bad70d1f178a82ce3c7fa8c63810fd/1b6d5f34349b033bac29d11b14ce36d3d439bd12.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C302%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C310/sign=17cca250cc11728b302d8c2af8c7a0be/c53c75087bf40ad1a415ea22562c11dfabeccec2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=c65a82a14ec2d562f208d0e5d72af39f/79ba2566d0160924d47a8edad50735fae7cd345f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C299%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C307/sign=1aa92a0b838ba61edfeec827710ff47a/66304e12b31bb05153859fe9377adab44bede012.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C303%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C311/sign=1b5a6f37a6efce1bea2bc8c29f6a90ae/c06335a7d933c8955af6b4bad01373f08302002a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C531%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C539/sign=39adcba9cdbf6c81f7372ce08c05d245/45c5ce014a90f603d6a2b3863812b31bb151edad.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=f98fbbb5ac345982c58ae59a3ccf52dd/0cba8b039245d688ba6d9d65a5c27d1ed31b244f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C803%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C811/sign=77dca3f04b90f60304b09c4f0929d06b/1a7ec1003af33a87140e2fdbc75c10385243b55c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C241%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C249/sign=76963a55472309f7e76fad1a42356f83/f56e5af5e0fe992585ed469135a85edf8fb171d1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C608%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C616/sign=c6cef0091b4c510faec4e2125062465d/04543e540923dd5417c489a9d009b3de9d824807.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C313%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C321/sign=11a433c91e30e924cfa49c397c330d76/b94e3c36acaf2eddb56067288c1001e938019321.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C302%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C310/sign=ddb50724ac6eddc426e7b4f309e0d58d/e9d02eee3d6d55fb61ba5fe76c224f4a21a4ddbf.jpg").split("@hj@");
		
		url75 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C548%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C556/sign=75fc3a6658ee3d6d22c687c3732d0e52/767fec504fc2d562a1f4f92ce61190ef77c66c3e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C301%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C309/sign=6fd4c8c8b7003af34dbadc680511a52c/1e8fd086c9177f3e3e0ed4cc71cf3bc79e3d5684.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=d442381b14ce36d3a20483380af13a24/1e47cda1cd11728bc8e748e3c9fcc3cec1fd2cf5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5bfe39e248540923aa696376a259d1dc/375ef118367adab49ca2dc828ad4b31c8601e44e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9b31391e77094b36db921be593ce7c00/645fe02bd40735fa4c5189789f510fb30e240812.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a90fc976e850352ab16125006341fb1a/07bbb4cec3fdfc0301b92579d53f8794a6c226f2.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C308%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C316/sign=6faf03c7aec379317d688621dbffd435/16bea02a6059252dc375dcc5359b033b5ab5b95d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C309%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C317/sign=59480f1caa64034f0fcdc20e9ff81a41/c374f044ebf81a4c43bc2d08d62a6059242da629.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=936c65d296dda144da096cba82b5d009/6229aac451da81cba660420c5366d01608243131.jpg").split("@hj@");
		
		url76 = ("http://imgsrc.baidu.com/forum/w%3D580%3Bcp%3Dtieba%2C10%2C336%3Bap%3D%CE%E2%BA%E8%E7%F9%B0%C9%2C90%2C344/sign=e2b27840ca1349547e1ee86c6675f128/6423744f78f0f73613ae8cc00b55b319eac41363.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6f79031caa64034f0fcdc20e9fc27980/fa6db15c10385343df704ae09213b07ecb808878.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9bb241c99a504fc2a25fb00dd5dfe7f0/4d452dafa40f4bfb4f715395024f78f0f6361812.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=d5d3bae76c224f4a5799731b39f69044/9909e558d109b3defbaa28a9cdbf6c81810a4ca6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=258a4350cc11728b302d8c2af8fdc3b3/c7bd263d269759eec9e7ac0ab3fb43166c22df01.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0b7b6d2ca044ad342ebf878fe0a30c08/128326da81cb39db2ca5a897d1160924aa183056.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6fed64a00eb30f24359aec0bf894d192/ea6aa32a2834349b175fa144c8ea15ce37d3be5a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8557b10afaedab6474724dc8c737af81/2617422ac65c1038721b0103b3119313b17e8956.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0c475bb5ac345982c58ae59a3cf6310b/9e9df6cb39dbb6fdc9fc2ae70824ab18962b3710.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4976bdd208f79052ef1f47363cf1d738/53c5a658ccbf6c81e9d8e229bd3eb13531fa40c8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bf8d3b75e850352ab16125006342fb1a/07bbb4cec3fdfc03173bd77ad53f8794a5c2267c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=375bf6f1908fa0ec7fc764051696594a/5662cb315c6034a80b548c43ca13495408237601.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=469029ca1e30e924cfa49c397c0a6e66/8085a2628535e5dda689911d77c6a7efcf1b6216.jpg").split("@hj@");
		
		url77 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=ebe84ac4adaf2eddd4f149e1bd120102/1b4042fae6cd7b8903b00e410e2442a7db330edf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a2ed3bf3203fb80e0cd161df06d02ffb/8de0ae33c895d1430e4fd3e172f082025baf07fa.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=53c2d3aacdbf6c81f7372ce08c3fb1d7/6eccf0d6277f9e2fc8482aca1e30e924b999f3bf.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9ffb365a5fdf8db1bc2e7c6c3921dddb/f655c41bb051f81945833488dbb44aed2f73e712.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b73ad7cbb7003af34dbadc680528c619/bdcc3010b912c8fc4227c10ffd039245d48821e7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9966bdfb6a63f6241c5d390bb745eb32/6959dfd3fd1f4134fc7333bc241f95cad0c85e77.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b301b0ee8601a18bf0eb1247ae2d0761/77490cec54e736d117fbbaca9a504fc2d76269cb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=abf8e636b64543a9f51bfac42e158a7b/aa7f7bd7912397ddb9a5a0c65882b2b7d2a287df.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=725e5547c8ea15ce41eee00186013a25/379ba600baa1cd1103ee49e2b812c8fcc2ce2d5b.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=77d889d196dda144da096cba82b6d009/6229aac451da81cb42d4ae0f5366d0160824318d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5e97ebedbf096b6381195e583c318733/4dccd11ea8d3fd1f15e58ef8314e251f97ca5fcf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5a124b94d1160924dc25a213e405359b/a4277b338744ebf8f6a348fdd8f9d72a6259a7ee.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2bdecbaacdbf6c81f7372ce08c3fb1d7/6eccf0d6277f9e2fb05432ca1e30e924b999f353.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=882fa8e39213b07ebdbd50003cd59113/48d3d3c27d1ed21b7d290127ac6eddc453da3fd3.jpg").split("@hj@");
		
		url78 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=74ac7773810a19d8cb03840d03fb82c9/e838e92f07082838a723f2d6b999a9014d08f18a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e7f98eaad009b3deebbfe460fcbd6cd3/e134fcd4b31c8701103c9b24267f9e2f0608ff36.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7e1a4eb1faf2b211e42e8546fa816511/19cfa33f8794a4c2133ccfe90ff41bd5ac6e3998.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=43164cfdd8f9d72a17641015e42b282a/1e8fd086c9177f3e3e53d4cf71cf3bc79e3d5650.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=59785509faedab6474724dc8c737af81/2617422ac65c1038ae34e500b3119313b17e8976.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5de72575e850352ab16125006342fb1a/07bbb4cec3fdfc03f551c97ad53f8794a5c2268a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=170ffa2fe61190ef01fb92d7fe1a9df7/6423744f78f0f7363df966c30b55b319eac413b0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a55ce7eb8718367aad897fd51e728b68/e19ad4cc7cd98d1014e426f3203fb80e7aec9083.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7946cbd82934349b74066e8df9eb1521/067a07cf3bc79f3da4b7cef2bba1cd11738b2961.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9580ade39213b07ebdbd50003cd69113/48d3d3c27d1ed21b60860427ac6eddc450da3f68.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=92ec7e2d8cb1cb133e693c1bed5556da/7c5cc751f8198618903efa464bed2e738ad4e6bb.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bfe5a724267f9e2f70351d002f31e962/f996582eb9389b5051acf5908435e5dde6116e6c.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=acf29dccb03533faf5b6932698d2fdca/e77f6830e924b8991c2b6dfa6f061d950b7bf6a1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=b107625b8326cffc692abfba89004a7d/5e64e0dda144ad345fc09345d1a20cf430ad85b8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2be9e967d043ad4ba62e46c8b2005a89/94f2beea15ce36d327e397f23bf33a87eb50b1d1.jpg").split("@hj@");
		
		url79 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=bfea9dead31b0ef46ce89856edc551a1/5765050e0cf3d7ca60e3eab2f31fbe096a63a9a1.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9df8b6d810dfa9ecfd2e561f52d1f754/4313e3eef01f3a2942de010a9825bc315d607cac.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8172327cd53f8794d3ff4826e21a0ead/efe3312309f790528b1596fa0df3d7ca7acbd5b0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=da144df54d086e066aa83f4332097b5a/2856e7ef76c6a7efac9679e2fcfaaf51f2de660e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c7e8ed0391529822053339cbe7c87b3b/1e1fbbbf6c81800a981358cab03533fa808b47cc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=ec0574b1d788d43ff0a991fa4d1fd2aa/800d57a4462309f780547ed6730e0cf3d6cad687.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=7a2b6d20b21c8701d6b6b2ee177e9e6e/ee78cf0e7bec54e76289c9dab8389b504ec26a51.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=65e4fdb8500fd9f9a0175561152cd42b/5a8da6c8a786c917f12280fdc83d70cf3ac7579d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=19f42d7464380cd7e61ea2e59145ad14/1d5c79f41bd5ad6e744eb62e80cb39dbb7fd3c03.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5c97a836d462853592e0d229a0ed76f2/6b483cfbfbedab64c4889f04f636afc37b311ec0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5d2c1aeb4034970a47731027a5c8d1c0/a1416a950a7b02088e0bed2563d9f2d3552cc8f9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5f785be59213b07ebdbd50003cd69113/48d3d3c27d1ed21baa7ef221ac6eddc450da3f03.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5fc5c2cc1e30e924cfa49c397c0a6e66/8085a2628535e5ddbfdc7a1b77c6a7efcc1b62ce.jpg").split("@hj@");
	
		url80 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=0917a4f6203fb80e0cd161df06d32ffb/dd54564e9258d109bb200175d058ccbf6d814d31.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c0a2493d7acb0a4685228b315b62f63e/ca8065380cd791235b8c3fb3ac345982b3b7808d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f9190fd496dda144da096cba82b5d009/af51f3deb48f8c5461206ee83b292df5e1fe7f02.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=67c2ed7aa8773912c4268569c81b8675/62d0f703918fa0ec993bcfca279759ee3c6ddb7d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c016493d7acb0a4685228b315b61f63e/ca8065380cd791235b383fb3ac345982b3b78019.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f61dab6c023b5bb5bed720f606d2d523/8d1001e93901213f6627e41b55e736d12e2e95e5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=3ab6b0d9b8389b5038ffe05ab534e5f1/d158ccbf6c81800a15bf23c9b03533fa838b479a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=df08eb0cfaedab6474724dc8c737af81/070828381f30e924c39e09f64d086e061d95f73b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=2adfac0330adcbef01347e0e9cae2e0e/2df5e0fe9925bc31a61d945f5fdf8db1ca1370b1.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=165312e69213b07ebdbd50003cd59113/90ef76c6a7efce1b70b75d0dae51f3deb58f655d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0aa56e0b1f178a82ce3c7fa8c602737f/f2d3572c11dfa9ec0290c2d063d0f703908fc1bf.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=babc73b4ac4bd11304cdb73a6aaea488/8bd4b31c8701a18bf5ff85889f2f07082938fee5.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=219fb3cf5243fbf2c52ca62b807cca1e/8535e5dde71190ef91050418cf1b9d16fcfa607f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e9efcdf11c950a7b75354ecc3ad3625c/be096b63f6246b60a9d424b3eaf81a4c500fa21b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=6cfa08ef962bd40742c7d3f54b8b9e9c/f603738da9773912d6c513a6f9198618377ae212.jpg").split("@hj@");
	
		url81 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=b394add3aa18972ba33a00c2d6cc7b9d/4a90f603738da9775a9017ecb151f8198718e3be.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=79e70118cf1b9d168ac79a69c3dfb4eb/a8d3fd1f4134970a3f6f83e894cad1c8a6865ddc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4fa2a51214ce36d3a20483380af23a24/213fb80e7bec54e722c643d6b8389b504ec26acb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5a1ab8c78694a4c20a23e7233ef61bac/034f78f0f736afc3f5a366adb219ebc4b645124e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e2e0170c0bd162d985ee621421dda950/0c338744ebf81a4cb1e7b501d62a6059242da625.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=82135f8b8ad4b31cf03c94b3b7d4276f/b2fb43166d224f4ae85a37db08f790529922d133.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=42bec1e48601a18bf0eb1247ae2e0761/6d224f4a20a44623c09de2aa9922720e0df3d7a7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9103d896dcc451daf6f60ce386ff52a5/ebc4b74543a98226452a6bef8b82b9014b90eb0b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=98b0dce0962bd40742c7d3f54b8b9e9c/f603738da9773912228fc7a9f9198618377ae249.jpg@hj@").split("@hj@");
		
		url82 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=f7eeffbceaf81a4c2632ecc1e7286029/d0a20cf431adcbef8dd433ceadaf2edda2cc9f12.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=82e16616cf1b9d168ac79a69c3dfb4eb/a8d3fd1f4134970ac469e4e694cad1c8a6865de5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5de255f3314e251fe2f7e4f09784c9c2/b6fd5266d0160924b7ce55d2d50735fae7cd340b.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=aa2fcf2e902397ddd679980c6983b216/fdfaaf51f3deb48f43435717f11f3a292cf578d5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7be256eab17eca80120539efa1219712/76c6a7efce1b9d1634096aa8f2deb48f8d546429.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=46cdc8dd43a7d933bfa8e47b9d4ad194/367adab44aed2e73c2aa74e58601a18b86d6fabc.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2b1684ef6c224f4a5799731b39f59044/3a87e950352ac65c89d594bafaf2b21192138a23.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e33c011314ce36d3a20483380af23a24/213fb80e7bec54e78e58e7d7b8389b504ec26a47.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=191c57c4f9dcd100cd9cf829428947be/0f2442a7d933c895f39865b2d01373f083020010.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=f6f96a357dd98d1076d40c39113eb807/8db1cb134954092305709fb79358d109b2de49da.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c3927b0242166d223877159c76220945/3af33a87e950352a5035d9c15243fbf2b3118ba7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fc2572f77aec54e741ec1a1689399bfd/9258d109b3de9c820c4206466d81800a18d843d0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=ee20021314ce36d3a20483380af13a24/213fb80e7bec54e78344e4d7b8389b504ec26a4b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=8bde0da5113853438ccf8729a311b01f/d5628535e5dde7112e1bbd3fa6efce1b9c16612a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=fba983b321a446237ecaa56aa8237246/352ac65c103853436d797ee89213b07ecb808841.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=2f9427011b4c510faec4e212505b2528/0cf431adcbef7609e3e660562fdda3cc7dd99e0e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=42fa3e27b58f8c54e3d3c5270a2b2dee/251f95cad1c8a78624bcb2c76609c93d71cf5061.jpg").split("@hj@");
		
		url83 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=146557dcbd315c6043956be7bdb3cbe6/70cf3bc79f3df8dc259b7458cc11728b46102851.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=de099cf16f061d957d4637304bf50a5d/f21fbe096b63f6241c68dcca8644ebf81b4ca3c6.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4e3e925ed833c895a67e9873e1127397/dab44aed2e738bd4f20657f8a08b87d6267ff9d0.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=6cf56ef06a63f6241c5d390bb746eb32/97dda144ad3459822c5d005b0df431adcaef8420.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=cdd86b58cc11728b302d8c2af8fec3b3/c895d143ad4bd1136f2853fb5bafa40f4afb0515.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c8efbbdb4e4a20a4311e3ccfa0509847/e950352ac65c1038d8ba2d0bb3119313b17e8937.jpg").split("@hj@");
		
		url84 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=1a14d4f37aec54e741ec1a1689399bfd/9258d109b3de9c82ea73a0426d81800a18d843ec.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5d9fb9c28694a4c20a23e7233ef51bac/034f78f0f736afc3f22667a8b219ebc4b64512d0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=15605626b7fd5266a72b3c1c9b1a9799/cffc1e178a82b901de3b99fe728da9773812ef6d.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=9808bf5f0df431adbcd243317b34ac0f/3a292df5e0fe9925968e339d35a85edf8cb17178.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=4cd568f529381f309e198da199034c67/9822720e0cf3d7caa93165bbf31fbe096a63a93c.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bbaec30642166d223877159c76220945/3af33a87e950352a280961c55243fbf2b3118b97.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=5766da99024f78f0800b9afb49300a83/1f30e924b899a901e0831ffb1c950a7b0308f54d.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=77c96cea8b82b9013dadc33b438ca97e/572c11dfa9ec8a13db12102df603918fa1ecc0f7.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=0796493a9e3df8dca63d8f99fd1072bf/0fb30f2442a7d933bfcca3beac4bd11372f00192.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=bf4a02323ac79f3d8fe1e4388aa0cdbc/9e510fb30f2442a7af44ba68d043ad4bd01302b0.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=f7227f0930adcbef01347e0e9cae2e0e/2df5e0fe9925bc317be047555fdf8db1ca1370b9.jpg").split("@hj@");
		
		url85 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=c2bc5dfc4b90f60304b09c4f0913b370/a9ec8a13632762d0bf3d7572a1ec08fa503dc6f8.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=7bcb7ad206082838680ddc1c889ba964/90529822720e0cf38b7e9f360b46f21fbf09aa76.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=c79f2b011f178a82ce3c7fa8c601737f/f2d3572c11dfa9eccfaa87da63d0f703908fc173.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=7a5d1623b58f8c54e3d3c5270a282dee/251f95cad1c8a7861c1b9ac36609c93d71cf50ce.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=77e528e69c16fdfad86cc6e6848e8cea/fd1f4134970a304ef5157337d0c8a786c8175ccc.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=e0f8ebce8644ebf86d716437e9fbd736/b2b7d0a20cf431ad407791f44a36acaf2fdd9852.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=36a48c9ef7246b607b0eb27cdbfa1a35/a144ad345982b2b7580feb0930adcbef77099b6f.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a41dd27ae850352ab16125006341fb1a/b9389b504fc2d5621bdb0d20e61190ef77c66c28.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=3c944bb9ac345982c58ae59a3cf5310b/b48f8c5494eef01f9160c708e1fe9925bd317d83.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=980dd326b7fd5266a72b3c1c9b1a9799/cffc1e178a82b90153561cfe728da9773812ef00.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=89530039b64543a9f51bfac42e168a7b/02087bf40ad162d9c899bcd110dfa9ec8b13cd8c.jpg").split("@hj@");
		
		url86 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=f8c09964023b5bb5bed720f606d1d523/8d1001e93901213f68fad61355e736d12e2e9530.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=497c3ca7d009b3deebbfe460fcbe6cd3/c3cec3fdfc039245c9ba7ac08694a4c27c1e25f5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=31e02929267f9e2f70351d002f31e962/462309f790529822e265a20cd6ca7bcb0b46d4af.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=1af986cb359b033b2c88fcd225cc3620/7cd98d1001e93901efec16f17aec54e737d19617.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9908e4c9adaf2eddd4f149e1bd110102/5c6034a85edf8db12412e6ab0823dd54574e74c5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=85b9003c78310a55c424defc87474387/4c086e061d950a7b7087d40b0bd162d9f3d3c94b.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=71330ebbac345982c58ae59a3cf6310b/b48f8c5494eef01fdcc7820ae1fe9925bd317d2a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=5b42605d0df431adbcd243317b34ac0f/3a292df5e0fe992555c4ec9f35a85edf8cb17131.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=062607ff3bf33a879e6d0012f65d1018/36d12f2eb9389b509cdd649d8435e5dde6116edb.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=20a24a12aa64034f0fcdc20e9fc27980/28381f30e924b899c258fdf76f061d950b7bf69d.jpg").split("@hj@");
		
		url87 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=b534c00f83025aafd3327ec3cbecab8d/a18b87d6277f9e2f632f9bc71e30e924b999f3e3.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=bc030148d1a20cf44690fed746084b0c/f01f3a292df5e0fe7ca40fce5d6034a85fdf7245.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=11e2a3c75243fbf2c52ca62b807cca1e/8535e5dde71190efa1781410cf1b9d16fcfa607a.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=b49d619d8435e5dd902ca5d746c7a7f5/19d8bc3eb13533fa79d412e1a9d3fd1f40345b9b.jpg").split("@hj@");
		
		url88 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=0bee6ec6a5efce1bea2bc8c29f51f3e8/a61ea8d3fd1f41340c0b284e271f95cad1c85ec5.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=90c29f01a38b87d65042ab1737092860/4f4a20a4462309f7b38c8022700e0cf3d7cad61a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=60c0d0fcc1cec3fd8b3ea77de689d4b6/82025aafa40f4bfb223fb364014f78f0f7361816.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=4a0f6d094936acaf59e096f44cd88d03/bc315c6034a85edf0c51d0134b540923dd547524.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=a987184f7af0f736d8fe4c093a54b382/e924b899a9014c086ce50695087b02087bf4f427.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1f456e8b4510b912bfc1f6f6f3fdfcb5/ad4bd11373f0820288fbb80f49fbfbedab641b90.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=fbb3b764014f78f0800b9afb49310a83/1f30e924b899a9014c5672061f950a7b0208f59a.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=339eeedeb68f8c54e3d3c5270a282dee/251f95cad1c8a78655d8623e6509c93d70cf500b.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=1c936f8b4510b912bfc1f6f6f3fdfcb5/ad4bd11373f082028b2db90f49fbfbedab641b46.jpg").split("@hj@");
		
		url89 = ("http://imgsrc.baidu.com/forum/w%3D580/sign=9b1ec7ee3f6d55fbc5c6762e5d234f40/36d3d539b6003af3870e7750372ac65c1038b64e.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=10d82c1c8501a18bf0eb1247ae2f0761/6d224f4a20a4462392fb0f529a22720e0cf3d7c9.jpg@hj@http://imgsrc.baidu.com/forum/w%3D580/sign=9ef5d3c6a5efce1bea2bc8c29f51f3e8/a61ea8d3fd1f41349910954e271f95cad1c85ede.jpg@hj@" +
				 "http://imgsrc.baidu.com/forum/w%3D580/sign=38ed53eda964034f0fcdc20e9fc37980/28381f30e924b899da17e4086c061d950a7bf6d3.jpg").split("@hj@");
	}
	
	public void initText()
	{
		text = new String[90];
		text[0] = "我有罪,我们在贩卖艺术品..";
		text[1] = "鼓浪屿的精致之美..";
		text[2] = "做人如果没梦想,跟咸鱼有什么分别..";
		text[3] = "青春是最棒的..";
		text[4] = "其实我很可爱..";
		text[5] = "我就想这样静静地和你坐在一起..";
		text[6] = "随梦.追逐..";
		text[7] = "在你离开之后的天空..";
		text[8] = "我想和你走过,江南的每一座小镇..";
		text[9] = "刘诗诗..";
		text[10] = "移轴镜头,不一样的世界..";
		text[11] = "那些早早消失在我成长里的人，谢谢你们曾经的出现..";
		text[12] = "那些早早消失在我成长里的人，谢谢你们曾经的出现..";
		text[13] = "一杯水听完冷笑话说：我硬了..";
		text[14] = "你所需要的一切，不过唾手可得..";
		text[15] = "伫立在路边静静地观望和怀疑..";
		text[16] = "我们都老得太快，却明白得太迟..";
		text[17] = "许多人的所谓成熟，不过是被习俗磨去了棱角..";
		text[18] = "我曾经恨别人，但后来我发现这不对..";
		text[19] = "原谅自己，和原谅别人..";
		text[20] = "从现在起，我开始谨慎地选择我的生活..";
		text[21] = "有时候，不要把世界看得太孤单了..";
		text[22] = "不要急于表达，倾听获益更大..";
		text[23] = "当坐下来聊聊天已经变的不太容易的时候..";
		text[24] = "如果我们没有忘记过去，从来都不是因为怀念别人..";
		text[25] = "缘起,在人群中,我看见你..缘灭,我看见你,在人群中..";
		text[26] = "心灵之间，文字最短。可以说话，不许出声..";
		text[27] = "我刚在心里骂了句傻逼，自己就狂打了两声喷嚏..";
		text[28] = "许多不切实际的鼓励/大都是来自酒肉朋友或是远房亲戚..";
		text[29] = "我不知道我是谁，我不知道我想要什么..";
		
		text[30] = "后悔无期..";
		text[31] = "我们最不爱付出代价，却极爱取得";
		text[32] = "最怕空气突然安静..";
		text[33] = "竭尽全力的人，无所谓奇迹的发生..";
		text[34] = "我的睫毛实在不够长，遮不住眼睛，遮不住光芒，遮不住我的内心惶惶..";
		text[35] = "总是差那么一点的义无反顾，让我始终做不成那个想要的自己 ..";
		text[36] = "比容颜衰老得更快的，是我们曾经不顾一切的热情..";
		text[37] = "似乎习惯了等待，单纯的以为等待的就会到来…";
		text[38] = "睡眠最美之处在于它可能有梦，现实最美之处在于它可以有梦想..";
		text[39] = "答案还是自己找到的好..";
		
		text[40] = "有多少勇敢，是因为不经世事。有多少退缩，是出于尝尽沧桑..";
		text[41] = "我们是否在走这样一条路,找寻别人,便遗失自己；找寻自己,却失散别人..";
		text[42] = "你有你的不想说，我有我的想太多..";
		text[43] = "这个世界上，最宽广的是海洋，比海洋更宽广的是天空..";
		text[44] = "不惹眼，不闹腾，也不勉强自己，要做个落后于时代的人，凝视人心..";
		text[45] = "Home is wherever I am with you..";
		text[46] = "任何一个不给力的现在，都有一个不太努力的曾经..";
		text[47] = "只有在旅行时，才听得到自己的声音..";
		text[48] = "直觉是心中最难被抹去的存在，它没有依据，却如此清晰..";
		text[49] = "疯是很容易的事情，不疯才需要意志..";
		
		text[50] = "所有发生过一次的事，可能永远不会再发生；但所有发生过两次的事，肯定还会发生第三次..";
		text[51] = "也许是因为有太多喜悦痛苦无人可说，或是你的感触点总和身边人的不同，说了也无人可懂，渐渐你也就只能去压抑这些生而无用的感受了..";
		text[52] = "不知不觉，有些话就已不知该如何说出口。尽管曾经我们那么翘首以盼。";
		text[53] = "有些人可能会对你突生好感 也可能转眼对你失去兴趣 这都是很正常的事..";
		text[54] = "承认吧，很多事情就算给你一次重头再来的机会，结局也往往与现在相同..";
		text[55] = "你尽力了，才有资格说自己的运气不好..";
		text[56] = "爱，要说出来..";
		text[57] = "我理解，行走的过程，即是人生。如果有体会，不妨记下。因为，机不可失，时不再来..";
		text[58] = "“你在同一个地方等了那么久，究竟在等什么？”“我在等待奇迹发生。”..";
		text[59] = "自己的好自己不知道，永远都是爱你的那个才懂..";
		
		text[60] = "对有些人来说，生活就是不断破墙而出的过程，而对另外一些人，生活是在为自己建起一座座的围墙";
		text[61] = "我一直认为付出是美好的..";
		text[62] = "如果自己不战斗，无论上帝还是恶魔都不会愿意你助一臂之力..";
		text[63] = "我的世界，豁然开朗..";
		text[64] = "你以为挑起生活的担子是勇气，其实去过自己想要的生活，才更需要勇气..";
		text[65] = "很久以前，你不知道我的名，我也不知道你的名，我们遥远的像钟声..";
		text[66] = "很多时候我沉默，并不代表我认可，只是一时间还没想出一种不会伤害到你的表达去否认..";
		text[67] = "清明那天，我会掸掸床，就当是扫墓了，里面埋葬了我多少的梦想和年华..";
		text[68] = "懒是一个很好的托辞，说得好像勤快了就真能干出什么大事儿一样..";
		text[69] = "在这个世界上别太依赖任何人，因为当你在黑暗中挣扎的时候，连你的影子也会离开你..";
		
		text[70] = "关于我 的 那些梦";
		text[71] = "你是不是也时常在自信与自卑中徘徊..";
		text[72] = "只要活着，就一定会遇到好事呢";
		text[73] = "如果觉得生活是一种刁难，一开始就输了...";
		text[74] = "亲爱的老朋友，如果有天我们变陌生了";
		text[75] = "有关幸福生活的定义";
		text[76] = "千万别往后退..";
		text[77] = "让风把眼泪吹干.......";
		text[78] = "所谓心事，不过是不如己意";
		text[79] = "很有趣的解释良心是什么";
		
		text[80] = "世界上的事都没什么大不了的。我们笑的时间，远远超过了哭";
		text[81] = "当手里的每一张牌都是坏牌，想要赢一把的唯一办法就是打破游戏规则";
		text[82] = "你有很多话要说，所以你才会沉默。";
		text[83] = "没吃饱,人只有一个烦恼;吃饱了,人就有无数个烦恼";
		text[84] = "别人再好，也是别人。自己再不堪，也是自己";
		text[85] = "当一个孩子有一天意识到大人们都不完美时，他成为了少年；某天他原谅了他们，就变成了大人。";
		text[86] = "说真话的好处就是，你不必记得你都说过些什么。";
		text[87] = "如果有来生，要做一棵树";
		text[88] = "家庭环境真的真的很重要";
		text[89] = "要想尽一切办法";
		
		text0 = ("我有罪,我们在贩卖艺术品..@hj@我有罪,我们在贩卖艺术品..@hj@我有罪,我们在贩卖艺术品..@hj@我有罪,我们在贩卖艺术品..@hj@我有罪,我们在贩卖艺术品..").split("@hj@");
		text1 = ("鼓浪屿的精致之美..@hj@鼓浪屿的精致之美..@hj@鼓浪屿的精致之美..@hj@鼓浪屿的精致之美..@hj@鼓浪屿的精致之美..").split("@hj@");
		text2 = ("做人如果没梦想,跟咸鱼有什么分别..@hj@做人如果没梦想,跟咸鱼有什么分别..@hj@做人如果没梦想,跟咸鱼有什么分别..@hj@做人如果没梦想,跟咸鱼有什么分别..@hj@做人如果没梦想,跟咸鱼有什么分别..").split("@hj@");
		text3 = ("青春是最棒的..@hj@青春是最棒的..@hj@青春是最棒的..@hj@青春是最棒的..@hj@青春是最棒的..").split("@hj@");
		text4 = ("其实我很可爱..@hj@其实我很可爱..@hj@其实我很可爱..@hj@其实我很可爱..@hj@其实我很可爱..").split("@hj@");
		text5 = ("我就想这样静静地和你坐在一起..@hj@我就想这样静静地和你坐在一起..@hj@我就想这样静静地和你坐在一起..@hj@我就想这样静静地和你坐在一起..@hj@我就想这样静静地和你坐在一起..").split("@hj@");
		text6 = ("随梦.追逐..@hj@随梦.追逐..@hj@随梦.追逐..@hj@随梦.追逐..@hj@随梦.追逐..").split("@hj@");
		text7 = ("在你离开之后的天空..@hj@在你离开之后的天空..@hj@在你离开之后的天空..@hj@在你离开之后的天空..@hj@在你离开之后的天空..").split("@hj@");
		text8 = ("我想和你走过,江南的每一座小镇..@hj@我想和你走过,江南的每一座小镇..@hj@我想和你走过,江南的每一座小镇..@hj@我想和你走过,江南的每一座小镇..@hj@我想和你走过,江南的每一座小镇..").split("@hj@");
		text9 = ("刘诗诗..@hj@刘诗诗..@hj@刘诗诗..@hj@刘诗诗..@hj@刘诗诗..").split("@hj@");
		
		text10 = ("在看近距离小物体时，因为人眼对焦的原因，会有某一距离清晰其他距离模糊的情况。而移轴镜头可以使正常尺寸的物体也变成一个距离清晰，其他距离模糊，从而欺骗人眼，让人根据以往的经验觉得这也是小物体。@hj@1@hj@2@hj@3@hj@4@hj@5@hj@6@hj@7@hj@8@hj@9@hj@10@hj@11").split("@hj@");
		
		text11 = ("有些人不能在一起，可他们的心在一起；有些人表面在一起，但心却无法在一起；有些人从没想过在一起，却自然而然的在一起；有些人千辛万苦终于在一起，却发现其实他们并不适合在一起 ------ 虽然我们不能在一起了，但并不代表我不爱你了@hj@不要相信努力就会成功的鬼话，关键是你看待成功的标准，还有你所努力的方向，要相信一个男人你即使在努力也是生不出孩子的。更不要相信什么理论可以改变你的生活，出身第一重要，运气第二重要@hj@" +
				  "失败了就要承认，做错了就要认错，不要讲理由，那样只能让人觉得你更恶心。@hj@年轻时相信自己是唯一的，自己可以改变世界是正常的，是可爱的。三十岁了，清醒点，哥们，你能把你自己照顾好把家照顾好再谈别的。 年轻时相信自己是唯一的，自己可以改变世界是正常的，是可爱的。三十岁了，清醒点，哥们，你能把你自己照顾好把家照顾好再谈别的@hj@不要经常沉浸在悔过当中，更不要把所有的错误都归结到自己身上，如果你已经这样了，去医院检查下看是不是抑郁症，或者你选择去死，否则你活着很痛苦@hj@" +
				  "男追女没有追不到的，只要你努力。女追男可没准@hj@先爱上对方的人肯定吃亏的，你就认了吧。不丢人@hj@人不要脸了鬼都怕，你要学不会不要脸那你就学如何忍受别人的不要脸@hj@每个人的价值观都不一样，不要拿你自己的去评判别人的，这就是尊重@hj@别觉得你自己很牛B，其实你啥也不是，脆弱的不如个鸟@hj@人活着有很多无奈，有很多你解决不了的问题，要么你认可并忽略。要么你就去死，就这么简单点事儿@hj@" +
				  "人生无常，不要错过，别听信错过的才是美好的鬼话，那是自己安慰自己玩的把戏，你错过了留给别人好了。除非你能力不到，否则你别选择错过。自己骗自己最不好玩@hj@做好你的每一天，珍惜你现在拥有的一切你就会快乐。黄泉路上无老少，把所有的机会都当作唯一的@hj@读书要去实践，不要相信书，但是并不妨碍你多读书，记得一定要实践@hj@真正的东西是不需要证明的，如果你坚信你对，别在意别人怎么看你，如果你坚信你是好人，无须任何证明，我的经验，一般带证明的东西假的多@hj@" +
				  "不要觉得你很聪明或者很傻，那不重要，你只要思索这个问题就会很痛苦，世界上没有聪明人和傻子@hj@命苦不能怨go-vern-ment，点被不能怨社会，脚下泡自己走，自己配药自己吃。你今天的境遇是由于你昨天的表现所导致的，你不要怪任何人@hj@可以骄傲、可以张扬，过度的谦虚等于骄傲").split("@hj@");
		
		text12 = ("学会正确的表达思想，从“我要”开始练习，越直接越好@hj@学会正确拒绝别人，从“不”开始练习，越直接越好@hj@做个强者，不要示弱要任何人同情。可以被人嫉妒，但是不要被人同情，我们不需要任何形式的同情@hj@相信自己是唯一的，相信自己所做的每一件事情都是唯一的，相信自己的爱情是唯一的，相信自己的经历是唯一的，没有什么可参照的，因为这一切的导演都是你自己@hj@是龙盘着，是虎卧着，人有失落失意的时候，你好生养着，不要自甘堕落，至少在精神上。@hj@" +
				  "不要对夏虫言冬景，你有你的生活圈子，别人有别人的生活圈子，有些真理在别人眼里会是炫耀。一个白痴和你说鸡蛋有把！你要回答，恩还挺长的@hj@坏把式光说不练，笨把式光练不说，好把式能说能练@hj@这个世界上没有好人和坏人，也不全是商人，一切看情况而定。你记住就好了，是人都有弱点，弱点就是贪婪和恐惧@hj@" +
				  "仁慈是好的，但是你有没有想过，你现在乱发善心，不如立志做出一翻事业，那样可以帮助更多的人@hj@这个世界是绝对的不公平，要么你顺从，要么你把天平倾向自己，否则你就别怨天由人，那没用!@hj@不要相信唯心，那是阶级的统治工具，唯物是硬道理。这个和你的宗教信仰无关，即使菩萨会帮助你那也是有N多条件的，求人不如求己@hj@真理掌握在少数人手里没错的，但是不要忽略存在就是合理的理论，除非你有很强大的决心改变世界，否则你要适应生活@hj@" +
				  "只要你愿意，你不必理会任何人对你的评价，前提是你得奈的住寂寞，否则建议你，随大流好了@hj@这个年月惟有父母和钱是靠的住的，朋友和女人，要看你的运气，人靠运气生活是要不得的@hj@感情是不对等的，你很在意对方，不必要求对方是否在意你，你付出了说明你乐意，所以你不必委屈。@hj@不要觉得你个人很重要，没有了你太阳明天照样会升起来，这是墨非说的，真实不虚@hj@计划没有变化快，变化没有电话快，设定目标要留余地，给自己也是给他人。但是一定按照计划执行@hj@" +
				  "不要认为所有的人都是人，有些不过是长了个人样子而已，不要和他们计较，由他们去，远离是你唯一所要做的@hj@人生有两难，一是把自己脑子里的东西放到别人脑子里，二是把别人口袋的钱装到自己口袋，要慢慢来，你急了没用@hj@你的心有多大，你的世界就有多大，你每天只是期盼一个窝头，你也就那样了").split("@hj@");
	
		text13 = ("一杯水听完冷笑话说：我硬了..@hj@和一群朋友，聊聊青春的事儿，就是一个家，酒肉完毕，压压马路，黑夜不会太长，白天不会太慌。@hj@如果你敢冒迷途的危险，也许这一天，你会遇见那条通往自己内心深处的小径@hj@不是所有的人都能知道时光的涵义，不是所有的人都懂得珍惜。太多的人喜欢把一切分成段落，每一个段落都要斩钉截铁地宣告落幕。而世间有多少无法落幕的盼望，有多少关注多少心思在落幕之后也不会休止。我亲爱的朋友啊！这世间并没有分离与衰老的命运。只有肯爱与不肯去爱的心@hj@" +
				  "人活在世上，就是为了忍受摧残，一直到死。想明了这一点，一切都能泰然处之。@hj@路若走得不够艰难，你就该怀疑它是不是对的@hj@当一个人被注入新的活力，并拥有善于发现的习惯，他不仅情绪会改变，心也改变了。这便是为什么花时间去看、去听、去接受影像和语言的崭新体验，会以各种方式改变一个人@hj@要容忍心里难解的疑惑，试着去喜爱困扰你的问题。不要寻求答案，你找不到的，因为你还无法与之共存。重要的是，你必须活在每一件事情里。现在你要经历充满难题的生活，也许有一天，不知不觉，你将渐渐活出写满答案的人生@hj@" +
				  "在一个人逐渐成熟之际，为何只能变得更加谨慎呢？我想是由于害怕失败的缘故；我总是容易忘记我的收获，却只记得所有失去的。挫折堆叠得很高，它摧毁了我全部的信心，直到我长大成人后再也没勇气尝试冒险。我用前半生努力让自己变成一个成年人，也许后半生该学习如何做个小孩@hj@我们多多少少都会因为被期许，把人际关系摆在首位，认为自己倒是其次。我发觉这想法一直都是错的，其实应该把自己看作最重要的。而最重要的事就是找回掩埋的自我，呈现出心中爱玩儿、脆弱的部分，保有自己的本色，并且更加相信直觉。现在我要把自己重新组成原先完整的样子@hj@" +
				  "这是一个你不能睁大眼睛什么都看的地方。你只能选择性地看、做自己的事。如果你放眼乱看，你会很不安，各种苦难就在你身边。你要学会视而不见，无动于衷，打你的麻将，看你的港片录像带，日子才能过下去@hj@我们之间最真实的感情，就是我们谁也救不了谁，谁也不想救谁@hj@每个人都可能成为施虐者和受虐者，神经和欲望被捆绑起来，有时会感到格外舒服。灵魂往往厌倦自己的身影，彷徨和虚无纠结于心。也许你也愤世嫉俗，但本身都不能脱俗，所以高雅是一套服装，扒下的时候才有快感。花会褪色，所以总有一些时间红得鲜艳，绽入得灿烂诱惑，甚至恬不知耻@hj@" +
				  "只有在完全的听天由命和孤独状态，我们才能体验到我们自身天性的积极力量。悲观反而是过的太幸福造成的@hj@当你一旦决定要彻底接受一件事实的时候，你的内心对世界上所发生的一切就会比平时多出百倍的敏锐，而不是麻木、封闭自己@hj@所有的人、事、物都是你内在的投射，就像镜子一样的反映你的内在。当外界有什么东西触动你的时候，记得要往内看。看看自己哪个地方的旧伤又被碰触了，看看自己有哪些阴影还没有整理好。不要浪费能量在那些外在的，不可改变的东西上。先在内在层面做一个调和整理，再集中精力去应付外在可以改变的部分@hj@" +
				  "在人生或者职业的各种事务中，性格的作用比智力大得多，头脑的作用不如心情，天资不如由判断力所节制着的自制，耐心和规律。 在人生或者职业的各种事务中，性格的作用比智力大得多，头脑的作用不如心情，天资不如由判断力所节制着的自制，耐心和规律@hj@每一个人身上都拖带着一个世界，由他所见过、爱过的一切所组成的世界，即使他看起来是在另一个不同的世界里旅行、生活，他仍然不停地回到他身上所拖带着的那个世界去。@hj@了解什么是哀痛的人，知道如何活下去@hj@" +
				  "希望别人来分担你的心事是多么愚蠢！别人不会了解你的，人人都只关心他们自己。有些事不能告诉别人，有些事不必告诉别人，有些事根本没办法告诉别人，而且有些事是，即使告诉了别人，你也会马上后悔的。所以，假使你够聪明，那么最好的办法就是静下来，啃噬自己的寂寞，或者反过来说，让寂寞吞噬你@hj@在人生旅程中，有那么一段自卑的经历并不见得是一件坏事。我相信他们说的，童年生活是我们一生的全部基础。在童年那段孤独的岁月里，心灵反而获得了自由的伸展和无尽的想象。莫里亚克说：在我所有的作品里，都有个童年的梦，它有最初的孤独和亲吻。 在人生旅程中，有那么一段自卑的经历并不见得是一件坏事。我相信他们说的，童年生活是我们一生的全部基础。在童年那段孤独的岁月里，心灵反而获得了自由的伸展和无尽的想象。莫里亚克说：在我所有的作品里，都有个童年的梦，它有最初的孤独和亲吻。@hj@" +
				  "生命中有很多东西，能忘掉的叫过去，忘不掉的叫记忆。一个人的寂寞，有时候，很难隐藏得太久，时间太久了，人就会变得沉默，那时候，有些往日的情怀，就找不回来了。 或许，当一段不知疲倦的旅途结束，只有站在终点的人，才会感觉到累。其实我一直都明白，能一直和一人做伴，实属不易").split("@hj@");
	
		text14 = ("你所需要的一切，不过唾手可得。但你总是觊觎那些无法拥有之物。不管有没有柔软的内心，我们起码要具备坚强的外表。成年人的世界更多荆棘，披荆斩棘，全靠这一副肉身。若不小心应对，难保不满身伤痕@hj@我们经常会为我们的行动做出解释，但在这个旨在为了让人们信服的理性解释背后，潜藏的是我们根本没有说出来的真正原因。即使我们说出了“真正原因”，也是靠不住的，因为在这背后还有一个真正的原因，是连我们自己都一无所知的神秘原因@hj@有人不断由一个城市换到另一个城市，过的是他在任何城市所过雷同的生活；有人不断爱上别人又被别人爱，爱的是他在任何人身上都能看到的自己；世界再大，大不过一颗心，走得再远，远不过一场梦@hj@" +
				  "熬夜，是因为没有勇气结束这一天；赖床，是因为没有勇气开始这一天。 你还没睡吗@hj@对于烦恼和情绪，无需抗拒，不要跟随，却要看着它，仅只是看到，你就开始 远离它了。因为，身在其中，什么到看不到，一旦能看到，已经不在其中@hj@这世上，有太多人爱得潦草肤浅，心肺仿佛结了霜，也有人爱得太偏执过火，眉焦目盲。我们先是错太多，然后又错过太多，到最后究竟能有多少人可以与对的那个人相守？@hj@我时常觉得，要了解一个人的行为模式最直接的方法莫过于观察他的父母，时间越长越容易发现，孩子的脾气秉性及应对冲突的本能反应跟父母简直如出一辙，理智和冷静那都是后天的教养，影响幸福感最根本的因素还是那些父母留在孩子身上最初的隐秘痕迹@hj@" +
				  "人生在世，快乐和痛苦本就分不清，我只求它货真价实@hj@你所追求的完整与圆满，其实就在你自己身上。如果你自己的船浮不起来，没有人愿意陪你远渡重洋@hj@不要让我们的眼睛因渴望见你的面容而酸楚。爱直到分别的时刻，才知道自己的深度。记忆是相会的一种形式；忘记是自由的一种形式@hj@如果我能平息我心中的冲突，我就相信自己已经很幸福了@hj@于是我明白了，让我难过的，不是你不在，而是，你无处不在@hj@" +
				  "有时候，莫名其妙地认识一个人，后来又理所当然地忘掉了。和你搭话的人可能别有用心，让人与人之间产生了警觉。这是一个无情无义的时代，睡觉很容易发生。但是别误会，不一定有爱情。可人生苦短，爱的愿望和爱的能力配合得又不一定默契，最后演绎成男女的兽性，他们还官冕堂皇转过身去相亲。挺没劲的@hj@真想一起做一个万里长梦，醒来时脸上已是半个世纪后的样子。@hj@在一回首间，才忽然发现，原来，我一生的种种努力，不过只为了周遭的人对我满意而已。为了博得他人的称许与微笑，我战战兢兢地将自己套入所有的模式所有的桎梏。走到途中才忽然发现，我只剩下一副模糊的面目，和一条不能回头的路@hj@" +
				  "大多数人认为对自己只有强制，否则不会有任何出息。他们醉心模仿，人人都要尽量不像自己，人人都挑个楷模来仿效，甚至并不选择，而是接受现成的楷模。可我认为人的身上还另有可观之处，人们却不敢翻过页面。要知道，自身感到的不同于常人之处，恰恰是希罕的使其人具有价值的东西@hj@你终日怨天尤人地过活，愤恨社会不公，抱怨生不逢时，其实不过是把一切怪在外界或者他人身上。然而有一天，你发现芸芸众生中，有一个人完完全全地承认并接受你现在的模样，你就有了活下去的勇气，而后连思想都会发生改变@hj@爱情与成熟度有关。如果不努力发展自己的全部人格，那么每种爱的努力都会失败；如果没有爱他人的能力，如果不能真正谦恭地、勇敢地、真诚地和有纪律地爱他人，那么人们在自己的爱情生活中也永远得不到满足@hj@" +
				  "只有当人能够察看自己的内心深处时，他的视野才会变得清晰起来。向外看的人是在梦中，向内看的人是清醒的人@hj@我们从来都局限在自己根深蒂固的感知中，不能放眼看待周遭的世界，更严重的是，我们放弃认识他人，认识的仅是我们自己，然而却无法在这些永恒的镜子上认清我们自己。如果我们认识到这一点，意识到我们在别人眼里只看到了自己，我们是大漠里的孤影，我们可能会发疯吧。").split("@hj@");
	
		text15 = ("这个世界大多数人是用脚趾头来思索世界和选择道路的，如果偏要用头脑和思想选择道路，那么就应该承担起不合潮流的孤寂，像一个身躯佝偻如同问号的老人一般，伫立在路边静静地观望和怀疑@hj@快乐是一种成熟的能力，用幽默的态度消解种种难题的能力。我觉得，一个智慧的人，他的人生走向也许是这样的：激烈的悲观主义——温和的怀疑主义——明晰的乐观主义。这个乐观主义不是傻乐，这里边依然有怀疑否定，但多了一层坦然，一层“世事沧桑心事定”的豁达，看开了，快乐也是一种阅历吧@hj@我现在愈发体会到“顺应”这个词的智慧，这里的“顺应”是顺应由内而来的天性。我觉得这是对生命对人性最大的尊重。生活应该是水一样的随和的自然态度，一种无所谓的境界，而这种无所谓，其实又是一种最大的自我克制才能达到的境界@hj@" +
				  "我们各自心中都有某些不愿意摒弃的东西，即使这个东西使我们痛苦得要死。我们就是这样，就像古老的凯尔特传说中的荆棘鸟，泣血而啼，呕出了血淋淋的心而死。咱们自己制造了自己的荆棘，而且从来不计算其代价，我们所做的一切就是忍受痛苦的煎熬，并且告诉自己这非常值得@hj@当你觉得处处不如人时，不要自卑，记得你只是平凡人。当别人忽略你时，不要伤心，每个人都有自己的生活，谁都不可能一直陪你。当你看到别人在笑时，不要以为世界上只有你一个人在伤心，其实别人只是比你会掩饰。当你很无助时，你可以哭，但哭过你必须要振作起来，即使输掉了一切，也不要输掉微笑@hj@真正的光明决不是永没有黑暗的时间，只是永不被黑暗所掩蔽罢了。真正的英雄决不是永没有卑下的情操，只是永不被卑下的情操所屈服罢了。所以在你要战胜外来敌人之前，先得战胜你内在的敌人；你不必害怕沉沦堕落，只消你能不断的自拔与更新@hj@" +
				  "可怕的不是圆滑，不是懦弱，不是逆来顺受，不是暂时没有追求，不是虚伪，也不是麻木对待感情，而是变得圆滑了，懦弱了，虚伪了，麻木了之后，还给这种状态起了一个好听的名字，叫成熟@hj@年轻女孩因为物质而选择男人是可惜和浪费：她们失去了追寻自己是谁的机会，吃苦趁年轻才能发掘出身体里的宝藏，老了再面临险境后悔晚矣！不要选“容易的路”，那其实是最艰难的。未经世故的女人习于顺境，易苛以待人；而饱经世故的女人深谙逆境，反而宽以处世 .年轻女孩因为物质而选择男人是可惜和浪费：她们失去了追寻自己是谁的机会，吃苦趁年轻才能发掘出身体里的宝藏，老了再面临险境后悔晚矣！不要选“容易的路”，那其实是最艰难的。未经世故的女人习于顺境，易苛以待人；而饱经世故的女人深谙逆境，反而宽以处世@hj@" +
				  "人总是害怕追求自己最重要的梦想，因为他觉得自己不配拥有，或是觉得自己没有能力完成@hj@人这一生能有多少个时刻会爱上一个人，而爱情中最大的悲剧就在于当那句“我爱你”还没来得及说出口的时候，你爱的那个人已消失在人海中@hj@我喜欢不迟到的人.喜欢不说谎的人.喜欢有真性情的人.我也喜欢说出的话与行动相符的人.喜欢内心有温柔和想象力的人.喜欢对一切持有善意而又有力的人.喜欢内心有价值观态度坚定不屈服于集体的人.喜欢孩子一样容易付出容易受伤容易复原的人.喜欢相信爱和实践爱的人。—— 安妮宝贝@hj@" +
				  "你必须很喜欢和自己作伴。好处是：你不必为了顺从别人或讨好别人而扭曲自己@hj@你拥有青春的时候，就要感受它。不要虚掷你的黄金时代，不要去倾听枯燥乏味的东西，不要设法挽留无望的失败，不要把你的生命献给无知、平庸和低俗。这些都是我们时代病态的目标，虚假的理想。活着！把你宝贵的内在生命活出来。什么都别错过@hj@小孩跌倒时，若左右一瞥，没有大人在身边，竟便不哭，干脆自己爬起来算了。——有人呵护你的痛楚，就更疼。没有人，你欠矜贵，但坚强争气@hj@" +
				  "人们回避真实并非都由于缺乏诚实的品质，更多的情况是出于麻木、软弱、仁慈，或者仅仅是因为忍受不了真理的直截了当。接受真实可以比说谎更为痛苦和窘迫，自欺是逃避现实的一种方便而舒服的方式@hj@谁能尽情享受瞬间的快乐，谁总是能活在现在，不瞻前顾后、忧心忡忡，而去亲切谨慎地评价每个小小的，嬉戏的瞬间价值，那么谁就不能被生活损害一分一毫。 谁能尽情享受瞬间的快乐，谁总是能活在现在，不瞻前顾后、忧心忡忡，而去亲切谨慎地评价每个小小的，嬉戏的瞬间价值，那么谁就不能被生活损害一分一毫@hj@我发现你很喜欢揣着明白装糊涂,何必呢?!").split("@hj@");
	
		text16 = ("自卑，历来送给人间两样东西：爱的期盼，与怨愤的积累。爱原就是自卑弃暗投明的时刻。自卑，或者在自卑的洞穴里步步深陷，或者转身，在爱的路途上迎候解放@hj@大学毕业后的那段日子非常难熬。我拒绝长大，是因为我觉得我根本办不到父母20多岁时已轻松完成的事：比如买房，拥有固定职业，建立家庭。那段岁月非常不安和焦虑，并持续了很久。事实上，我生命中的一个阶段因此被过分延长，以至于很久之后我才开始进入成年人阶段。@hj@懂的人懂，让不懂的人不懂。让世界是世界，我甘心是我的茧@hj@有多少人嘴里喊着努力...其实只是躺在床上想想呢..@hj@大家都很坦然地活在自己的世界里，而我自从丢失，找了好久@hj@" +
				  "你遭受了痛苦，你也不要向人诉说，以求同情，因为一个有独特性的人，连他的痛苦都是独特的，深刻的，不易被人了解，别人的同情只会解除你的痛苦的个人性，使之降低为平庸的烦恼，同时也就使你的人格遭到贬值@hj@人们总是错把熟悉当作认识，其实，熟悉即习惯，而习惯了的东西正是最难认识的@hj@对于我们自己来说，我们的个性甚至都是无法看透的：这就是为什么我们的职责就是不断梦想，包括梦想我们自己。不要对自己持有什么定见@hj@不能决定生命的长度，但你可以扩展它的宽度；不能改变天生的容貌，但你可以时时展现笑容；不能企望控制他人，但你可以好好把握自己；不能全然预知明天，但你可以充分利用今天；不能要求事事顺利，但你可以做到事事尽心@hj@" +
				  "我们都是这样的人：面对压力，我们本能地选择顺从，因为我们没有被说服过，也懒得说服别人；人，都是骄傲和自以为是的，相安无事的唯一办法是欺骗@hj@我永远只是我自以为是的那个人，而这个人又在不断变化，因此如果我不留意，早上的我就已不认识晚上的我。只有在孤寂的时候我才能看到本质的我。我时常躲开自己，变做另一个人。我的生活因此显得紧张@hj@不要让将来的事困扰你，因为如果那是必然要发生的话，你将带着你现在对待当前事物的同样理性走向他们。@hj@独处的确是一种检验，用它可以测出一个人灵魂的深度，测出一个人对自己真正的感受。一个连自己也不爱的人，我敢断定他对于别人也是不会有多少价值的，他不可能有高质量的社会交往。一切交往的质量都取决于交往者本身的质量。唯有在两个灵魂充实丰富的人，才可能有真正动人的爱情和友谊@hj@" +
				  "我要用尽所有的生命只能划出一条自身存在的曲线。似乎我没有最终的目的，可是这曲线上的每一点都有我的汗水和思维的痕迹。挖下去，永不停息。也许什么也挖不着。可是一定可以挖到我自己。在挖的过程中，我找到了自身灵魂的轨道@hj@我要几位知心友，不必拘守成法，肯向我倾吐他们的苦衷。几位可与深交的友人，同时能尊重我的癖好和主张。我要有能做我自己的自由，和敢做我自己的胆量@hj@现实的精华就是匮乏，一种普遍而永恒的欠缺，这个世界上的一切东西都不够人们受用。食物不够，爱不够，正义不够，时间永远不够@hj@大多数人的行为不稳定，不依据精神特质而存在。大多人要么生活在一种孩子气的天真中，要么生活在琐碎无聊中。这一时他们做出某种善的举动，下一刻又免不了荒唐。他们如此往复：这一时他们是绝望的，可能过三个星期后他们又是快乐的家伙，而后又是绝望的一天@hj@" +
				  "我在精神上离群索居，用阅读来抗拒粗陋的生活与不知不觉的堕落，我在一片精神乐园里找到宁静的快乐。我想从中看到一种最初状态的不设限的人生@hj@原来所有妨碍我们爱情的障碍都是一些毫无意义而且不值一提的事物，就像障眼法形成的一种假相。人一旦坠入爱河，再想深入地思考爱情的意义，就应该突破世俗的幸福、不幸、罪恶或美德等现有的观念，从更高、更重要的出发点去思考问题。如果你不愿意这样，那还不如干脆什么都别想@hj@通向智慧之路有三个必经阶段。第一是合群期，崇敬、顺从、仿效比自己强的人；第二是沙漠期，束缚最牢固的时候。崇敬之心破碎了，自由的精神茁壮生长，重估一切价值。第三是创造期，在否定的基础上重新进行肯定，但这肯定不是出于某个权威，而仅仅是出于自己，我就是命运").split("@hj@");
	
		text17 = ("许多人的所谓成熟，不过是被习俗磨去了棱角，变得世故而实际了。那不是成熟，而是精神的早衰和个性的夭亡。真正的成熟，应当是独特个性的形成，真实自我的发现，精神上的结果和丰收@hj@痛是一种很神奇的东西。它把模糊的东西，转化为清晰。把迟钝的东西，转化为尖锐。就是通过被伤害，爱的感觉变的清晰而尖锐。存在感总是与痛感联系在一起，而安全又总是紧挨着麻木@hj@我希望能够远走，逃离我的所知，逃离我的所有。我想出发，去任何地方，不论是村庄或者荒原，只要不是这里就行。我向往的只是不再见到这些人，不再过这种没完没了的日子。我想做到的是卸下我已习惯的伪装，成为另一个我，以此得到喘息。不幸的是，我在这些事情上从来都事与愿违@hj@" +
				  "没有节制，就没有力量。人的一生，都有一些说不出的秘密，挽不回的遗憾，触不到的梦想，忘不了的爱@hj@一个人要获得实在的幸福，就必须既不太聪明，也不太傻。人们把这种介于聪明和傻之间的状态叫做生活的智慧@hj@我们愈是正视自己内心的冲突并寻求自己的解决方法，我们就愈能获得更多的内心的自由和更大的力量。只有当我们愿意对决策负责，甘愿承受打击时，我们才能有希望成为自己的主人。虚假的冷静植根于内心的愚钝，绝不是值得羡慕的。它只会使我们变得虚弱而不堪一击@hj@真正的生活是在撕裂的内部出现的。生活，就是撕裂本身。就是在光的火山上翱翔的精神，是公平的疯狂，是对筋疲力尽的不妥协。对于我们来说，需要的不是乐观主义的公式，而是勇气和智慧的话语。在光亮中，世界始终是我们最初和最后的爱@hj@" +
				  "焦虑是一种最折磨人的心情。它向我们提出了一种含蓄的告诫：我们身上已经有什么出了问题。这实际上是一种警报，它要我们彻底检视我们自己。但事实上，我们最反感的就是意识到我们必须改变自己的某些态度，我们会抱紧自己的妄想不放，不承认自己出了问题@hj@我喜欢你的故事，因为那是你的一部分@hj@不要去欺骗别人，因为你能骗到的人，都是相信你的人@hj@不论如何，情感一旦公开鲜明地表达出来，它马上就有了一些虚假的东西，成了做戏与卖弄。真诚的人从不公开表达自己的情感，真正的感情总是蒙了一层面纱。只有虚伪的人才利用情感作秀，为了给大家看他们有多敏感@hj@只有孤独的孩子才能把全部热情集聚起来。其他人在社交活动中早已滥用了自己的感情，最后把感情消磨殆尽。他们经常谈论爱情，在小说里读到爱情，他们知道，爱情是人共同的命运。他们玩弄爱情，像摆弄一个玩具，他们夸耀自己恋爱的经历，就男孩抽了第一支烟而洋洋得意@hj@" +
				  "传说企鹅以前是会飞的，有只母企鹅因为翅膀短小飞不起来，后来气候巨变，大部分企鹅飞走了，一只公企鹅决定留下来陪她。为了找吃的，它们学习游泳，经过无数次努力，它们终于学会在海中觅食，多年后它们坐在海边，她说：对不起，为了我，让你放弃了天空。他说：没关系，有了你，我才收获了海洋@hj@一切美好的事物都是曲折地接近自己的目标，一切笔直都是骗人的，所有真理都是弯曲的，时间本身就是一个圆圈@hj@我们这样的普通人，有着简单的欲望和喜怒哀乐，生活虽然平庸，但是神圣不可侵犯。人与人之间的差别其实非常小，所以根本没有理由，抱着说教的态度，让别人改变生活。事实上，每个人只可能被生活改变，别人的话多是不相干的@hj@正是一个人怎么看待自己，决定了此人的命运，指向了他的归宿。人类在静静地过着绝望的生活。所谓听天由命，正是肯定绝望。可不做绝望的事，才是智慧的一种表征@hj@" +
				  "问题一经说出，答案已经存在。自言自语好过对人倾诉，这是保护自己心灵唯一的、安全而无公害的方法。记住，不要说出你的秘密，也不要窥视他人的秘密@hj@你频频回首，哪里顾得了前面的路；你不专心赶路，又怎么可能走得远@hj@薪水的压力来自于：前同事、老同学、前女友的现男友、现女友的前男友、现女友闺蜜的男友以及父母朋友的子女。——现代生活的压力定律。。。@hj@一个人永远都不改变的话， 他就会遇到同样的事情发生在他身上，唯有改变以后，它才能获得所谓新手的运气；唯有你能接受自己之后，你才能遇到另一个能很好地接受自己的人；唯有你成为自己想拥有的那个人的时候，你才会遇到另一个像你这样的人").split("@hj@");
	
		text18 = ("我曾经恨别人，但后来我发现这不对。弱者恨强者，没有比这更滑稽的事了，这除了说明弱者之弱外，再没有任何用处。你甚至可以根据这个逻辑去判别谁是弱者。两只狗面对面时，喊叫得最欢的那一只准是马上要逃跑的那一只@hj@你以为事实真的是：你能找到并拥有你最渴求的东西吗？要是有一天你能发现，有什么东西，只要你一碰它就没了、它就不再是它，那时你才懂得什么是适合它的最美的位置，你会宁可若有所失也不愿去破坏这个位置。那时，你心里也许才能更明亮些@hj@不管你对多少异性失望，你都没有理由对爱情失望。因为爱情本身就是希望，永远是生命的一种希望。爱情是你自己的品质，是你自己的心魂，是你自己的处境，与别人无关。爱情不是一个名词，而是一个动词，永远的动词，无穷动@hj@" +
				  "所有事物都想飞，只有我们被欲望的重负压得往下坠，为我们自身所困，为重量所迷惑@hj@不管我们认为在思想上多么独立，我们实际并不了解自己真正的需求，我们受各种观点蛊惑，认为应该得到些不必要的东西。但事实并非如此。一旦到达顶点，我们又会被唤回谷底，重新现于焦虑和欲望的洼池中。生活就是一种焦虑代替另一种焦虑，一种欲望代替另一种欲望的过程@hj@我们这代人啊，带着一身的残缺来到这个世界，在不同的战场上，捡回属于自己的碎片。可谁也记不得原先的模样。于是在别人的碎片里，我们寻找自己的笑容；自己的碎片上，反射着别人的泪光@hj@我们知道的很少；但“我们必须委身于艰难”却是我们永远不该丢弃的信念。寂寞地生存是好的，因为寂寞是艰难的；只要是艰难的事，就有使我们更有理由为它工作@hj@" +
				  "一个人应当尽早地被告知生活的真谛，即人生只是一场化装舞会，通过它，人才能发现自我。否则生活中的许多事情，你不能理解，但又不得不容忍它们，甚至你会对它们完全迷惑不解。红艳艳的苹果是蜡制的，水灵灵的鲜花是丝织的，活蹦乱跳的鱼是纸糊的，所有的东西只是可怜的玩偶和无聊的琐事@hj@如果你站在童年的位置瞻望未来，你会说你前途未卜，你会说你前途无量，但要是你站在终点看你生命的轨迹，你看到的只有一条路，你就只能看到一条命定之路。所有的生命都一样，所有的人都是这样。我们都是这样。我们生来就被规定了一种处境@hj@我曾走过山，走过水，其实只是借助它们走过我的生命；我看着天，看着地，其实只是借助它们确定我的位置；我爱着她，爱着你，其实只不过借助别人实现了我的爱欲@hj@" +
				  "常有人说“女人的黄金年龄很短，只有22—26岁，男人就不一样，到了30,40岁照样不着急”。其实男人的黄金年龄更短，只有16—18岁，在这段时期的他们，长得帅会有人喜欢，打球厉害会有人喜欢，学习好会有人喜欢，玩乐器会有人喜欢，但到了30岁以后只要他没钱，就很少有人喜欢了@hj@对于重逢的形式，我们怕的不是残忍，而是平庸@hj@太盲目地生活不行，太有目的地生活也不行，后者的危害有甚于前者，因为它最后必将使健康的生活变为不可能@hj@不同的人，即使站在同一个地方，透过各自的人生，看到的风景也有所不同@hj@或许过去和未来根本不存在，只是人们随意幻想创造出来的。但人们毕竟摆脱不了对时间的幻想。我们经常后悔着过去的种种，同时又烦恼着未来，还要珍惜把握匆忙的每一天。随着年龄的增长，又开始追寻那种深藏在遥远记忆中的时光@hj@" +
				  "我找到自己之日，就是失落自己之时。如果我相信，我就必然怀疑。我紧紧抓住一些东西的时候，我的手里必定空无一物。生活毕竟是一次伟大的失眠，我们做过或想过的一切，都处在清澈的半醒状态之中@hj@聪明人把他的生活变得单调，以便使最小的事故都富有伟大的意义。真正的聪明人，都能够从他自己的躺椅里欣赏整个世界的壮景，无须同任何人说话，无须了解任何阅读的方法，他仅仅需要知道如何运用自己的五种感官，还有一颗灵魂里纯真的悲哀@hj@我觉得，如果欣赏不了生活的平淡，当所谓的波澜来临时，又怎能完全体会它的壮阔呢。生活不会一直给你惊喜，有心的人却可以自己制造惊喜。有时候琐碎也值得玩味@hj@见过很多类型的男人后，最终觉得男人最大的特点就是单纯，即便年纪大了也还是像小孩子的感觉。如果一个男的总是让女友感到他的成熟，那么，我想，这个女人可能没有能走进他的内心@hj@" +
				  "要进入另一个人的孤独，是不可能的。如果我们真的可以逐渐认识另一个人，即使是很少的程度，也只能到他愿意被了解的程度为止 要进入另一个人的孤独，是不可能的。如果我们真的可以逐渐认识另一个人，即使是很少的程度，也只能到他愿意被了解的程度为止").split("@hj@");
	
		text19 = ("原谅自己，和原谅别人。凡事给别人留条路走。如果真想击败对方，就一点余地也不要留，不要给对方任何翻身的机会，这并不矛盾。一个是为人，一个是做事。@hj@不要轻易的发脾气，那是很软弱的行为，除非对你很信任的人。否则永远不要让别人知道你下一步要做什么。@hj@过程和结果一样重要，两点你尽量做好一点就行。@hj@给对方留面子就是给自己留面子，如果不想留那就一点也不要留@hj@把所有能发生的糟糕情况提前告诉对方，而且要诚恳。@hj@别和别人比，和自己比就行了，天知道你每天进步一点，你一年会是什么样子？十年会是什么样子。只是你能不能坚持每天进步一点。想学英语？你只需要每天记住一个单词，一个语法就行了。十年时间你似乎可以当专家了@hj@说话讲求技巧和欺骗是两个概念的问题，你不要混淆了。@hj@" +
				  "要多理解别人，前提是你想理解别人的时候。反之，不要天真的以为所有人会理解你，你自认应该理解你的人一定多注意，或许她最不理解你@hj@眼睛看到的，耳朵听到的未必是真实的。“聪明”的聪字是这样写的，耳朵听，眼睛看，嘴出说，心去想@hj@人的高低贵贱是自己来定的，和成分无关，你如果轻贱自己，你就贱，你如果认为自己很高贵，并且以高贵的品行来约束自己的言行，你就是高贵的。看清楚是约束，而不是标榜").split("@hj@");
	
		text20 = ("从现在起，我开始谨慎地选择我的生活，我不再轻易让自己迷 失在各种诱惑里。我心中已经听到来自远方的呼唤，再不需要回过头去关心身后的种种是非与议论。我已无暇顾及过去，我要向前走@hj@信心不能倒，决心不动摇，年轻时，我们就该活得像头鲨鱼而不是天鹅@hj@热情是一朵美丽的火花，美则美矣，无奈不能持久。希望热情能永久持续，简直是愚妄；不考虑性情，品德，品格，思想等等而单单执着于当年一段美妙的梦境，希望这梦境将来会成为现实，那么我警告你，你可能遇到悲剧。世界上很少有如火如荼的情人能成为美满的、白头偕老的夫妇的@hj@许多青春期的友谊，会使人在年事稍长后，以交换陈旧回忆的方式，抚慰人们在生命中遭遇的种种创伤或失落，所谓相濡以沫、相忘于江湖。回忆使回忆者当下的现实显得不再那么沉重，也使逝去的现实显得轻盈许多。最后我们都无奈地笑起来，而且笑得一点儿都不勉强，笑得如此顺其自然@hj@" +
				  "大部分的生活都乏味的不值一提，根本就没有不乏味的时候。换另一种牌子的香烟也好，搬到一个新地方去住也好，订阅别的报纸也好，坠入爱河又脱身出来也好，我们一直在以或轻浮或沉重的方式，来对抗日常生活那无法消释的乏味成分@hj@每一次告别都预示着某些宝贵的东西在不可避免地失去，而另一些奇异的东西又在你内心悄然滋长。可事后你又恍然悟到：那些宝贵的东西其实并未远离，只是被埋藏得更深，正默默地、悲伤地而又温暖地存在着。而被它滋养的奇异的东西，也更生动完美，孤独绵长@hj@今天所记忆的，就是明天会遗忘的，就是未来无从追忆的。所以，清醒恐怕是另一场梦，梦见自己并没有做梦。而睡梦不过是夜夜归来的死亡@hj@我始终觉得，尘世中最美好的事情莫过于一次令你心动的相遇。尽管相逢之后，也许又会无奈地离开。我们无从知晓，为了这次相遇，经历了多少漫长的等待，其间夹杂着多少纷纷绵绵的甜蜜与忧伤，苦涩与寂寞。我是多么爱你啊，当下午过去一半，我要如同往常一样和你告别的时候@hj@" +
				  "我们体内生来就有一种情愫，我们所有形式的相遇与彻悟，都是对这种情愫的探究，我们一切的疑惑与控诉，都是对这种情愫的欲求@hj@即使以为自己的感情已经干涸得无法给予，也总会有一个时刻一样东西能拨动心灵深处的弦；我们毕竟不是生来就享受孤独的@hj@美，可以涂脂抹粉乔装打扮，也可以一丝不挂回归天然@hj@想好了一半就立刻行动，剩下那一半行动会告诉你@hj@读书是生活中可有可无的东西，一如爱情。很多人终其一生都不会明白，他们以为是爱情的东西，不过是达成婚姻的手段而已，顶多是婚姻的一段诙谐的序曲。真正的爱情是很少的，一如读书@hj@要人接受一件事和让人改变看法，这是两回事，前者无异于推销商品，因为暂时说服一个人不难，说服的效用，很像麻醉剂，只能管用一两天，不能持久，它治标不治本。在说服的高压下，真正的看法不是彻底被消除，而是被暂时掩盖或压抑了，而根深蒂固的看法则一直躲在暗处，等待伺机反扑。@hj@" +
				  "要不吝拒绝，尊重自己的心意――知道何时把门打开，何时应该关上@hj@每个人都在学习同样的情感关系，它叫亲密，而唯一能体会它的方法就是做你自己").split("@hj@");
	
		text21 = ("有时候，不要把世界看得太孤单了，正如你总在想念某些人，也总会有某些人在一直想念你@hj@一个男人的成长，往往是从索取和伤害开始。但一旦他从男孩蜕变为男人，他就开始了“偿债之路”，他承担起来很多，爱情不是男人生活的唯一，甚至有时在需要取舍时，男人会暂时把爱情放在一边。但这并不是说爱情不重要，其实他们把爱情看得比什么都重@hj@没有人会对你的快乐负责，不久你便会知道，快乐得你自己寻找。把精神寄托在别的地方，过一阵你会习惯新生活。你想想，世界不可能一成不变，太阳不可能绕着你运行，你迟早会长大——生活中充满失望。不用诉苦发牢骚，如果这是你生活的一部分，你必须若无其事地接受现实@hj@如果命中注定有事情要降临在你身上，那么它一定会，你无法迫使任何事发生。而且它往往是在过了你在意它会不会发生的那一刻之后，才会真的发生@hj@" +
				  "所谓心事，不过是不如己意，那就是我执，执著于自己描画的理想，一有落差，即生烦恼@hj@我什么都明白，但是我抵挡不了那种不安，不安把我变成一个傻瓜，出乖现丑，做尽蠢事。即使在幸福中我也是不安的，因为幸福终将改变。保持不变不是宇宙的规律，如果你已经感到幸福，那么它后面跟来的多半就是不幸@hj@当我们把潜力变成行动，从可能性走向现实性的时候，我们才是真实的，也就进一步接近了完满。也就是说，尽其天赋之所能，实现自己的努力，是世人接近神性的一种行为@hj@每个人都是一个深渊，当人们往下看的时候，会觉得头晕目眩。——毕希纳（基斯洛夫斯基注解：人们心底掩藏着深刻的秘密与隐密的梦想。弗洛伊德注解：人类原始的欲望被伦理隐藏极深，真正的人性骇人而恐怖，如深渊深不见底@hj@" +
				  "看似没心没肺的人其实挺容易感伤，都压在很深的地方，碰到一点阳光，碰到一点相似的情节，碰到一点熟悉的背影，甚至碰到一点眉眼，就会不知所措地惊慌逃亡@hj@任何女人都美，都有使人幸福的本领；那种其貌不扬，为男人轻蔑的丑女往往爱得格外热烈专注，那种半老徐娘更有胜过母性温柔的、带哀怨的浓情蜜意；每个女人都有自己的秘宝，每个女人都有自己的魔力，发掘起来令人无限幸福，在这点上女人都一样@hj@有种时候，安慰的话不但显得虚浮，而且简直冷酷，根本无从安慰起@hj@我只能说，在人生的过程里何其幸运与你们相遇，或辗转知道你们的故事；记得你们，记得那些事，是因为在不知不觉中，这一切都已成了生命的刻痕，甚至是生命的一部分。只是……你们也记得我吗@hj@" +
				  "如果你独自一人笑了，那是真心的笑@hj@人的一生中，最光辉的一天并非是功成名就的那天，而是从悲叹与绝望中产生对人生的挑战，以勇敢迈向意志的那天@hj@人们不解释的主要原因是根本不在乎对方的想法，无关重要的人，对无关重要的事有点儿误会，有什么关系，你信也好，不信也好，都于当事人生活毫无影响，何劳解释@hj@没有所谓“矢志不渝”，只因找不到更好的；没有所谓“难舍难离”，是外界诱惑不够大。若真大到足够让你离去，统统拨归于“缘尽”。没有所谓的头也不回，不回顾，当然是马上有了填补，无心恋战。万事都在“衡量”二字@hj@决定某件事情时，我的判断标准大部分都是取决于自己能否完全地说服自己。凡事皆如此。如果以半吊子的心态做选择，一旦遇到严苛考验时，就容易令人感到挫败，后悔当初不该选择这条道路。不是走在一条由衷认同的道路上，也就无法对自己所要背负的辛苦或失败有所觉悟@hj@" +
				  "对你不好的人，你不要太介意，没有人有义务要对你好；你学到的知识，就是你拥有的武器，可以白手起家，但不可以手无寸铁；你怎么待人，并不代表别人怎么待你，如果看不透这一点，只会徒增烦恼；亲人只有一次的缘分，好好珍惜，下辈子，无论爱与不爱，都不会再见@hj@超过了一定年龄，所谓人生，无非是一个不断丧失的过程。 世上有这一类事，不知情反而更好。知道了真相，反倒会伤害你。而且，一旦知道了真相，就得对它承担起责任@hj@如果一开始没有拒绝，后来就难了。人总是试图保持在别人心目中的一致形象。我们承诺过的事情，总会尽力去完成，不然就会产生心理压力，失信于人。正所谓轻诺者寡信。所以不想做的事情，一定从一开始就拒绝，不喝酒就一口都别喝").split("@hj@");
	
		text22 = ("谈话双方，倾听者比谈话者有更大优势，往往是掌控局面的那个。倾听的最高境界是：让试图隐瞒的人滔滔不绝，最后透露想隐瞒之事；让假装高深的人，自动陷入前后矛盾的境地，最后卸掉面具；让满腹忧愁的人毫不避嫌，将心事和盘托出。不要急于表达，倾听获益更大@hj@人最难以发现自己，精神常常欺骗灵魂，沉重就是这样产生的。我敬重那些倔强而挑剔的舌头和肠胃，它们学会了说“我”，说“是”和“否”。我所有的尝试，都是对我的趣味的追问，既不羞愧，也不隐讳。我向道路问路，我向我自己问路，因为属于我的路，在我找到以前，原是不存在的@hj@潜意识是如此影响事件发展的：它首先暗示假设，假设影响观察，观察引发判断，判断产生经验，经验引发行动，反过来，印证了假设，肯定了潜意识@hj@" +
				  "现在的我与从前的区别是，遇到别人对自己的谴责不再据理力争，而是选择沉默闭嘴。事实也证明前者过后往往总是耿耿于怀，后者多半一笑而过听完就忘@hj@过着过着，就到了无话和不说的年龄@hj@忽然明白了，我们的相遇，是找到另一个自己@hj@我们这些人，花了我们生命中最宝贵的一部分来赚钱，就为了在最不宝贵的一部分时间里享受一点可疑的自由@hj@我们偶尔也会疑心周围的人有些事对我们秘而不宣，可总要等到深陷情网之时才会有探究的冲动，而于寻找答案之时，我们才会发现，人们在现实生活中将自己的真实面目掩饰到何种程度@hj@你不要相信，那些试行劝慰你的人是无忧无虑地生活在那些对你有益的简单平静的几句话里。他们的生活有许多辛苦和悲哀，他远远地专诚帮助你。不然，他绝不能找到那几句话@hj@" +
				  "没有了大气的压力我们的身体就会爆炸。同样，人生没有了匮乏、艰难、挫折和厌倦，人们的大胆、傲慢就会上升；无论何时，每个人都确实需要配备一定份额的操劳，或者担心，或者困苦，正如一艘船需要一定的压舱物才能走出一条笔直和稳定的航线一样.匮乏、操劳是所有人终其一生的命运@hj@每个人都身怀天赋，但如果用会不会爬树的能力来评判一只鱼，它会终其一生以为自己愚蠢@hj@在寂寞中你不要彷徨迷惑，由于你自身内有一些愿望要从着寂寞里脱身。一般人把一切都轻易解决，而且按着轻易中最轻易的方法，但很显然，我们必须认定艰难。我们知道的很少，但我们必须委身于艰难，这是我们永不能丢开的信念@hj@生命里某些当时充满怨怼的曲折，在后来好像都成了一种能量和养分，因为若非这些曲折，好像就不会在人生的岔路上遇见别人可能求之亦不得见的人与事；而这些人、那些事在经过时间的筛滤之后，几乎都只剩下笑与泪与感动和温暖，曾经的怨与恨与屈辱和不满仿佛都已云消雾散@hj@" +
				  "我害怕生命成为固定的模式，接受僵化刻板的习惯，一成不变。我想从一切熟悉封闭的环境出走，生命一定还有其他的可能。日复一日的原地踏步，只会增加生命的腐烂萎缩。只有不断出走，不断重新出发，才能保有活泼，健康而年轻的生命力@hj@最大的价值蕴藏在未知中。要发现一片新天地，在一开始非得失去一切边际，独自摸索不可。没有固定的目标，你必须在自身中觅取法则，以发现自我为目标。只要是往前走的路，尽管去就是。但大多数都惧怕大海，他们只是一些在岸边来回巡逻的人@hj@对我们一生最有影响的那些行动，对我们的前途最带决定性的那些行动，往往是一些毫无考虑的行动。这好像一列火车，人乘上时并不假以思索，也不问这火车开往哪儿，而火车已把你载走，自己还不知道，但到发觉时已来不及").split("@hj@");
	
		text23 = ("当坐下来聊聊天已经变的不太容易的时候，那些匆匆的步履真的显得既可笑又可悲@hj@把往事都抛开，忘了它，就当它从来没有发生过，就当它是一场梦，从头开始生活！你现在想钱，再过一阵，瞧着吧，你又会想别的东西，之后会想更多东西。若想让自己幸福，那么最重要的是什么也不要。命运要是狠狠地欺负了你，绝不要求饶，不屈膝下跪，而要蔑视它，嘲笑它。要不然它就会嘲笑你@hj@如果你不懂我的沉默，你也永远不会明白我说的话语@hj@前进的理由只要一个，后退的理由却有一百个。 许多人整天找一百个理由证明他不是懦夫， 却从不用一个理由去证明他是一勇士@hj@你不去追求真正的幸福，而偏爱幻想中的幸福，这是你最隐秘，最阴险的惰性。在一切欲念中，我们自己最注意不到的就是惰性，虽然它的暴力并不明显，可它破坏的一切也不易被发现。它使得人放弃最热烈的追求和决心，它对心灵所感受的遗憾给予慰藉，最后代替了一切未曾获得的幸福@hj@" +
				  "人变老其实并不意味着别的，只意味着不再对往事感到害怕@hj@任何人，凡有痴爱都是痛苦的：一旦丧失，就会心痛欲裂；其实在丧失之前，痛苦早已存在，只是在丧失之后才意识到了而已@hj@我现在简直认为，出现过的人注定是要出现的。你从他们身上看到喜恶和美好，得到安慰或启示，震惊或打击，这一切都顺理成章。因为正是你的好奇心使得你们相识，你的需求拉近你们的距离，你的疑惑促使你们交谈，所谓心心相惜是因为你们在彼此身上看到了自己。你遭遇的一切不过是以隐密的方式邂逅自己@hj@人，正是通过自身的矛盾，才表现出坦诚@hj@有很多人，你原以为可以忘记。其实没有。他们一直在你心底的一个角落。直到你的生命尽头。在尽头你会怀念每一个角落里的黑暗之中的光，因为他们组成你的记忆与感情。但是你已经不能拥抱他们。只能在最后明白，路途是一个念念不忘的失去的过程@hj@" +
				  "不要像疯了似的拼命想解决，或是试图用关爱消除一切隔膜，接近的方式有时是保持距离，甚至是保持沉默@hj@成熟的感情都需要付出时间去等待它的果实。但是我们一直欠缺耐心，有谁会用十年的时间去等一个远行的人？有谁会在十年远行之后，仍然想回头找到那个人@hj@我总觉得心里缺了什么东西，回忆像是自己养的小鬼，一直在反噬自己的血肉，而思念是会呼吸的洞@hj@生命中有很多东西，能忘掉的叫过去，忘不掉的叫记忆。一个人的寂寞，有时候，很难隐藏得太久，时间太久了，人就会变得沉默，那时候，有些往日的情怀，就找不回来了。 或许，当一段不知疲倦的旅途结束，只有站在终点的人，才会感觉到累。其实我一直都明白，能一直和一人做伴，实属不易").split("@hj@");
	
		text24 = ("如果我们没有忘记过去，从来都不是因为怀念别人@hj@我到底该用一张怎样的脸，在你睡着的时候，看着你。我到底该用一张怎样的脸，在我不爱的时候，看着你。我时常在空旷的街上，吹着风， 想起你。我时常在这样的夜里，听着风声，想忘了你@hj@人类就是这么奇怪，如果没有人同情，你就不会在乎伤口有多疼；如果没有人嘲笑，你就不会在乎伤疤有多难看；如果没有人比较，谁会知道什么是前途@hj@所做的一切我不曾后悔。我所懊悔的，只为那些我不曾体验过的@hj@无论什么人，只要你在活着的时候应付不了生活，就应该用一只手挡开点笼罩着你的命运的绝望，但同时，你可以用另一只手草草记下你在废墟中看到的一切，因为你和别人看到的不同，而且更多，你是苦难的幸存者@hj@" +
				  "渴望之物的来临，总是在我们停止渴求之后，也就是拥有它们而不至失去理智的时候。你不再渴求它们的时候，也就是你有能力处理如何拥有这些事物的时候。如果你在迫切渴求某些事物时得到它们，你必然会失去理智。当你迫切渴求的东西被得到时，一切都会扭曲变形@hj@我的思想离开我去流浪，我摒除一切强烈的悲伤，停下来，闭上眼睛，在某些遥远的时间和地点的气味里软弱下来。我知道，改变是为了维持不变，讲话是为了沉默，张开惊奇的眼睛，是为了闭眼记住@hj@你一定有过这种感觉的，当你心事重重，渴望找个人谈一谈的时候，那个人是来了，可是你们的谈话成了两条七扭八歪的曲线，就那么凄凉地、乏力地延伸下去。你敷衍着，笑着，装作很投机的样子。但是，你心里渴望他离去，让你静下来，静下来啃噬那属于你自己的寂寞@hj@" +
				  "我们常常会不自觉地选择自己不该爱的人，选择自己不该结的婚，选择自己做不来的职位，选择自己达不到的梦想，从而选择了人生的各种困境。神秘的是，人生的困境就像太阳从东边升起，从西边落下，不会因为人做了哪种选择而改变。不同的选择只带来不同程度的困境而已。我们能做的只是接受事实@hj@你是对的，我是错的；或者你是错的，我是对的。我们的存在就是为了求证。同时也为互证。证据是我们彼此都需要的，它使我们的存在有据可查，有章可循。这是我们都意识到的，所以我们互相征服与反征服，控制与反控制，独裁与反独裁@hj@风格正如心灵的面貌，比肉体的面貌更难作假。模仿他人的风格，等于戴上一副假面具；不管那面具有多美，它那死气沉沉的样子很快就会显得索然无味，使人受不了，反而欢迎其丑无比的真人面貌。学他人的风格，就像是在扮鬼脸@hj@" +
				  "当人明白了自己的位置，他的人性便会得以完全，他才会获得真正的快乐。这就好像断骨被接好，痛苦也便可以止息。如果我们能真正理性的思考自己的处境时，就会知道自己到底需要什么，希望成为怎样，正是这些内在的需要在引领我们向着正确的方向前进@hj@情感遭遇瓶颈的时候，我们就来谈谈信仰问题。用哲学的性感代替情感的骨感，这是上佳的慰藉，更是救赎的王道@hj@1.永远别向任何人解释自己2.别让某人成为你生命的优先,当你只是他的一个选择时3.每早醒来有两个选择:继续做梦或起身追逐梦想4.别在喜悦时许下承诺,别在忧伤时做出回答,别在愤怒时下决定5.时间像流水,流逝便不再回,享受当下6.当你持续说这件事明天再做,你的明天就永远不会到来").split("@hj@");
	
		text25 = ("缘起,在人群中,我看见你..缘灭,我看见你,在人群中..@hj@你要做一个不动声色的大人了。不准情绪化，不准偷偷想念，不准回头看。去过自己另外的生活。你要听话，不是所有的鱼都会生活在同一片海里@hj@当一个男人不爱一个女人的时候，往往能把这个女人弄得神魂颠倒，觉得他特MAN，特够味儿，特浪漫，特霸道特酷特能掌控大局。女人喜欢甚至崇拜这样的男人，因为她们觉得有一种小鸟依人的感觉。但事实上当男人真正投入爱情的时候就会变成男孩，当你认为那个男人特别耀眼的时候，对不起，他还没爱上你@hj@儿子问爸爸：爸爸，爸爸，为什么我没有兄弟姐妹呀？正在看报纸的爸爸，听到后，气不打一出来，咆哮道：“谁让你老是不早点睡@hj@如果你的最近访客里，终于出现了那个让你久久无法释怀的名字，别高兴太早。他可能左手正牵着新欢，右手指着你的照片说：看，这就是到现在还放不下我的那个傻B@hj@" +
				  "遇见是两个人的事，离开却是一个人的决定，遇见是一个开始，离开却是为了遇见下一个离开。这是一个流行离开的世界，但是我们都不擅长告别@hj@这世界上有很多事情,你以为明天可以再继续做;有很多人,你以为可以再见到面,你以为日子既然这样一天一天地过来的,当然也应该就这样一天一天地过去.但是就会有那么一次;在你一放手,一转身的那一刹那,有些事情就完全改变了.太阳落下去,而在它重新升起以前.有些人,就从此和你永决了@hj@有时候，让别人在乎你的最好办法，就是不那么在乎他们@hj@当你说“想做回原本的自己”,会不会你只是在找藉口，逃避现在的自己？若是怀念想逃就逃想恨就恨的日子，你随时都可以这样做，只要明白这样做的后果，也都会成为你的人生。人生如河，每秒流动，你永远不可能再踩进同样的水里。每个阶段的你都是你，没有那个传说中“原本的你”啊@hj@" +
				  "总有些容颜慢慢远去，就仿佛跌落尘埃里的岁月。你的路途，从此看不到我的苍老。其实我一直很懂分寸，对我不懂的东西我从来不抱希望。其实我是很想祝福的，可是你知道，在一个人满心满眼都是酸涩的时候，请原谅我不能@hj@15岁觉得游泳难，放弃游泳，到18岁遇到一个你喜欢的人约你去游泳，你只好说“我不会耶”。18岁觉得英文难，放弃英文，28岁出现一个很棒但要会英文的工作，你只好说“我不会耶”。人生前期越嫌麻烦，越懒得学，后来就越可能错过让你动心的人和事，错过新风景。——《康永，给残酷社会的善意短信>@hj@渴望之物的来临，总是在我们停止渴求之后，也就是拥有它们而不至失去理智的时候。你不再渴求它们的时候，也就是你有能力处理如何拥有这些事物的时候。如果你在迫切渴求某些事物时得到它们，你必然会失去理智。当你迫切渴求的东西被得到时，一切都会扭曲变形@hj@" +
				  "等待太久得来的东西，多半已经不是当初自己想要的样子了。世上最珍贵的不是永远得不到或已经得到的，而是你已经得到并且随时都有可能失去的东西！@hj@这些年，活错了。没有为自己，没有为父母，没有为文字，也没有为爱，只是为了脑子回忆里的虚幻的那人，虚幻执着的久了，仿佛成了宗教，爱成了菩萨").split("@hj@");
	
		text26 = ("心灵之间，文字最短。可以说话，不许出声@hj@世界上其实根本没有感同深受这回事，针不刺到别人身上，他们就不知道有多痛@hj@未曾谋面的人，你是否也有一种久违的信任，生於文字背后的沉寂，那迷雾深垣下，一只伸出的手，一颗永不妥协的心@hj@爱情到最后就是考验两个人性格之间最忠厚的那部分本质，所以，这属于绝对实力，在此面前，任何阴谋诡计都不堪一击@hj@我要说的是，孤独没有什么不好。使孤独变得不好，是因为你害怕孤独@hj@喜欢的人，放在心里，像沉淀在玻璃杯底的蜂蜜团，香香的，亮亮的，委屈的时候，舔一口回忆，心里就不那么苦了@hj@初恋这东西很好也很坏。好的是，我永远记得我的初恋是谁。坏的是，我往往失去了他。初恋这东西很坏也很好。坏的是，我不知道我是谁的初恋。好的是，不管是谁他一定记住了我。@hj@" +
				  "我痛恨的是我从不曾善待自己，取悦自己，从不曾把时钟拨慢，跟这个世界脱轨一分钟；我没有指着痛恨的事物骂句“他妈的”；更不曾毫无保留地爱过谁。我自欺欺人，活在自己设定的规则的高压下，我幻想了无数假想敌，他们会在我做的不好的时候对我痛骂。我受不了，声嘶力竭地长喊一声，整个人瞬间就垮了@hj@无论你遇见谁，他都是对的人；无论发生什么事，那都是唯一会发生的事；不管事情开始于哪个时刻，都是对的时刻；已经结束的，已经结束了@hj@我终于感到，我们之间的全部通信只是一个大大的幻影，我们每人只是在给自己写信。我深刻地爱着你，但却绝望地不得不承认：当你远离我时，我爱你更深@hj@一个人需要一种特定的知识勇气，去无所畏惧地承认，他不过是人类的一个碎片，一个活着的流产小儿，一个还没有疯到需要锁起来的疯子。承认这一点之后，他更需要精神的勇气，使自己完全适应他的命运，承认它就是这么回事并把它称之为善。如果你把生命当做一种恶来接受，除了受伤之外别无出路@hj@" +
				  "每个男人的一生，都应有一次决斗。那不是打架斗殴，是年轻气盛，为一口气而战，可能为一件小事，但事关名誉清白。不要以为小人物不在乎这些，这世上没有大人物。为自己而战那一刻你就是大人物，但定是在懵懂的青春。多年以后，你或对此充满鄙夷，可当你老了，在你糟透的一生中，那是你唯一闪亮的自我@hj@留心提防自己的虚伪，每时每刻都小心监视它。要避免对别人和自己苛求；凡是您觉得自己内心似乎恶劣的东西，只要察觉到了，也就等于已洗干净了。您还应当避免恐惧，它是一切虚伪的必然后果。您不必害怕自己在努力爱别人时所表现的畏缩，这是您的路，千万不要从这条路上离开@hj@即使在我们经历了忧伤与绝望的教训，也还可能出现重大的失误和做错许多事情，但是有一点是绝对正确的，那就是，在做了很多错事之后，依然保持极大的热情，总要比心胸狭窄的人好。热爱事情使人受益不尽，这才是真正的力量@hj@" +
				  "到处都有痛苦，而，比痛苦更为持久且尖利伤人的是，到处都有抱有期望的等待@hj@你一来，我就决心正经地、不是马虎地生活下去，哪怕要费心费力呢，哪怕我去牺牲呢@hj@我们都会爱上混蛋的，他们很有野性，难于捉摸而且有趣。但发现他们是混蛋时我们依旧会惊讶").split("@hj@");
	
		text27 = ("我刚在心里骂了句傻逼，自己就狂打了两声喷嚏@hj@如果没有爱到你，爱谁也都一样。@hj@人们习惯得非常之快。为生活得快乐而想挣钱，一生的全部努力和最好的东西都集中起来去挣钱。幸福被遗忘了，手段被当做了目的。同样，征服者的全部努力则偏向野心，而野心只是一条小道，通向一种更豪华的生活@hj@我发现很多人的失落，是忘却了违背了自己少年时的立志，自认为练达，自认为精明，从前多幼稚，总算看透了，想穿了——就此变成自己少年时最憎恶的那种人,多少次 看破尘世 看透被欲望穿透肮脏的人们 ,猛回头却那知 原来是身在其中@hj@他第一次明了，原来当你爱上一个人，那感觉是如此酸楚，因为你的心从此不再属于自己，你的喜乐都握在另一个人的手心@hj@我以我的方式爱你，你却说我不了解你，可是我想告诉你，我也许给你的不是你想要的，但是我给你的都是我认为最好的@hj@" +
				  "许多人都知道生活本身就是一个笑话，但是你我早就过了那个阶段了。这不是我们的命。所以我们别假装痛苦了，时间已经不早了@hj@我还是在等那个人，你见到他的一瞬间，一切都已经预设好，感情、印象，都已储备到位，只等你轻触那个天亮的开关。你说的每一句话他都懂，任何话题他都明白，你一交代关键词他就感觉到方位。那真是一个盛大的奇迹。……这个人和你在同一经纬，神说有了光，就有了光，你们是对方的神@hj@彪悍的人生必然是如此练就的：首先，自己要行；其次，要有人说你行；再次，说你行的人要行；然后，你说谁行谁就行；最后，谁敢说你不行@hj@" +
				  "高二那年冬天，她在三楼看雪，我在四楼看她。只见她当时缓缓仰起脸来，雪花那一霎一片一片在她脸上慢慢绽放融化，她无意间看到了我，对我一笑，或者她当时只是笑着在看雪，无意间抬头看了我一眼而已，让我以为她是在对我笑…那一瞬，我大脑电压不稳，眼前一片雪花点儿…一晃十年@hj@原本以为你只是个过分偶然的过客，没想到却被你从此改变人生的走向。大概长久的恋情，多半从一个不太在意的态度开始").split("@hj@");
	
		text28 = ("客套的赞美与廉价的鼓励都已太过泛滥。与大多数困难障碍相比，它们都更加凶险。若真对自己有要求有期望，就须格外小心提防。可惜，似乎还是有很多人不明白这一点。幸好李宗盛在我十四五岁时就已提醒我此事——是他在歌词里说“……许多不切实际的鼓励/大都是来自酒肉朋友或是远房亲戚”@hj@有多少掏心掏肺的表白、熬到最后都是一声不吭的离开@hj@当愚人来找你商量事体，你别费精神：他早就定好了主意的@hj@一瞬间的踌躇，往往能使一个人完全改变后来的生活方式。这一瞬间，大概就像一张白纸明显的折缝那样，踌躇就一定会把人生包裹起来，原来的纸面变成了纸里，并且不会再次露于纸面上了@hj@感到空虚是由于自然需要太容易满足的缘故。当你凭借大宗财富即能毫不费力地满足自己的一切欲望时，快乐的要素便会因此而消失。缺少你所向往的某些东西，是快乐必不可少的要素@hj@" +
				  "闲愁最苦！愁来愁去，世界也还是那样一个世界。假如把自己看得伟大，你对于烦恼，当有“不屑”的看待；假如把自己看得渺小，你对于烦恼当有“不值得”的看待；我劝你多打网球，多弹钢琴，多栽花，多搬砖弄瓦。假如不喜欢这些玩艺儿，你就谈谈笑笑，跑跑跳跳，也是好的@hj@一般人不能感受趣味，大半因为心地太忙，不空所以不灵。你的心界愈空灵，你也愈不觉得物界喧嘈。我生平不怕呆人，也不怕聪明过度的人，只是对着没有趣味的人，要勉强同他说些应酬话，就觉得真苦。你对着有趣味的人，你并不必多谈话，只是漠然相对，心领神会，便可觉朋友中间的无上至乐@hj@喜欢的事儿自然可以坚持下去，不喜欢的事儿怎么也坚持不了。意志之类，恐怕也与“坚持”有一丁点瓜葛。然而无论何等意志坚强的人，何等争强好胜的人，不喜欢的事情终究做不到持之以恒；做到了，也对身体不利。@hj@" +
				  "所谓青春就是尚未得到某种东西的状态，就是渴望的状态，憧憬的状态，也是具有可能性的状态。他们眼前展现着人生广袤的原野和恐惧，尽管他们还一无所有，但他们偶尔也能在幻想中具有一种拥有一切的感觉，实际上青春是不可能有倦怠的，而且倦怠这种感情同青春的意义是相反的@hj@漂亮的姑娘总会得到比别人更多的东西，当然这其中也包括了她不想要的东西@hj@有时候觉得,生活就像是陀螺一样,转来转去,有时候会发现转到了原点。每每长大一点,都以为会很不同,实际上到最后发现,只是高级一点的复制。滔滔流逝的旧时光,其实绕了个圈,重新冲刷了他们每一个人。但是,但是我还是觉得,我过得很精彩。世界不完美，但是我们还拥有选择和改变的能力@hj@年轻时并不知道自己要过什么样的生活，但一直清楚地知道我不要过什么样的生活。那些能预知的，经过权衡和算计的世俗生活对我毫无吸引力，我要的不是成功，而是看到生命的奇迹@hj@" +
				  "一个人要做到对自己的美，聪明，善良，完全不自知，才显贵重，一旦有自知，品就自动下降一个层次，就仿佛栀子花不知道自己有多香，兰花不知道自己有多幽静。天分，天性，从来都不需要发言和解释@hj@人生是无所谓苦难，也无所谓幸福的，只是时间进入了我们，然后流逝，一直到苍老、消失。@hj@使人感到失望的，有时候往往不是事实本身，而是被证明你事先所有不好的预感全都是正确的。").split("@hj@");
	
		text29 = ("我不知道我是谁，我不知道我想要什么，我必须重新找到一种与他人共处的方式，而在那之前，我只能算作是半个人。我需要压力，需要疯狂地工作，我训练自己长时间保持只对一件事情专注，以避免自己崩溃。自由对于一个遭受重创的人来说，简直是坟墓@hj@避免重复这种想法，出自一种骄傲的感觉。这是自欺欺人——以为别人都在聚精会神地注视你，其实很少有人会重视你。相反，连续重复十遍同一个故事，会给人一种过分谦虚的感觉：这样做好像其他人都没听你说话，其实事实也并非总是如此@hj@是不是人人都如此？我年轻时总感到自己一会儿信心十足，一会儿又自信丧尽。我想像自己完全无能，毫无魅力，没有价值。同时我又觉得自己是天生我才，并且可以计日功成。在我充满自信时，我连最大的困难也能克服，但哪怕一次最微不足道的失误，也叫我确信自己仍旧一无是处。@hj@" +
				  "我们都是病人，只会阅读那些分析自己病情的书籍。描述爱情的书永远成功，因为所有人都觉得自己是唯一经历过爱情的人。当他的爱人说“这本书真美”时，他就觉得自己被爱了。他迫不及待地想让那个人读这本书。可是他不知道，爱人这么说是因为她的爱在别处@hj@实际上很多人并不是不自信，而是对自身与未知的迷惘。这点就不如傻逼自信了，傻逼根本不知迷惘为何物@hj@我知道我变了。从前的我，我就不大喜欢，现在的我，我更不喜欢。我回去，愿意做一个新的人@hj@爱人是让你去爱他而不是去依赖他的，因此主动独立的人格是爱的必要条件。你必须要学习善过没有他在身边的日子，才能证实你对他的感情确是发自主动关怀的爱，而非来自自私的依赖@hj@最使我们高兴的莫过于斗争，而非胜利；我们在争论中爱看意见交锋，但是一点也不肯去思索被发现的真理；同样，在感情方面，也要看到对立两方的冲突才有趣；我们追求的从来都不是事物本身，而是对事物的探索@hj@" +
				  "不要总把自己与别人比，人各有自己的特点，做不成大树，可以做小草，做不成船长，可以做水手，最重要的是认识自己，找到自己，做个最好的自己@hj@整个一生，我都梦想成为百万富翁。我要的并不是金钱所代表的东西，不仅仅是世人眼中的成功，而是一种令自己变得遥不可及的方式，拥有金钱并不意味着有能力购买东西，它更意味着世上的需求永远不会影响你。金钱意味着保护，而非乐趣。它是解药，以防被欲望的毒蛇咬到@hj@我老了。我曾经是一只光鲜的石榴。人们都说我好，其实都想咬我一口。我现在的记忆是黑白的，我听到过自己熟被碎在地上破碎的声响。我们都会面对生死，所以我才和你聊聊人生@hj@那些一般事情都做不好的人喜欢去做不可能的事。那是他们掩饰自己无能的手段。因为我们我们从事可能之事而失败，失败之责就得完全由自己承担；但如果从事不可能之事而失败，我们就可以把责任归于事情的困难。后者比前者少一点丢脸的危险。因此，愈做不好一般事情的人就愈胆大妄为").split("@hj@");
	
		text30 = ("时间不慌不忙地前行，一边刮开每个人命运的密码一边涂黑每个人过去的记忆。这也是毕业后我不愿意再见同学的原因@hj@世界和人生本身是无意义的，意义是人赋予的，是人为了生存替自己编造的谎言。为了生存，我们需要谎言。这本身是人生的一个可怕复可疑的特征@hj@多数人认为勇气就是不害怕。现在让我来告诉你，不害怕不是勇气，它是某种脑损伤。勇气是尽管你感觉害怕，但仍能迎难而上；尽管你感觉痛苦，但仍能直接面对@hj@每个没心没肺的人，都有一段为某人掏心掏肺的曾经@hj@对于谎言，重在配合，不在拆穿@hj@我过着悲喜交加的生活，日久天长，眼泪掉下来都不容易。想往某种境界，聊天的时间里，欣赏你的与众不同@hj@" +
				  "你的时间有限，所以不要为别人而活。不要被教条所限，不要活在别人的观念里。不要让别人的意见左右自己内心的声音。最重要的是，勇敢的去追随自己的心灵和直觉，只有自己的心灵和直觉才知道你自己的真实想法，其他一切都是次要@hj@再妖的精，也会遇到一个难搞的葫芦娃，甚至几个@hj@对你最好的那个人，换句话说，也就是最好欺负的人。天下间的女人，总是最会欺负对她最好的那个男人@hj@其实，我不是笨，只是懒得聪明@hj@能够善待不太喜欢的人，并不代表你虚伪，而意味着你内心成熟到可以容纳这些不喜欢").split("@hj@");
		
		text31 = ("我们最不爱付出代价，却极爱取得，每件事情上都是这样。只要把各式各样的人生幸福都给我们，特别是一点也不要违背我们的脾气，那我们是能够性情优良，行为端正的。我们并不贪婪，只要你们给我们钱，多多地给，你们就会看到我们是多么大方豪爽。这就是我们腐烂的人性。@hj@人生最大一种痛，不是失败，而是没有经历自己想要经历的一切@hj@任何一件事情，只要心甘情愿，总是能够变得简单@hj@有时候，痛苦的根源在于，明明已经开始沉堕于成人世界的物欲，却依旧对洁白高傲的少年时代念念不忘@hj@说假名字，因为我们要讲一个真故事@hj@许多道理都是违背人性的，它们说给那些愿意接受自我束缚的人听@hj@知道游戏的结局还愿意陪你认真的玩，这就叫温暖。@hj@对死亡的恐惧被对这个世界的失望所压倒，这个世界太丑陋了，没有人愿意从坟墓中重新站起来@hj@凡是说“相信我”这句话的人，都是不值得相信的，相信我@hj@" +
				  "越擅于说服自己，就越不甘心被自己说服@hj@别怕错过，只有贱卖的东西才会叫嚣不要错过。真正值得珍惜的东西，抓心挠肺地勾着你，想错过都不容易@hj@笑点低了，要记得抬起来@hj@你是这样年轻，一切都刚开始，我要尽我的所能请求你，对于你心里一切的疑难要多忍耐，要爱这些“问题的本身”，像是爱一间锁闭了的房屋，或一本用别种文字写成的书。现在不要去追求你还不能得到的答案，因为你还不能在生活里体验到它们。一切都要亲自体验。现在你就在这些问题里“生活”吧@hj@我的心就如同这张面孔，一半纯白，一半阴影。我可以选择让你看见，也可以选择不让你看见。就像是个巨大的马戏团，它让你兴奋，却让我惶恐。因为我知道散场后永远是——有限温存，无限辛酸@hj@就这样，我不断地更换认识的人，也不断地使自己进入不认识的人们之中去。我既不悲观，也不乐观，只是每天早上睁开眼睛迎接新的一天，一个人努力过下去@hj@" +
				  "同伴，不一定非要走到最后，某一段路上，对方给自己带来的朗朗笑声，那就已经足够@hj@一个人低调，是他有自信：自己可以随时高调。一个人淡定，是他明白没有事情可让自己抓狂。高调过的人，才能学会低调。张狂过的人，才能理解淡定。@hj@我什么也没忘，但是有些事只适合收藏。不能说，也不能想，却又不能忘。它们不能变成语言，它们无法变成语言，一旦变成语言就不再是它们了。它们是一片朦胧的温馨与寂寥，是一片成熟的希望与绝望，它们的领地只有两处：心与坟墓。比如邮票，有些是用于寄信的，有些仅是为了收藏@hj@最重要的是学会一个人单独待着，而且不看书，不听广播，不抽烟和不喝酒。有没有集中的能力表现在能不能单独地待着——而这种能力又是学会爱的一个条件。正因为我们不能自力更生，所以只能把自己同另一个人联在一起，这个人也许就是我的生命的拯救者，但是这种关系同爱情无关").split("@hj@");
	
		text32 = ("选择含蓄即选择孤独，是自我的回归，宁静里自有一种怡然自得。扎到心上的表达是一种控诉，告解式的剖白又面临情谊崩坏的危险。选择你熟睡时到你梦里一诉衷肠，这倾诉不是变相索取，而是一个为你心碎的人悠然唱起的歌儿，而我爱着自己的孤独，胜过一切@hj@在外在事物方面，大多数对诸如穿别人传下来的衣服，戴别人传下来的帽子等等感到羞耻，但在精神方面这种情况却完全不适用。在那里，人们穿戴的实际上都是一些旧衣帽。大众是没什么观点可言的，但是注意，那些靠叫卖观点谋生的新闻记者弥补了这一缺陷@hj@每个人或多或少都经历着两种力量的斗争：对独处的渴望和走出去的冲动。内向，即对自己内心活跃的思考和幻想的兴趣；以及外向，对外面的人和可见之物的兴趣@hj@想什么，你就是什么；你就是你花最多时间去想的，你就是不愿意去想的@hj@等你到了一定的年龄，彼此的过去已经不再重要，那些曾经令你无比在乎的东西就好像半途而退的潮汐一般似乎没有了提及的必要。这个世上没有命运这回事，同时也没有意外@hj@" +
				  "别人眼中的你，比你自己眼中要好很多@hj@你如果是个一辈子都快乐无忧的人，那你肯定是个肤浅的人。没有胡闹过的人对人的不确定性，自我的混乱缺少必要的了解，没有切肤之痛，会较难宽容，对许多人和事认识狭隘@hj@我经常会有那种感觉，如果这个事情来了，你却没有勇敢地去解决掉，它一定会再来。生活真是这样，它会让你一次次地去做这个功课，直到你学会为止。@hj@逃离，在另一个意义上就是奔向，正如放弃恰恰意味着恪守@hj@也许最重要的倒是那些我们记得不很准确的东西，而不仅仅是我们下意识记住的东西@hj@事情变化之快有时候让你觉得滑稽。无论多么深沉真挚的情感，都可能顷刻间烟消云散。弹指一挥，幸福可以化为悲伤，希望可以变为绝望。有一天，你会忽然发现，你在怀念过去，你意识到，你得改变一切@hj@" +
				  "第一，当你找到一份符合你兴趣的工作，也等于你不用工作，就好像是找到了一个心爱的人，你每天不觉得自己是在服务于他，而是在爱她；第二，找到一本可能要影响你的书，这个比找男朋友、女朋友重要；第三，有自己的价值观，找回自己的思维，找到自己改变的方法@hj@死亡从不是问题，但不要让世界察觉我已来了又走@hj@死亡是道路拐弯，死，不是别的，只是从视线中退出。这注定是一场漫长的告别，我听见，你走在前面，像我一样真实").split("@hj@");
	
		text33 = ("竭尽全力的人，无所谓奇迹的发生@hj@处事时不瞻前顾后，纵情时不过于谨慎，以及爱恨时可以任其愚昧的人，都让我很着迷。那种不担心后果的简单行为，在我看来十分奇妙@hj@你所浪费的今天，是昨天死亡的人奢望的明天。你所浪费的现在，是你未来回不去的曾经@hj@你的沉默必须能让人听到，你的尖叫可以是无声的@hj@世界上不存在刚好和凑巧。只是别有用心的偶然@hj@我很害怕那些想要教我点什么东西的人，或那些试图给我或别人指明目标的人。我认为如果自己找不到目标，那别人是不可能给你寻找到目标的。当然他们经常会说，我们不给你指出目标，我们帮助你发现目标。我知道所有这些道理。遗憾的是，那只是理论，而不是实践@hj@现代人生活在幻觉中，他自以为知道自己想要的东西是什么，而实际上他想要的只不过是别人期望他要的东西。要使大家接受这一真理，就必须认识到，弄清楚一个人真正想要什么并不像多数人想的那样容易，而是人必须解决的最大难题之一@hj@" +
				  "激情是一个谜，无法解释，遗憾的是有一点是确定的：生活不爱护它最美丽的孩子，而且往往最出色的人偏偏就会爱上毁灭他的人@hj@对于一个曾经这样郁郁寡欢的人而言，几次失望就足以使他相信，在他和别人之间根本不存在任何关系，就算有，至多也就是误解，事实上每个人都在绝对孤独中漫游，不可能让别人真正理解自己，不能与他人分享或者共同拥有什么。@hj@伸手干预他人的命运是愚蠢和危险的，我也没有任何理由去认为我可以干涉人，帮助人，能够识别人。幸福或不幸福是人争取不来的，我不再费力去试图把我的生活强行转向美好的一面，而是平静地接受既定事实@hj@森林里的树，看上去很孤立，但是如果你往下挖，不停地挖，挖到最深处就会发现它们的根系庞杂交汇，练成一片，密密匝匝，好似一个地下王国。我深信，这是大自然对对人类社会的一个隐喻：没有谁是一座孤岛，联系我们的，也许是必然，但更多的是偶然@hj@你觉得美好的爱情，有一部分来自于意淫").split("@hj@");
	
		text34 = ("我的睫毛实在不够长，遮不住眼睛，遮不住光芒，遮不住我的内心惶惶@hj@命运无公理，无正义，无目的，故对之不可思，遇之不能避@hj@一个人有多大的想法，就能让多少人活在他的想法里。如果你没有什么想法，那就只能活在别人的想法里了@hj@一直担心被别人太了解看得太明白，太清楚你什么时候在死撑什么时候在装逼。对别人敞开心扉，这是一件很恐怖并且很羞耻的事情。不愿意夸大甚至还原自己的承受或是遭遇。周遭根本配不上形容词，所以我一直很小心的使用诸如'孤独'和'痛苦'这类的字眼@hj@年轻时，都觉得自己可以一辈子背起爱情。日久天长，才明白，责任比爱情更有份量@hj@在我心中，真正的人都是疯疯癫癫的，他们热爱生活，爱聊天，不露锋芒，希望拥有一切，他们从不疲倦，从不讲些平凡的东西，而是像奇妙的黄色罗马烟花筒那样不停地喷发火球、火花，在星空下像蜘蛛那样拖着八条腿，中心点蓝光砰的一声爆裂，人们都发出“啊”的惊叹声@hj@" +
				  "关于成佛，有一种解释是：当你不再受外面的东西控制的时候；还有一种解释是，当你同时也不受自己情绪干扰的时候。@hj@生活只给一部分人尊严，而给另一部分人不幸和无可奈何@hj@这个世界说大不大，说小不小，很多时候你今天还丝毫不以为意的东西，明天就会成为决定未来的砝码@hj@生活的最佳状态是冷冷清清的风风火火@hj@日常生活中的琐碎事情常叫我们激动、焦虑、烦恼、热情，就是因为它在我们的眼前，让我们看着它觉得是多么的硕大，又是多么的重要而严峻。一旦它们全部消失在时间的长河里时，就失去了自身的任何价值，只要我们不再想它，它就在我们的记忆中逐步消失。它们之所以如此硕大，就是因为离我们很近的缘故@hj@我觉得不真实，我不知道什么是我真正的想法，哪一个时间我才是真实的我，我心里该如何思考，如何决断，如何过下一秒，我都不知道@hj@你别说话，一句话也别说，就站在那儿，对，就那儿，永远和我保持距离。我爱你").split("@hj@");
	
		text35 = ("总是差那么一点的义无反顾，让我始终做不成那个想要的自己 @hj@有些人落在低处，似乎已经踩得稀烂如泥，看上去像贴在墙上的老黄历，被人撕掉了身上，一层又一层的皮。但禅机一到，他就会土里钻出来，从烂泥里站起身，抖一抖身上的灰尘，也不说狂话，不温不火地一笑离开@hj@我们被蒙住眼睛穿越现在。至多，我们只能预感和猜测我们实际上正经历着的一切。只是在事后，当蒙眼的布条解开后，当我们审视过去时，我们才会明白，我们曾经经历的到底是什么，我们才会明白他们的意义@hj@心里有些话，想说出来。也许不一定是为了告诉你，也许有些话只是为了告诉自己。在模糊而彷徨的思绪里找到一根线索，把它抽出来，记起来，想办法用自己以后可以明白的字句把它形容出来。因为真正的自己可能是藏着这样陌生的形象里的，记录是逼近自己的一种方式，是自我保鲜的有效有段。@hj@" +
				  "世事玄妙。有时开始是一回事，到后来事情又变成另一回事。不但令身边人奇怪，更重要的，是惊讶了自己。正如一开始没想过有结果的感情，到后来竟变成人生中最认真、最刻骨铭心的一段。法国人说，所有最精彩的旅行都不是发生在外在，而在每个人的灵魂中，发掘内在的自己往往更胜于走一万里@hj@昨晚我在回家的路上的时候前面有个女的，我们都走得很慢，保持距离大概两米，那时整条街都没什么人了，很安静…大概走了十几分钟，那女的脚步越来越慢，忽然她回过头对我说：“你再不下手我就到家了@hj@每天晚上疲劳的睡在床上时，才感觉真真切切地过了一天。人生最重要的不仅是努力，还有方向。压力不是有人比你努力，而是比你牛叉几倍的人依然比你努力。即使看不到未来，即使看不到希望，也依然相信，自己错不了，自己选的人生错不了。第二天叫醒我的不是闹钟，其实，还是梦想@hj@" +
				  "年少是什么。年少是沸腾的荷尔蒙和酒气熏天。年少是呕吐物。年少是越荒唐越要做，越禁止越想前进。年少是否定上一秒的自己，又不给下一秒的自己退路。年少是，年少是一直爱着一个人，只爱那个人@hj@没有什么忘不了的。总会在以后的时间忘了你。先忘了你的样子，再忘了你说话的声音，随后忘了你喜爱笑，忘了你穿过灯光慢慢由浑浊变清晰。像飞鸟忘记曾经栖息的沼泽，犀牛忘记夏天的味道，失去双腿的人忘记曾经健步如飞，地狱的人忘记天堂多么美好。都能忘记了。现在不行，以后也可以@hj@请记住每一个对你好的人，因为他们本可以不这么做的。@hj@我如果非常非常地喜欢谁，我就从来不把他们的名字告诉任何人。这有点儿像把他们部分地出让。我现在变得喜欢秘密行事了。这大概是能够现使代生活在我们心目中变得神秘莫测的唯一办法。哪怕是最平常的事，只要你把它隐瞒起来就显得饶有趣味，而使生活平添了罗曼蒂克的气氛@hj@" +
				  "我相信，每个人要是能充分自在地生活，可以表达自己的任何感情，说出任何念头，实现任何梦想——要是这样，我相信世界将焕发出蓬勃的朝气。我们竭力压抑的每一种欲望都在我们心中作怪，毒化我们。行动是一种净罪的方式@hj@我们被生活逼得如此殚精竭虑和井然有序，时刻保持着敬畏之心，从而拒绝了改变的可能@hj@在世人中间不愿渴死的人，必须学会从一切杯子里痛饮；在世人中间要保持清洁的人，必须懂得用脏水也可以洗身@hj@任何一席谎话中都有真实的成分，有时它透露出重要的信息甚至比真话更多").split("@hj@");
	
		text36 = ("比容颜衰老得更快的，是我们曾经不顾一切的热情@hj@别人只能看到你脸上有多热情，却永远也不会知道你内心有多冷漠@hj@朋友就是，当我自己都不相信自己的时候，你却相信我@hj@每个人在本质上过的是一样的日子，不一样的是你的心在感受什么。如果你不能正视自己，那就根本谈不上任何改变，也就没有任何机会了。人得有把自己逼到绝境的勇气@hj@手触摸到得到的东西，一旦离开它一步，它便有可能变成神圣的东西，变成奇迹，变成不可能有的美丽的东西。一切事物都具有其神圣性，可是我们的手指触摸了它，它就变成污浊的了。人类是个不可思议的存在：一方面玷污手指触摸得到的所有东西，一方面自己内里又具有成为神圣的东西的素质@hj@思量短暂而轻微的生命，除去一切虚假的表象，只有两个东西是真实的：理智的信仰和青春的爱情，即未来和现在。剩下的都不值得劳神@hj@" +
				  "“薯片？”“嗯。”“喂我一个。”“可以，但是吃完不能舔我的手指。”“......操，那我还是自己动手吧。”@hj@也许我爱的已不是你，而是对你付出的热情。就像一座神庙，即使荒芜，仍然是祭坛。一座雕像，即使坍塌，仍然是神@hj@若和别人交往，你要彻底地知道，你只是他的一个选择，不是他的唯一，你也只能把他当成你的一个选择，而不是你生命中的某个优先。不要轻易去依赖一个人，它会成为你的习惯，当分别来临，你失去的不是某个人，而是你精神的拐杖。无论何时何地，都要学会独立行走，它会让你走得更坦然些。.@hj@人生有两种境界：一是痛而不言，二是笑而不语。痛而不言是一种智慧，人生在世，往往会因这样或那样的伤害而心痛不已。对坚强的人来说，累累伤痕是生命赐予的最好礼物；笑而不语是一种豁达，朋友间的戏虐，遭人误解后的无奈,过多的言辞申辩反让人觉得华而不实，莫不如留下一抹微笑，任他人作评").split("@hj@");
	
		text37 = ("似乎习惯了等待，单纯的以为等待的就会到来…@hj@曾经拼了命的追，如今发了疯的退…@hj@我不是我，而是所有往事、信念、冲动的集合。我们从来也没有分开，过去的事满怀激情和美好，它已成为我的个性，隐蔽地指引着我。你不用忧伤，你一直是这样，以印记的形式陪伴我的。我来我想，这个世界真的存在分离这件事么@hj@要是你不曾羡慕，你也不会觉得别人是在炫耀了@hj@你自己活出来的那套人生经验但凡要是有点用的话，你也不会活成一个天天都要和别人讲人生经验的人@hj@我只想当听众，因为不想感染太多尘世喧嚣@hj@情感总是伴随着束缚而来，所以无情的人才能获得真正的自由@hj@在这个世界上你会遇上一个人，你无法用一种具体的语言去描述。不用语言，只用感觉。就在漆黑中撞进了通向这个人的窄道。一旦进入这个窄道，不管情愿不情愿，一种力量狠狠地吸着你走，跌跌撞撞，既害怕又兴奋@hj@" +
				  "你飞翔的越高，在大多数人眼里越渺小@hj@没想明白的不要说，想明白了不用说，多说话是个很庸俗的事@hj@所谓抱怨，也就是跟生活撒个娇@hj@伤感是因为喜欢。喜欢是因为你。但伤感与你无关@hj@当你自己经历的故事太多，你就再难以看下去别人的故事了.说得好，自己经历得太精彩，就会觉得别人得有什么啊，这有什么啊。自己经历得太平庸，就会觉得别人都是在吹牛逼，丫在吹牛逼@hj@总有种人，以为不对任何人事抱希望，就不会再有失望了。总有种人，以为把能付出的都付出了，就不会再被夺去重要的东西了。总有种人，以为蒙上了眼睛冷冻了心，就什么都看不到，感觉不到了。总有种人，假装自己什么都不在乎，他以为这样，就没有人能够再伤害他了").split("@hj@");
	
		text38 = ("睡眠最美之处在于它可能有梦，现实最美之处在于它可以有梦想@hj@如果我试图到达什么地方，那就是光线的最深处；如果我企图理解并说出我们世界的秘密，那就是我在宇宙深处找到了我自己。我自己，就是那种把自己从伪装下解脱出来的极度的热情。重要的是真实。我在产生欲望之前就满足了。永恒就在那里，而我现在希望着，有意识地希望着。@hj@你虚张声势、匆匆忙忙；迫不及待去追求的其实是内心的恐慌；你神情严肃、高度紧张，就像一头被欲望填满的荒原狼。为什么你不肯走出众相虚妄，为什么又执迷虚荣一场，可怜的迷途羔羊，停一停，你知道的，退一步即是天堂@hj@耿耿于怀着过去和忐忑不安着未来的人，也常常挥霍无度着现在@hj@现实和梦想的差距，有时候仅仅是一张床而已@hj@重要的是你的目光，而不是你看见的东西@hj@真奇怪，你吸进去了那么多的勇气，吐出来的却都是叹息@hj@" +
				  "永远那么理智，就永远不会懂得爱情了@hj@我要用力地奔跑，然后很酷地跌倒，在哪里跌倒，就在哪里睡觉@hj@每次吃火锅还是那几样菜，每次唱卡拉OK还是那几首歌，每次想你还是那几个梦@hj@在你想要放弃的那一刻，想想为什么当初坚持走到了这里@hj@我遇见得最幸福得事是我在最美丽的时刻遇见了你。即使我们最后不能在一起，也感谢上帝让你出现在了我的世界里，让我知道世界上有那样一个人可以让我义无反顾，即使与全世界为敌也在所不惜@hj@没有什么不可替代，没有什么必须拥有@hj@那些让人难受的东西，会变成石头压在人的心上，那些失眠的人，都是在夜里苦练胸口碎大石@hj@一无所有是最贵的东西了，你必须放弃一切才能拥有它@hj@并不是往事有多不堪回首，而是当初的自己有多不堪回首@hj@每一棵树都有它不屈的美。美在低调的昂扬，更美在昂扬的低调。惟有这样的不屈，才能蓬勃成一棵树@hj@" +
				  "你还年轻，还不懂得内心的记忆会把不好的东西抹掉，而把美好的东西更加美化。正是因为这样功能，我们才对过去记忆犹新。——马尔克斯《霍乱时期的爱情》@hj@一切伟大的思想，和最好的生长，都是在静寂中进行的").split("@hj@");
	
		text39 = ("事情答案还是自己找到的好,别人告诉你的,都是他们的自传@hj@一切事物都有定时；每一事物由于它的需要而产生，而也可以说只是一种赋形的需要。除生命以外我不愿教给你任何智慧。因为，思想每是一种焦虑。我由于不息地监视自己行动的发展而感到疲惫。我肉体的得救仅归功于我对灵魂不可救药的毒害，以后我连那句话做什么解释也想不起来了@hj@总忍不住先把日期预设到一个极遥远的时间，仿佛要和每一件事情都划清泾渭，恨不得让它们全都发生在开天辟地以前。但是，当这座无涯的大厦被忽然推倒，我在它的废墟上逐丝逐寸清扫，却发觉原来我心中所有的世界竟如此之小，那些纷纷被推演到九霄云外的情景，都是在极近极近才刚刚发生@hj@恋曲太多的人总是一幅全世界属他最寂寞状；单身的人总想让别人以为自己并不孤单；高调炫爱的可能是那些被爱感最贫乏的人；总是沉默的人，心中却可能装着最饱满的幸福。这世界让我们每个人都患上了角色扮演癖，演着那个最不熟悉的自己@hj@" +
				  "未来是什么？是再也来不了？还是还没有来@hj@所有的路都是必经之路，遇到的人都是命定的人。我在黑暗中，静静等待，狂躁不安的心终于可以伸展自如。既然过去与未来都是幻觉，既然一切指向现在，那么，不必多虑，走就是了@hj@生命并不宝贵，宝贵的是与你分享这一切的人@hj@拿下面具这种事，一生中有一次也就足够了。有些事情尝试的结果，就是知道了以后再也不会这样去做@hj@你认为严酷、灰暗、沉闷才是生活的本色，同样也厌恨自己的工作、身处的地方，没有成就、没有钱都理所应当。你甚至在失落感和挫败感中寻求乐趣。失败和不开心对你而言更容易承受，你甚至苦中作乐。你对生活感到迷茫，没有方向，掌不住舵、划不动桨，不过不要紧，24岁就是这样。@hj@有时候觉得，能心甘情愿的当傻子是很幸福的。有时候又觉得，宁愿清醒着痛苦，也不要不知所以的幸福@hj@本来你以为，走了那么远的路，只是为了遇见另一个人。后来你知道，走了那么远的路，只是为了找回自己").split("@hj@");
	
		text40 = ("有多少勇敢，是因为不经世事。有多少退缩，是出于尝尽沧桑@hj@有多少沉默，是因为不想被人同情。有多少没关系，是因为只能接受@hj@不要在他人面前表现的过度坚强，因为那可能会成为对方伤害你的理由之一@hj@一个人的肌肉缺乏锻炼，以后还是可以补偿的；而智力的飞跃，即心灵中那种内在理解力则不同，它只能在形成时的决定性的那几年里进行锻炼。只有早早学会把自己的心灵大大敞开的人，以后才能够把整个世界包容在自己心中@hj@我总是在苍凉人生里焦虑的寻找，却总归无疾而终因而感伤。人生很难，成功是个跟我不搭的词。但纵然难，也依然要如常地活下去。太舒服的生活要小心，不能沉迷。永远让自己行在低处，那就永远不会失去仰望星空的力量。@hj@他们往上奋斗 我们往下漂流 靠着刹那的码头 答应我 不靠大时代的户口 他们住在高楼 我们淌在洪流 不为日子皱眉头 答应你 只为吻你才低头 手牵手 往历史下流 往历史下流　——《下流》@hj@" +
				  "人的脆弱和坚强都超乎自己的想象。有时，我可能脆弱得一句话就泪流满面，有时，也发现自己咬着牙走了很长的路@hj@不保留的，才叫青春。不解释的，才叫从容。不放手的，才叫真爱。不完美的，才叫人生@hj@只有经过惊涛骇浪的心海，才能留住风雨之后的彩虹。否则，那永远是天边的幻象和水中的掠影@hj@爱情不像你想象的那么简单，它比时间更持久，但还是存在于时间中，时时刻刻会产生不安、忘我、小小的愁意等感觉。当然，这些都不那么要紧，但那是因为人们拒绝给以重视，为此，有时需要做出小小的努力@hj@人只道努力争取才不枉此生，可有几个能参透：放弃才是题中真意@hj@你若不听，便没有闲言@hj@但愿亲爱的你，接住我的真诚和拥抱。在这片天地里，我们确信，得到的是彼此的接纳和安全，而追根究底的大荒，诚实地说，除了自己之外，没有人能改变你我自造的心境@hj@每一个人身上都拖着一个世界，由他所见过、爱过的一切所组成的世界。@hj@" +
				  "弘一法师几句话现在听来相当有味：1.有才而性缓定属大才，有智而气和斯为大智。2.临事须替别人想，论人先将自己想。3.不近人情举足尽是危机；不体物情一生俱成梦境。4.善用威者不轻怒，善用恩者不妄施。5.事当快意处须转，言到快意时须住。6.任难任之事要有力而无气；处难处之人要有知而无言@hj@有些事情是永远对质不出真相了。我十六岁听到的那些故事，可能是真的也可能是假的，这些都不重要。重要的 是一旦对质，就会像傻逼一样无聊。谎言或者是无耻的真相，这没什么区别，最好的办法是在这些人脸上砍上一 刀，他就知道什么是牛逼了").split("@hj@");
		
		text41 = ("我们是否在走这样一条路,找寻别人,便遗失自己；找寻自己,却失散别人@hj@完美主义的可怕之处，是如果一件事情不能达到期望中的标准，宁愿将它亲手毁灭，也不愿留着让它继续苟存。完美主义者最恨的就是那些尚未被消除的不完美的证明。可以被毁灭的不仅仅是文字与图像作品，还可以是自己的人生和爱情。真心希望上帝不是完美主义者，我们也不是它的创作@hj@总有人在告诉你：“战胜了自己你就赢了。”可却很少会有人对你说，即使战胜了自己，也不会快乐。很多时候，我们想要的只是一个失败，一个放弃想赢的执念，或者是忘记输赢本身。生活已经那么苦，人为何还一味的想要去战胜自己@hj@命运,让我们平静的相遇,谁都不要轻举妄动@hj@“如果你毕业后要做喜欢的事情，那么毕业5周年的同学聚会不要去。10周年聚会也不要去。但是，20周年的聚会你可以去。你会看到，那些坚持梦想的人和随波逐流的人，生命将有什么不同。”@hj@" +
				  "是的，我们会被生活消磨，我们渐渐习惯于彼此的存在而不再回想往日的激情。也许，爱情产生于瞬间的心动，但更滋长在一朝一夕的交流与相处之中。我无法保证以后会怎样，我们都不能保证。我只知道，这一刻我发自内心坚定地爱你，而正是这一刻成就了我们的过去和未来").split("@hj@");
		
		text42 = ("你有你的不想说，我有我的想太多@hj@你所见到的，只不过是自己的想象。你以为是自己的，只不过是种偶然。握得越紧越是徒然@hj@我颠沛在每一个远方，心灵如夜晚一般荒凉。我离弃山川与原野，不再听河流的吟唱。我将自己的生命销毁，却没忘记你的模样。我厌倦了每一朵波浪，梦中却只有大海茫茫。-------《正男的忧伤》@hj@不是所有牺牲都能换来掌声，不是所有眼泪都能遇见同情，不是所有语言都能有人听懂，不是所有爱情都有存在过的证明@hj@当前后左右都没有路时，命运一定是鼓励你向上飞了@hj@" +
				  "你须要保留今天，明天，你整个的未来，让它们绝对自由，不要被你的爱人占领。如果你心爱的姑娘另有所欢，你还她自由。你应当知道——半人半神走了，神就来了@hj@一个人懂得了自己理解自己之困难，他就不会强求别人完全理解自己，也不会奢望自己完全理解别人了。在最内在的精神生活中，我们每个人都是孤独的，爱并不能消除这种孤独，但正因为由己及人地领悟到了别人的孤独，我们内心才会对别人充满最诚挚的爱。而我们只是在黑暗中并肩而行，走在各自的朝圣路上@hj@一个真正想做成一件事的人必然是现实的，他得学会妥协，愿意弯下身来讨价还价。这看上去和所谓的理想主义是个悖论，但或许这才是真的有理想@hj@" +
				  "所有的悲剧都源自于“总以为自己会是个例外”的这样一个念头，所有的传奇也正因为此@hj@对于你无法拥有的，你只是逃避，或转移自己的注意。如果你在一件事上失败了，你就拿另一件事当寄托，没有任何事情能改变你。你站在我面前，有时是那么漠然，有时又那么沉默，好像只要暴露一点你的个性，就是对你自己最大的背叛。我知道我无法改变你，所以我离开你@hj@无悔不是不后悔，而是让生命没有遗憾").split("@hj@");
		
		text43 = ("这个世界上，最宽广的是海洋，比海洋更宽广的是天空@hj@所有美好的回忆，在失去后都会变成灵魂的刀子。愈是美好，愈是锋利，愈是鲜血淋漓@hj@很多时候我们明明只是走个串场打个酱油，却哭得比主角还入戏@hj@努力过后的失败是值得骄傲的，因为那至少不是眼睁睁的看着机会变成遗憾@hj@很多时候，没有爱情人才能更快乐@hj@人都是在希望赢得别人的过程中一步步失去了自己@hj@一个人走路的时候总是最自由的，只是寂寞与自由向来同行@hj@你为生存所做出的努力并不值得炫耀，因为每个人都在这样做@hj@让人瞬间改变，做出重大决定的，有时候并不是长久的深思熟虑，而是简单到不可理喻的事，比如一个动作，一条新闻，一本小说，甚至是擦身而过的人一句随便的话。命运用偶然之手搅动人的生活，饱涨的情绪临界点是它常光顾的地方。并不是任何事情都有周详的前因后果，神性总是偏爱饱经沧桑的心肠@hj@" +
				  "每个人都有自己的生活，别人是别人，我是我。就是这样的。不能因为自己没有就遗憾@hj@有些人哭在心底，有些人笑在心底，有些人不管哭笑都藏在心底。我一直是个严守情绪隐私的人。我乐于和别人分享欢笑和喜悦，却无法承认自身的恐惧和悲伤。这可能是我喜欢独处的原因。独处时没有他人的限制，自己可以向内自由伸展，恐惧和悲伤也不是那么灰暗了。我如果对自己的都不诚实，那就太虚伪了@hj@人生最甜蜜的欢乐，都是忧伤的果实，人生最纯美的东西，都是从苦难中得来的，我们要亲身经历艰难，然后才懂得怎样去安慰别人@hj@我们身处当下的现实中，思维却在对未来的期许里，除非在未来的岁月中回头凝视，否则无法用常规的方法使人相信我们真实的生活。这就是我们孤独的症结所在。孤独是什么呢？孤独是你对实实在在的生活的无法言说，无法交流@hj@" +
				  "我通过我的灵魂与肉体得知，堕落乃为必需，我必然经历贪欲，我必然去追逐财富，体验恶心，陷于绝望的深渊，并由此学会去抵御它们；学会热爱这个世界，不再以某种欲愿与臆想出来的世界、某种虚构的完善的幻想来与之比拟；学会接受这个世界的本来面目，热爱它，以归属于它而心存欣喜").split("@hj@");
		
		text44 = ("不惹眼，不闹腾，也不勉强自己，要做个落后于时代的人，凝视人心@hj@只有在得到了属于自己的东西时才有足够的底气去调侃这狗屎一样的现实@hj@爱情不讲道理，它高于一切道理@hj@想要爱，又想要长久的人，你们真是贪心啊。爱的本质就是此时，此刻，正在发生的现在。它的质量不是以时间的长短来衡量，拥有过，便是永恒。那些找遍了世界也寻不见爱情的人，你想好了你是要找爱，还是要找一幢落满灰尘的纪念碑@hj@寂寞是生命中的常态，那些热闹的时光，才来自偶然@hj@对生活失望，对自己失望，对他人失望。但是，唯独不能对下一秒钟失望。@hj@不要相信我，要相信自己。这样做的结果是你可能犯错，但绝不会后悔@hj@我们都一样，喜欢自己堵死所有的路，然后告诉自己无路可走@hj@旅行，是一种不治之症，一旦染上，就再也无法摆脱。欲望在心里不定期隐隐作痛，迈开脚步才会获得短暂的身心安宁").split("@hj@");
		
		text45 = ("Home is wherever I am with you@hj@每个人走过的道路都不一样，要走的道路也将会不一样。没有谁可以做谁的参考@hj@你愿意去维系把握的一切关系，都叫缘分@hj@再平静的生活中，都会有不可测探的秘密。再寻常的外表下，也会有无法触摸的心事@hj@“我不是喜欢同性，而是我喜欢的人，刚好是同性而已。”“我不是喜欢老师，而是我喜欢的人，刚好是老师而已。”“我不是喜欢大叔，而是我喜欢的人，刚好是大叔而已。”“我不是自恋，而是我喜欢的人，刚好只有自己而已。”@hj@真正幸福的人都在忙着体会，哪有人在忙着炫耀@hj@和自己越来越熟,我想这就是成熟@hj@命运往往会有奇特的幽默感").split("@hj@");
		
		text46 = ("任何一个不给力的现在，都有一个不太努力的曾经@hj@不想活在你心底的最深处，想做你眼前的障碍物@hj@我的成就在别人看来分文不值，我的失败在别人看来却罪不可赦@hj@所谓宽容 无非是 不苛求自己 不苛责别人@hj@“我说过的每一句话都是谎言，相信我你就错了。只是看着我，并且思考我为什么要说谎，你才可能是对的。”@hj@恶念不是来自内心，而是不得志的生活").split("@hj@");
		
		text47 = ("只有在旅行时，才听得到自己的声音。它会告诉你，这世界比想象中的宽阔。你的人生不会没有出口，你会发现自己有一双翅膀，不必经过任何人同意就能飞@hj@如果你是鱼。你是愿意居住在只有你独自游弋的浩渺大海，还是停留在有伙伴相随却痛苦到难以呼吸的浅滩。如果你是鱼。你是愿意游荡在纯粹到鲜有杂质的宁静水域，还是生活在险境环生的纷扰空间。前者安逸而后者危险，前者平乏而后者精彩。也许在你累了的时候与有精力的时候，给出的答案都会是不一样的@hj@总是妄图征伐却失去了判断，拼命拥有却背弃了初衷@hj@多少事情是因为太无奈 最后只好用'算了'来打发自己@hj@有些遗憾，就让它成为遗憾，水里有些石子，才好看@hj@鉴于我动不动就觉得挺不好意思的，别人也就动不动都对我挺好意思的@hj@有时候我们需要暂时闭上一只黑色的眼睛，等一等坏在路上的光明。@hj@需要救的人无论如何活不长的@hj@" +
				  "生活是场戏，可我们都没有罢演的权利。生活是战场，可你见它何曾停歇过片刻。生活是棋局，可究竟是谁在下，我们却无从得知。生活是一个梦，可是能将梦变成现实的人，却都是少数中的少数@hj@不得不说，我所有的生活，全都是与自己讲和的过程。到最后，没有什么人是离不开的，也没有什么事完全做不到。一咬牙，一言不发，度过一个又一个艰难的时刻@hj@如果不能活得美丽，那么至少要活得尽兴。如果不能活得有尊严，那么至少要把自己想要走的路走完整@hj@什么叫隔阂？就是我的世界和你的世界不挨着").split("@hj@");
		
		text48 = ("直觉是心中最难被抹去的存在，它没有依据，却如此清晰@hj@如果想让一段感情尽早结束，那就把它拿出来使劲炫耀折腾。如果想让一段关系长久安宁，那就默默地把它藏好，把所有的爱都只说给对方听@hj@你不要觉得你的决定是受别人暗示或者环境所逼。致使你走到这个路口的每一个决定实际上都是你深思熟虑的结果，是你的本性做出的选择，跟谁都没有关系。即便做不到对自己完全诚实，至少我们应该对自己的行为有所担当。担当，是使人坦荡的唯一途径@hj@人其实挺矛盾的.总是希望被理解,又害怕别人看穿@hj@你不要觉得你的决定是受别人暗示或者环境所逼。致使你走到这个路口的每一个决定实际上都是你深思熟虑的结果，是你的本性做出的选择，跟谁都没有关系。即便做不到对自己完全诚实，至少我们应该对自己的行为有所担当。担当，是使人坦荡的唯一途径@hj@多余的财富只能买来多余的东西。灵魂所需的必需品，一件也不需要用钱来买。@hj@" +
				  "也许所有的苦，都是苦于生命如此绚烂却无人分享。也许所有的累，都是累在生命如此沉重却无人分担@hj@做决定是最难的，一旦把决定实施，事情倒也没想象的那样困难重重了@hj@我不能消除你的不安，不能抚去你的焦虑，而只是陪伴你，给你讲一个有趣的新鲜事，或是一则从没有过时的老童话。我伴着你安静下来，蓄满勇气，等你每晚无忧无虑地睡去，等你每晨生龙活虎地醒来，愿你每天前行的路上”桥都坚固，隧道都光明”@hj@真正不羁的灵魂不会真的去计较什么，因为他们的内心深处里有国王般的骄傲@hj@有时你认为你是怎样的一个人，其实那可能只是很小一部分的你，因为在不同的人面前，反射出来的是不一样的那个你，而人本来就是不同面的，所以，能遇见不同的人，才能反射出全方位的你@hj@我们在每个白天所做的一切，都是为了在每个夜晚能睡得安心。@hj@年轻的时候总想着去远方，等到真正去了后才发现远方除了遥远什么都没有").split("@hj@");
		
		text49 = ("疯是很容易的事情，不疯才需要意志@hj@最大的孤独，是你的热情掉进周围的寂寞世界。你说什么，你唱什么，你呐喊什么，你即使自寻短见，都是你一个人。大地无动于衷@hj@猜一个人的年龄，首先看他/她的眼睛。年龄越大，眼中对世界的怀疑与疲惫就越深@hj@我始终都不能接受委曲求全的情意，即便我知道这退让与宽忍的后路会是顺畅。让我折掉的心意，我定要拿回来，让我低下的头，下一刻我会抬起来，我就是这样另自己也讨厌的人，总是见不得自己吃一点亏@hj@谁没有年轻过，可谁又能年轻多久@hj@从来只想着要争口气，却没想过是否需要喘口气@hj@什么是青春，就是你明明一无所有却仍然相信有一天世界会在你脚下@hj@孤单的人走到哪儿都一样孤单，与世界的隔阂是深藏在心底的，不是遇见了哪个人，哪个团体就能得以解决").split("@hj@");
	
		text50 = ("所有发生过一次的事，可能永远不会再发生；但所有发生过两次的事，肯定还会发生第三次@hj@不管全世界所有人怎么说，我都认为自己的感受才是正确的。无论别人怎么看，我绝不打乱自己的节奏。喜欢的事自然可以坚持，不喜欢的怎么也长久不了@hj@不管全世界所有人怎么说，我都认为自己的感受才是正确的。无论别人怎么看，我绝不打乱自己的节奏。喜欢的事自然可以坚持，不喜欢的怎么也长久不了@hj@不乱于心，不困于情，不畏将来，不念过去，如此，安好@hj@没有无缘无故的信任，也没有无缘无故的不信任。正负评价都源自你平日的一言一行。你再背后说了多少谎话，那些谎话就会以同样的力量反弹给你").split("@hj@");
		
		text51 = ("也许是因为有太多喜悦痛苦无人可说，或是你的感触点总和身边人的不同，说了也无人可懂，渐渐你也就只能去压抑这些生而无用的感受了@hj@你谁都爱，也就是谁都不爱。哪里都是你的方向，也就是你根本没有方向@hj@对生活失去目标和渴盼的时候，你就去淘宝购个物。购个物，就可以等待着收包裹时的喜悦，哪怕只一丁点，你也算是暂且有目标了@hj@最好的等待，是不期待。每一个发生，都是对未知的赞美，每一次错过，都是对未来的祝福@hj@钓鱼的乐趣在于，你找了一件可以做一整天的事，更重要的是实际上你什么都不用做@hj@告诉你吧！我有一个有趣的发现，如果你有胆量去实现自我，那么，别人就会为你付出代价@hj@" +
				  "任何平静的现在都有一段坎坷纷乱的过去@hj@我最不能容忍的，是到头来我容忍了一切@hj@走路时我看得见别人，他们也看得见我。可是我看不见我自己，但是可以感觉到自己的魂在行动。我所想的你们不知道，我也没有事先要预设的问题@hj@太懂得尊重别人与周遭世界的时候，有些乐趣便只能从自嘲中得来@hj@如果没有温柔真诚的心，那所有华丽动听的辞藻就都是屎@hj@眼中人，心中事，口中歌，万种风情，今生休卜，与鬼成说@hj@人都是一样的。这是一句多么卑屈的话呀！这是一句既瞧不起别人也瞧不起自己，毫无自尊心而使人放弃一切努力的话。人们彼此害怕，害怕所有思想被亵渎，害怕自己的努力被嘲弄，害怕自身的幸福遭到否定，害怕荣耀被剥夺等等，这种世纪的不安，都是从这个卑劣的结论衍生出来的@hj@你不会知道那个对你突然发火的人，忍了你多少次@hj@不知不觉，有些话就已经不知道该如何说出口，我们都没错").split("@hj@");
		
		text52 = ("不知不觉，有些话就已不知该如何说出口。尽管曾经我们那么翘首以盼。@hj@“后来”这个词，概括了所有我们不想要改变却又面目全非了的事@hj@对待别人感情永远条理清晰分析的头头是道，偏偏到自己这儿一切都血肉模糊惨不忍睹@hj@每个人从最根本上讲都有两种人格，一个做自己，一个演自己，但实际上这两个都是真实的你@hj@梦想 之所以那么难，因为它是要用你第二喜欢的东西来换取你最喜欢的东西@hj@人与人接壤，能述说的仅是片面辰光，一两桩人情世故而已。能说的，都不是最深的孤独@hj@不真诚的态度留不住一段关系，太真诚的态度又会让一段关系过早走到尽头@hj@幸福不可能重来两次，痛苦不可能贯穿一生@hj@让别人接受自己，不如让自己接受别人对自己的不接受@hj@我决定把我所有的肤浅都展示给你看，这是我至今为止做过的最为深刻的事情@hj@容忍一个人所花的时间成本远比重新认识一个人要多得多得多").split("@hj@");
		
		text53 = ("有些人可能会对你突生好感 也可能转眼对你失去兴趣 这都是很正常的事 就像我们时常被一间外观迷人的小店吸引 走进去却完全不是你想象的那样 所以 除了悄悄的关上门 也没有其他可做的了@hj@我们对自己一无所知的程度超乎想象。所向往的生活模式，所选择相处的群体，所规划的未来，似乎都为了让自己成为更好的人。我们却是自私的，无论做多少改变来掩饰和麻痹，在最需要真相的时候，总会选择满足或欺骗自己@hj@至少有百分之五十的事情的解决办法都是自己长点儿记性就行了@hj@你梦寐以求的。不一定是适合自己的@hj@爱情就像地震，演习的时候谁都淡定，真正降临的时候谁都慌@hj@一个人怎么看待自己，决定了此人的命运，指向了他的归宿。我们的展望也这样，当更好的思想注入其中，它便光明起来。不管你的生命多么卑微，你要勇敢地面对生活，不用逃避，更不要用恶语诅咒它").split("@hj@");
		
		text54 = ("承认吧，很多事情就算给你一次重头再来的机会，结局也往往与现在相同@hj@抱必死的心，走永远的路@hj@终有一天会被磨没所有的脾气，磨平所有的棱角。然后找一个下坡，自己滚自己玩@hj@告诉所有失恋失身失意失魂落魄的人一句话：你必须好好生活，你只能好好生活@hj@保守秘密最好的方法就是不把秘密当做秘密，那就只不过是千百件懒得提起的事情之一罢了@hj@原来纠结也是时间的杀手，惟有果断，才能将零碎的时间接续起来，使人生变得更有节奏感@hj@从小被教育追求极限和超越，长大了才知道适可而止多么重要@hj@我认为，一个真挚的人即使有时变得浑浊，但是，他还是能够重新变得干干净净的@hj@我一直以为空气是不要钱的，直到我买了一包薯片@hj@看别人的遭遇，悟自己的道理@hj@我觉得我每天吃饱喝足往床上一躺侧着身子玩手机的样子，简直就是对旧社会里大烟鬼子抽大烟的情景昨日重现@hj@" +
				  "最得人心的句子的形式通常是，好像什么都说了，又好像什么都没说@hj@“我对男友的要求就是要稳重、体贴、温柔、爱家、孝顺、有上进心。”“我明白了，你要找的是互补型的那种，对吧！”@hj@不要脸这事，如果干的好，叫心理素质过硬,前言不搭后语这事，如果干的好，叫跳跃思维@hj@不是你始终没有遇到对的人，而是你始终没改掉错误的自己@hj@如果你做一件事是为了得到别人的赞美和目光，那么还是不要去做了。如果你做一件事是为了自己终于能够对自己说一声：“好样的。”那么请为此去努力吧").split("@hj@");
		
		text55 = ("你尽力了，才有资格说自己的运气不好。@hj@有了想法就去行动吧！不要问为什么，年轻就是一切的理由@hj@一个安静的生命舍得丢下尘世间的一切，譬如荣誉，恩宠，权势，奢靡，繁华，他们因为舍得，所以淡泊，因为淡泊，所以安静，他们无意去抵制尘世的枯燥与贫乏，只是想静享内心中的蓬勃与丰富@hj@有没有自己的生活，比生活得好还是不好更重要@hj@这世上，最能长久地消磨一个人的，是现实。能最快地消磨一个人的，是感情@hj@人一感到不安，就总轻易否决掉之前别人对自己的好@hj@要记住，人之所以走入迷途，并不是由于他的无知，而是由于他自以为知@hj@我就是这样一个人，从一开始就决心，不要抱太大期望，不要有过高期许，不要以为事情能成功，不要觉得很多人都喜欢你——不会的，没有。我们都是必须靠能靠自己埋头苦干去换来一些价值的人@hj@做恶梦也是有好处的。许多在现实中不曾有的惊吓吃不到的亏在梦里却遇见了，没有受到真正损失却增长了经验值，这么想着真觉得也是一种幸运").split("@hj@");
		
		text56 = ("爱情如果你不讲他不说，以为这样才叫成熟的爱情，总有一天想讲的时候你们张开嘴什么都说不上，你们就这样越走越远，回不了头。@hj@别人没有义务成为你生活中必须出现的奇迹，能给你不时捎来一些惊喜就不错了@hj@站在时间的长轴上，以一个变量堆积的现在的自己，回首望去，真想对过去残缺、自卑的自己说一句：谢谢你，那时没有选择放弃@hj@人就是这样的巴。有时会闷闷不乐，有时会钻牛角尖，胡思乱想地感觉自己很悲惨。有时还会觉得自己心情特别好，无所不能，什么事情都能做。这两种心情都会有的。两者出现的概率差不多。时间就是在这样的反反复复当中过去的@hj@生活给了我想要的东西，同时又让我认识到那没什么意义。 挥霍也是一种抵抗，抵抗被金钱、被循规蹈矩的生活腐蚀，就像飙车会给人一种飞翔的假象，它既是一种自由，也是一种忧伤、一种孤独、一种遗忘@hj@" +
				  "我们常常安慰自己，大不了只是回到原点，可是我们心里都明白，没有什么能回到原点，记忆作祟，时光荏苒，看似从孑然一身又回到孑然一身，但我们再也不是原点的那个自己@hj@你所做出的每一分努力或采取的每一次行动，此生都会有回应。这种回应有的是报答，有的是报应。只是这些回应或比较直接，或比较隐晦，或变化多端罢了@hj@“你想知道什么呢?好奇心这么重。”“我想知道的无非就是两样,你是如何一步步变成现在这个样子,以及,我在你心里的位置。”@hj@能让你放下矜持，放下自尊，放下骄傲，放下种种原则去贪求讨好的那个人，一定是你最不可能得到的@hj@唯一比悲伤还糟糕的事，便是让别人知道你很很悲伤@hj@不要总怪别人会影响你。你稳了，整个世界就都稳了@hj@有一种醒悟，是你清楚的知道想要的幸福不会来了，却没有因此掉下半滴眼泪@hj@每当客厅电视里传来“这世界上的好男人都死哪儿去了！”的台词，我都想从卧室跳出去大喊，我在这里！@hj@" +
				  "能被控制的 就不叫感情了 能被掩盖的 就不叫真相了 能被说服的 就不叫观点了 能被打败的 就不叫宿命了@hj@误入死胡同不可怕，那至少还有退路。可怕的是你画地为牢，并且确定的告诉自己，你走不出去了。").split("@hj@");
		
		text57 = ("我理解，行走的过程，即是人生。如果有体会，不妨记下。因为，机不可失，时不再来@hj@阳光也不及你给人的感觉。阳光只能给人温暖，但给不了温馨与甜蜜@hj@每天擦肩而过的大部分人在你眼里都是没有性别的，只有极小一部分，比如你喜欢的人或是除你之外也喜欢你喜欢的人的人，在你眼中才会产生性别的概念@hj@有时候，我们活得很累，并非生活过于刻薄，而是我们太容易被外界的氛围所感染，被他人的情绪所左右。行走在人群中，我们总是感觉有无数穿心掠肺的目光，有很多飞短流长的冷言，最终乱了心神，渐渐被缚于自己编织的一团乱麻中。其实你是活给自己看的，没有多少人能够把你留在心上@hj@不知从何时起，这生命中早已没有了对错，有的只是逃避或者面对。@hj@" +
				  "总会有一些特别的时刻，你陷入了某种困境不可自拔，在此时生命中正好出现了某个人，TA仅仅是做了一件对TA来说再简单不过的小事，就将你从在你看来绝不可能逃脱的的痛苦中解救，而这一切，TA本人却毫不知情。每个人生命的不同时期都会有一个或多个这样的存在，我自己在心中将TA们称之为：天使@hj@既然无法在现实中让你彻底消失，就只好在心中将你全数毁灭@hj@“可怜我分不清真假，羡慕你无需分出真假。”“分不清缘于太认真，分得出因为不在意。”").split("@hj@");
		
		text58 = ("“你在同一个地方等了那么久，究竟在等什么？”“我在等待奇迹发生。”@hj@以前觉得，幸福就是不乱节奏地生活，事事遂心顺意；现在觉得，真正的幸福是你能让多少人因你的存在或者你做的事而幸福，并不是说你应该舍弃自我迎合他人，恰恰相反，心有他人而不忘我才是幸福的本源@hj@我宁愿做我自己而被人厌恶，也不愿为了迎合别人而伪装自己、但现实是常常很难做到@hj@我既没有尝过成功的滋味，也不知道失败的感觉，只是过一天是一天而已。我也有梦想，但却过早地接受了没能实现愿望的现实。我跟所有人都尽量友好相处，对我来说狂喜和绝望不过是小说中的两个单词而已。我所有的自我谴责从来不过是说说而已，没有带给我什么实际的痛苦@hj@我们应该像对待自己的身体一样，给命运洗洗澡；像更换自己的衣装一样，来改变一下我们的生活@hj@" +
				  "“如果没有勇气舍弃生命中那些早已没用的东西，就没有多余空间来放置有用的东西了。”这种话乍一听似乎很有道理，可在我们有限的生命中，那么多的记忆或其他存在真的可以用无用与有用来衡量吗？@hj@曾经我认为一个人愿意在你身上花费的时间就是对方对你的爱，后来我发现这很有可能只是因为对方实在太闲了@hj@人生只有走出来的美丽，没有等出来的精彩。@hj@一个人的气质，与他长久的修为有关，一个易怒，易辩，易骂的人，很难有气质@hj@谁不曾试想过人生的其他可能，如果没有念现在的大学，如果选择其他的专业，如果现在从事着另外一个行业，如果没有认识某一人，等等等等，不过，我也忽然意识到，其实在想这些的时候，我们已经被周围的环境给限制了，所以，认认真真做自己就好了@hj@爱上了未知，爱上了不可预测的一切，就是爱上了这生命本身@hj@" +
				  "缘分是在一起的理由，分开时的借口@hj@不在乎的人从来不会说自己不在乎，就像最狠的人从来不会放狠话一样。@hj@即使一个清晨对应个黄昏，一个人也不完全属于另一人@hj@当你不经意间注意到一个原本擅长言辞的人突然沉默了，你就会想象，或许那一时片刻，他正在被某些不可告人的心事压得透不过气来。@hj@长大以后才懂，说话不用太漂亮，够量就好").split("@hj@");
		
		text59 = ("自己的好自己不知道，永远都是爱你的那个才懂@hj@总是习惯性去怜悯别人，却唯独忘了看看自己，总以为他人的需求都比自己的更迫切重要，能帮到对方就是最开心的事。这样的习惯让你活得轻松愉快，因为你心中装着最多的总是别人的痛苦，也因为你从来都不去看也看不清降临在自己身上的那些悲伤@hj@你不懂“私奔”的意思吗？“私奔”意思是：这次的爱太强烈，强烈到、我们必须把过去的人生全部作废@hj@多少年前试图摧毁我的东西，正是今天我力量的源泉。我需要很多很多年，才能从海浪中脱身。需要很多很多年，才能调匀自己的呼吸，学会操纵胳膊和双腿。@hj@有时常常会突然产生一种冲动，想对人诉说自己心中的不安，诉说那个寄栖在我体内，可怜而渺小的我，诉说紧缩成一团，害怕明天的幼稚的灵魂@hj@" +
				  "忙，却似乎也没忙成什么，时间被碾得如此之碎，一阵风吹过，稀里哗啦全都不知去向，以至于我试图回想这一年到底干了些什么时，发现自己简直是从一场昏迷中醒来@hj@是有这样的家伙啊，尽干些随意妄为的事，一副既不在乎自己也不在乎别人的样子，其实心里藏着比任何人都要柔和而耀眼的光芒@hj@我要用尽所有的生命划出一条自身存在的曲线，也许这条线不怎么清晰，但这曲线上的每一点都有我的汗水和思维的痕迹。挖下去，永不停息，也许什么都挖不着，可是一定可以挖到自己。在挖的过程中，我找到了自己灵魂的轨道@hj@名剑俱坏，英雄安在，繁华几十相交代。想兴衰，苦为怀，东家方起西家败，世态有如云变改。成，也是天地哀，败，也是天地哀@hj@有时候我们不得不忽略事情的真相，相信表面的美好，告诉自己一切都是可以重新来过的").split("@hj@");
		
		text60 = ("对有些人来说，生活就是不断破墙而出的过程，而对另外一些人，生活是在为自己建起一座座的围墙@hj@话总是考虑别人的感受是一件不太爽的事，但不考虑别人的感受事后往往会有沮丧与后悔。所以很多时候人们更愿意将话闷死在心里。人心才是真正的坟墓，埋葬了多少原本美好单纯的东西@hj@一旦我们充分了解了他人思想的肤浅和空洞的本质、他人观点的狭隘、他人感情的琐碎无聊、他人想法的荒谬乖张，以及他人错误的防不胜防，我们就会逐渐对他人大脑中进行的一切活动变得漠不关心。然后我们就会明白，任何一个过度重视他人观点的人给了他人过高的尊严@hj@太多的痛苦来自，无论在哪里都没有归属感@hj@年轻时代犯下的错，问题不在于谁单纯或谁不单纯，在未见高山之前，都是无情的人@hj@虚度也是一种珍惜。生命那么好，也许只有保持不看重，不拥有的姿态，才能更大程度的证明其价值@hj@" +
				  "有的时候你骂人，是因为宁愿造口孽也希望对方意识到自己错了，有的时候你选择沉默，是因为知道此人并不值得你这么做@hj@只要头顶上的天空还在用黑白更替，脚下的大地就是我们爱憎分明的底气@hj@当你完全不在意自己会走弯路，也愿意去尝试弯路，那就是你人生状态最好的时候@hj@不和变质腐坏的过去纠缠不清，是拥有美好未来的最基本条件@hj@命运以其不可知性为美，如果它能够被预测，那么也一定是它最无足轻重的那一部分@hj@“你以为我在与你作对，其实我只是选择了不再顺从。”@hj@我真正要的是一个人的孤独。一个人解决自己的难题，一次一个地解决，靠着清楚的思路和上手的工具，同样的，我也希望享受自己的辛苦，解决每天的各种挑战，或许很难对付，却都在有限的范围内，任何结果我都能预见。这才是我要的，我知道我可以做到，我有这份能力，孤独一人的能力，根本没什么好怕的。@hj@" +
				  "我们这样的普通人，有着简单的欲望和喜怒哀乐，生活虽然平庸，但是神圣不可侵犯。人与人之间的差别其实非常小，所以根本没有理由，抱着说教的态度，让别人改变生活。事实上，每个人只可能被生活改变，别人的话多是不相干的@hj@有些人，看似简单无心计，实则内里杂念丛生，用笨拙可笑的想象力，把你弄脏。而另外一些人，貌似荆棘密布，却枝干离离，清晰直白，思维复杂，心性单纯。为了交流的愉悦，和内心的清澈，我宁愿和后者交往").split("@hj@");
		
		text61 = ("我一直认为付出是美好的，尤其两个人的关系中，其实没所谓计较衡量值得不值得，只有愿意不愿意。你的得到其实在付出中已经有了，好像圣经中说的，爱到常以为亏欠@hj@越长时间不说话，就越难找到可说的话题。同样，事情搁置的时间越长，就越难以讨论@hj@遇到事情首先要从自己身上找问题，但不能一个劲地在自己身上找问题。你要给身边的人多一点信任，有时候真的是他们傻逼@hj@听两位天津小年轻在南大说的相声，甲：“相声广播女主持人一方这名儿起得多好，有意境，有位佳人在水一方么。我学习她，也给自己改个名字，我叫水土。”乙：“您这个名儿跟人家比可差点儿。”甲：“我这个差啊，有好的，给你留着呢！你叫一方人！”——包袱一般，这种事半功倍的占便宜手法值得推崇。@hj@" +
				  "我常常忘记自己依然是年轻的，常常忘记除了灵魂之外还有身体，常常忘记屏幕之外的世界也很大，常常忘记许多快乐应该是来自尘世的犒赏，而不只是精神的沉淀。@hj@等你终于明白并接受了“吃不到的鱼对猫一点意义都没有”这句话，你才算真正的懂得生活了@hj@不要一直跟着我，因为我也迷路了@hj@女人的寂寞是自己最美的时候别人却看不见， 男人的寂寞是自己最得意的东西别人不感兴趣").split("@hj@");
		
		text62 = ("如果自己不战斗，无论上帝还是恶魔都不会愿意你助一臂之力@hj@乔治：玛丽•哈奇，你为什么愿意嫁给我这种人？玛丽：我希望我的孩子长得像你。@hj@拿出来晒的，迟早要往里收的。不往里收的，迟早要晒干的@hj@给你道了再见甚至再也不见的人一般都还能再见面，真正想离开的人从来都会不告而别").split("@hj@");
		
		text63 = ("我的世界，豁然开朗@hj@真正的遗忘是多年以后，无意间提及到那个人，仿佛是说着别人的故事。那种时光中缓慢却又明显的变化，连自己都会心惊@hj@曾一直以为自己懂的别人也懂，后来发觉即使表达已足够清晰，别人该不懂的还是不懂。曾一直以为有种感觉叫只可意会不可言传，后来发觉没有人能和你的心意相通，一知半解已是最大幸运，离题万里才是常见现象@hj@谁要是相信，彻底改变生活的关键时刻必定惊天动地，内心情绪强烈激荡，便是大错特错。事实上，真正牵动人心的生命经历往往平静得不可思议，既非轰然作响、火花四溅，更非火山爆发，经验发生的片刻往往不引人注目，它们都只在悄无声息中进行着，超凡脱俗的高贵正在这种神奇的静默中@hj@独身者和小团体中最容易产生自恋者，你身处的世界越大，环境越复杂，越容易感受到自己的渺小与平凡。太多自感很不错的人，都是身处于一个相对独立封闭的空间之中，不曾眼见过太多风景@hj@" +
				  "爱情应是在极漫长时光中才能长好的东西，它的最美好之处在于猜而不是知。它不该是速食时代热量高营养少的简便快餐，而是慢火熬制百般滋味的营养煲汤。它的价值在于等待、忍耐，为了接近它、争取到它、维护它付出的宝贵代价。你为它花费了多长的青春多少的时间多大的诚意，它对你而言就有多重要珍贵@hj@我常焦虑自己时间不够，却又对仅有的一点时间挥霍无度@hj@“即使能够回头，我们大概也找不到那个起点了”@hj@“聪明的姑娘一般都会更胖一些，因为最新的科学研究证明，女性是用脂肪组织来储存智商的，脂肪层越厚，智商就越高。” ———————————— 哎算了，我也只能这么劝你了！！！~@hj@山上庙里有尊雕刻精美的佛像，前来拜佛的人络绎不绝。铺在山路上的石阶开始抱怨：“大家同是石头，凭什么我被人蹬来踩去，你却被人供在殿堂？”佛像笑了笑：“当年，您只挨六刀，做了一方石阶，而我经历了千刀万凿！”@hj@" +
				  "现在每个我遇见的笑着的人，他们都不曾因为苦而放弃，他们只因扛而成长。谁不希望自己活得轻松，没有压力，一切随性，但如果你真的那样去做的话，你会发现这个世界都在和你作对。如果有一天你真的觉得自己轻松了，那也不是因为生活越来越容易了，而是因为我们越来越坚强@hj@如果人静，那么他们在哪里都能静下来；如果人不静，那么他们就是在这里也静不下来。什么事情都取决于你自己。经中说“离相即佛”。我们都有佛性。你必须修行，然后才能觉悟到你的真性、你本来的面目。@hj@一个人的进步 只有时过境迁时的那个自己才看得到 他人是无法真正评断的 因为你看到的非全貌 只有深入变化之中的内心才能察觉并知晓").split("@hj@");
		
		text64 = ("你以为挑起生活的担子是勇气，其实去过自己想要的生活，才更需要勇气@hj@莫名其妙就能暴露出的锋芒，一定是受了某种匪夷所思的内伤@hj@虽然白发不是一天生长起来的，悲观心态不是与生俱来的，可当这些早已在你身上根深蒂固的现象被人指出来时，你还是会有突然的失落，突然的伤心@hj@为什么你们都不喜欢雨天，下雨的时候路上充满蒙灰、凉意、烦躁、黏腻、慌忙、破败、杂沓、狼狈和寂寞，湿答答又黏乎乎，就和真实的人生一样@hj@有时喜欢上一个人，仿佛就是因为喜欢上了他的生活方式，就像百无聊赖地走在街上，突然下起了纷纷扬扬的雨，突然很想体验淋雨的快乐，于是就把手插在裤兜里，吹着口哨，快乐地走向了他@hj@“有些事情不管你在谷底还是在巅峰，都不会改变，比如说空气，阳光，天空，云朵，星星，这些足以支撑你继续活下来的环境因素，如果你幸运的话，你还会发现，除此之外还有更多，像是珍贵的亲情、友谊、情感、也从未背弃你而去。 @hj@" +
				  "偶尔会羡慕起别人的人生而忘了把自己的现在过的更好@hj@十全十美的环境才能有所作为？那一辈子也别想有任何作为，世界不是那样运作的。谁家没有生病的老人，成叠的账单，阴险的亲戚，难管教的孩子，加一箩筐的不如意，若都能成为工作不力的藉口，地球早已停顿@hj@别在意那些在你背后说三道四的人，那只不过说明你走在了他们的前面@hj@白头偕老这件事其实和爱情无关，只不过是忍耐，但忍耐确实一种爱，所以真正爱你的人其实就是愿意一直忍耐你的人。").split("@hj@");
		
		text65 = ("很久以前，你不知道我的名，我也不知道你的名，我们遥远的像钟声..@hj@看她如此安静的生活，你忍心打扰？如果你不能给她更好的生活，让她静静地呆着吧@hj@学会嘲笑自己吧，就像人们必须笑的那样！虽然只是半拉子成功，但这又有什么好奇怪的？你们这些破碎的人啊，有多少事依然可能，有多少事已然成功！把小小的、美好的、完满的事物置于你周围吧，它们金色的成熟能治好心灵。完满之物叫人满怀希望@hj@我时常腻烦自己，以为借助旅行可以丰富个性，让我略有改观。我旅行一趟，回来的时候不会依然故我@hj@你不知道自己会记住些什么，记忆是很任性的@hj@可以迷惘，可以失去方向，但不要怕。一旦怕了，你就真的走不出去了@hj@当我们一同感慨时过境迁的时候，原来那些艰难也不过如此@hj@人最容易犯的错误，就是始终在重复着过去发生过的错误。@hj@能够说出来的秘密都不叫秘密，能够藏住秘密的内心，都是强大的内心 @hj@" +
				  "随着年龄的增长，“原地满血复活”这个技能的冷却时间变得越来越长@hj@人这一辈子，或活物质，或活精神。物质富有，精神或缺乏。精神强大，物质或贫瘠。但无论物靠质和精神，最后都无法据为已有。生命有限，你所需要的就是那么多，也那么少。物质和精神在死神前面都会扯平，是为人生@hj@那些失败的梦想，都没有了再次被提起的价值。它们曾经的存在就像对自己的嘲笑。你不能回忆，因为每一寸徒劳挣扎都已成灰").split("@hj@");
		
		text66 = ("很多时候我沉默，并不代表我认可，只是一时间还没想出一种不会伤害到你的表达去否认@hj@从小我们就被教导，要懂礼貌，要会客套，说话做事要顾及别人的感受。于是我们开始学会礼仪，我们学会善解人意。当我们的表面功夫越做越足，我们也越来越懒得听自己内心的声音。我究竟要什么，我究竟有没有勇气坚持我想要的东西，换句话说，我有没有勇气不顾别人的感受，坚持做自己@hj@真正治愈的语言不是教你如何去战胜命运，如何励志。而是让你可以暂且忘了生活的苦，可以放下烦忧一时开怀的笑").split("@hj@");
		
		text67 = ("清明那天，我会掸掸床，就当是扫墓了，里面埋葬了我多少的梦想和年华@hj@靠在床上看资料书，正当有些迷糊的时候，突然外面响起连绵不绝的鞭炮声，与此同时还夹杂着些风雨声。一下惊醒。想着自己靠在床头看书的样子，配合上外面的画外音，有一种梦回延安的感觉，房间里顿时弥漫着蛋蛋的忧国忧民的味道@hj@年幼之时渴望成熟，年长之后又向往本真。最被我们看重的，永远是生命中尚未到来或已经被带走的那一部分品质@hj@何处春江无月明，何处天涯无芳草，何处青楼梦不成，何处柳塘不啼鸟@hj@有些事情不是看到希望才去坚持， 而是坚持了才会看到希望。@hj@我并不在意去哪里或停在某处，我在意的是，想走的时候，有没有立即就走的勇气").split("@hj@");
		
		text68 = ("懒是一个很好的托辞，说得好像勤快了就真能干出什么大事儿一样；胖是一个很好的托辞，说得好像瘦了之后就真能有多好看一样；不想谈恋爱是一个很好的托辞，说得好像想恋爱时真能被人看上一样；年轻是一个很好的托辞，说得好像成熟了之后就真能有多大出息一样@hj@“你喜欢谁？” “反正不是你。” “你骗我下会死啊？” “骗了啊，没死。”@hj@世界上最好的安慰，并不是告诉对方“一切都会好起来的”，而是苦着脸说“哭个屁，你看，我比你还惨”@hj@其实，每个人若诚实地回忆自己一生，都很容易觉得真是鬼使神差，那么多细碎的、完全无法控制无从察觉的偶然不偏不倚地铸造成我们如今的人生模样，简直像单向道一般，因此，我们往往被迫转而相信其中一定有某种神秘性的命定力量帮我们拣择帮我们安排@hj@我们拼命节省时间的唯一目的就是让可供浪费的时间无限多@hj@人生总是在以下苦恼中循环往复，挣扎不出：一是得不到的想得到，二是得到了又怕失去，三是总觉别人得到的比自己得到的要好@hj@" +
				  "等待是对一个人最大的销蚀。@hj@相信上天的旨意，发生在这世界上的事情没有一样是出于偶然，终有一天这一切都会有一个解释@hj@时间治好了忧伤和争执，因为我们在变化，我们不会再是同一个人。一点点小事就可以安慰我们，因为一点点小事就可以刺痛我@hj@生活中绝大多数人都像孩子一样软弱，也像孩子一样倾向于把自己融入某种保护性的力量。他们选择最便捷的生存哲学以塑造最虚假的人格系统，其目的正是要回避“切肤之痛”的自我认识。他们这样轻而易举地抛弃了自己，心甘情愿躲在谎言与伪饰的甲胄里，他们错待了自己并将持续下去@hj@情绪不好的时候，就想啊，不就是个情绪嘛，对待情绪，要有一种英雄主义的态度。说白了，要有一种“我跟你拼了”的泼妇精神。与天斗，与地斗，不如与自己斗，其乐无穷也").split("@hj@");
		
		text69 = ("在这个世界上别太依赖任何人，因为当你在黑暗中挣扎的时候，连你的影子也会离开你@hj@总会有些东西，让你既想对全世界炫耀，又不舍得与任何人分享@hj@那又怎样，以前是多么尖锐羁傲的少年，画笔吉他，信仰和文字说丢就丢了，剪去长发按时吃饭成为眉目平和的人，去电影院看电影，认认真真恋爱结婚。好像那些轰轰烈烈，任性妄为是别人的故事一样。应该说，这就是别人的故事了。不计代价的自由不该存在我们所熟悉的这个世界，没有人富裕到能挥霍一生。@hj@一层含义是对自己的期望值更高，自信的另一层含义是对自己的现状已近满足。无论是自卑还是自信，想让它们变成对自身有助益的能量，你都要同时再拥有一份“自知”。@hj@鲤鱼找到鲤鱼，云雀找到云雀，春水流入秋水，夏泥化作冬泥。性相近的，在一起，心相知的，要分离。雨还没有落哪，鞋已经湿啦。红花开出红花，山曲哼成山曲，东风经过西风，南篱对着北篱。种瓜木的，会结果，种因缘的，无尽期。天已经黑了，人不能睡呢").split("@hj@");
	
		text70 = ("旧城里没有阳光，你和我的一个梦长得好像@hj@我努力的生活 努力的做一个纯粹又复杂的人 我只是想守着我那些五颜六色的 只有我自己能看见的 梦@hj@立志要做个 爱笑的 女生@hj@你一定要等，不要失望，不要犹疑。这么大的世界，这么长的人生，总会有一个人让你想温柔的对待。@hj@我总觉得，这世上最悲伤的事莫过于有一天父母会老，我们会老，所有的天真、忧伤、彷徨、幸福、疯狂都只是曾经。每次想到心里就难过的打结般疼痛。").split("@hj@");
	
		text71 = ("人们回避真实并非都由于缺乏诚实的品质，更多的情况是出于麻木、软弱、仁慈，或者仅仅是因为忍受不了真理的直截了当。接受真实可以比说谎更为痛苦和窘迫，自欺是逃避现实的一种方便而舒服的方式@hj@我们常常是多么麻木。给予也许实际上是想得到，至少是想得到别人对自己的一点注意力。这类以自私为背景的给予，常常又以困惑，甚至反诘来告终：“我给了你这么多，为什么你没反应，不回报？”也就是说：“我如此这般爱你，你为什么还会不接受我？”@hj@那年，单纯木讷的他遇到了她，她成熟，有风韵，总是笑骂他傻孩子。时针旋转，傻孩子变的老练，世故，他发现曾经那么景仰的她其实只是万千女人中的一个，素雅，平凡。离开后，他遇到了又一个她，天真，活泼，惹人怜爱。她犯傻了，他默默帮她打理好一切，轻轻的说了句，傻孩子。他忽的愣住了。@hj@" +
				  "真正的绝望跟痛苦、悲伤、惨痛都没关系，真正的绝望让人心平气和。你意识到你不能依靠别人得到快乐、充实、救赎。那么，你面对自己，把这种意识贯彻到一言一行当中。 命运的归命运，自己的归自己。一个人要像一支队伍，不气馁，有召唤，爱自由@hj@每个人的心里，有多么长的一个清单，这些清单里写着多少美好的事，可是，它们总是被推迟，被搁置，在时间的阁楼上腐烂。为什么勇气的问题总是被误以为是时间的问题，而那些沉重、抑郁的、不得已的，总是被叫做生活本身。@hj@世界上的一切问题，都能用“关你屁事”和“关我屁事”来回答，突然感觉屁好忙@hj@知道大人物是什么吗？就是一直不断努力的小人物。@hj@真经不在西天，而在路途；佛祖不是如来，而是自我；那成群结队的妖精乃是人心生出来的欲望和执念，三大徒弟其实是唐僧多面的性格和天赋秉性。生活平波无澜不外人心已死，你还愤恨，你还痛苦，你甚迷茫，你就是那个时时刻刻跟妖精斗争的取经僧，你脚下的路，永远是通向自我的路").split("@hj@");
		
		text72 = ("其实我是这样的人，不管经历了多么艰难痛苦的事，都会抱有希望。所以你更不必担心我会如何沉沦，只需给我时间，让我自愈。小丸子都懂这个道理，只要活着，就一定会遇到好事呢。@hj@到处都有痛苦，而，比痛苦更为持久且尖利伤人的是，到处都有抱有期望的等待。@hj@在一回首间，才忽然发现，原来，我一生的种种努力，不过只为了周遭的人对我满意而已。为了博得他人的称许与微笑，我战战兢兢地将自己套入所有的模式所有的桎梏。走到途中才忽然发现，我只剩下一副模糊的面目，和一条不能回头的路@hj@所谓人的老去，不过是认命。知道有些境地始终摆脱不掉，有些事情始终做不到，有些愿望始终无法实现。有时我会认为，完美的生命旅途，不是老去，是无疾而终。是不告而别@hj@在人生中的一次次凶险面前，我的懦弱总能战胜我的理智。@hj@" +
				  "正是因为我们生性清冷，我们才要彼此取暖，我们要看着对方的眼睛说话，我们要夜深的枕边一个温暖身体的依偎，一个熟悉的翻身动作以及口腔的气味，我们需要哭泣时依傍的肩头，因为，人从来都是顶顶脆弱，需要交流得动物。@hj@悲伤和爱，都曾货真价实@hj@记住，虽然不能把自己的幸福建立在别人的痛苦上，但也决不能让别人的幸福建立在你的痛苦上@hj@生活从最开始到最终，是不具备含义和目的的，不可预知不可重复的一个过程，只有傻瓜才能预知自己的生活。这个过程是由每一秒钟和每一时刻来完成的。这些时刻可以被现为或体现为一个完整的世界，它们是一张照片，一种声音，一个眼光，如果没有这些，那就没有所谓生活@hj@" +
				  "弟子问老师：“您能谈谈人类的奇怪之处吗？”老师答道：“他们急于成长，然后又哀叹失去的童年；他们以健康换取金钱，不久后又想用金钱恢复健康。他们对未来焦虑不已，却又无视现在的幸福。因此，他们既不活在当下，也不活在未来。他们活着仿佛从来不会死亡；临死前，又仿佛他们从未活过。”").split("@hj@");
		
		text73 = ("如果觉得生活是一种刁难，一开始就输了。如果觉得刁难是一种雕刻，迟早都会赢的@hj@我们不肯探索自己本身的价值，我们过分看重他人在自己生命里的参与。于是，孤独不再美好，失去了他人，我们惶惑不安@hj@如果你想拥有你从未有过的东西，那么你必须去做你从未做过的事！@hj@想要忘记一段感情，方法永远只有一个：时间和新欢。要是时间和新欢也不能让你忘记一段感情，原因只有一个：时间不够长，新欢不够好@hj@只要理出一个头绪，你就会明白其实人们在很多方面都是很相似的，特别是在青春期和刚步入成年人行列的时候。在大半情况下，人们都会有同样的生活经历，都会想同样的事情，只不过几乎每个人都相信自己的经历才是独一无二的，无论从哪个角度看都是如此@hj@" +
				  "发生过的事，以后还会发生；做过的事，将来还要再做。太阳底下没有新的事。有谁能说，看，这是新事？不，在我们出生之前早就有了。以往的事没有人去追忆，今后的事也没有人去挂念。@hj@不管你学什么专业，找工作一定要找个你喜欢的，这样你每天早晨六点到晚上八点都是高兴的。再找个喜欢的人在一起，这样晚上八点到早晨六点就是开心的，这就是生活@hj@明言着轻蔑什么人，并不是十足的轻蔑。惟沉默是最高的轻蔑——最高的轻蔑是无言，而且连眼珠也不转过去。@hj@我有一种让人难以接受的经验：任何快乐被分享时都会被削弱，任何内心的冲突一经说出反使人更加挣扎。@hj@我想我总是不知道要如何去学会放弃，现在我知道。其实，有些是你根本就无法掌控的，不是你不去放弃，而是你根本就抓不住。@hj@其实有时候想想，是真的爱的深，还是因为不甘心@hj@问题是，当我们面临一切问题时经常处于不能选择。于是，我们只有坚定不移地走下去。").split("@hj@");
		
		text74 = ("亲爱的老朋友，如果有天我们变陌生了，那么我就重新认识你@hj@南非总统曼德拉曾被关压27年，受尽虐待。他就任总统时，邀请了三名曾虐待过他的看守到场。当曼德拉起身恭敬地向看守致敬时，在场所有人乃至整个世界都静了下来。他说：当我走出囚室、迈过通往自由的监狱大门时，我已经清楚，自己若不能把悲痛与怨恨留在身后，那么我仍在狱中。@hj@如果当初没有遇见你,或许我还是原来的我@hj@要冷静耐心。你尽量让坏事发生好了。你不要躲避。相反，你要认真观看。你要用主动的理解代替被动的接受刺激。这样你就会应付这些事情。人只有经历自己的渺小，才能到达高尚@hj@我总是试图照顾别人的感受，最后终于发现对不起了自己@hj@当我渐渐爱上想念本身而不是想念的那个人，你其实已不必再出现@hj@" +
				  "我走得很慢，但是我从来不会后退@hj@长夜其实是另一个白天，这时可以听见心跳，令人情不自禁地说出心里话，还原于本我@hj@不知道大家是不是有这样的经历：①照镜子时间长了，会发现镜子里的自己很陌生；②长时间盯着一个常用字看，会发现仿佛不认识这个字了。 有人说那是因为现实生活中有两个“我”存在，只有在一个人精神分裂时，别人才会发现另一个“我”。 你有过这种感觉吗？@hj@梦想是值得每个孩子每时每刻忧伤的念头。@hj@不要欺骗任何相信你的人，不要相信任何欺骗你的人@hj@说走就走，是人生最华美的奢侈，也是最灿烂的自由。@hj@正如故乡是用来怀念的，青春就是用来追忆的。当你怀揣着它时，它一文不值，只有将它耗尽后，再回过头看，一切才有了意义。爱过我们的人和伤害过我们的人，都是我们青春存在的意义。").split("@hj@");
		
		text75 = ("有关幸福生活的定义，其实就是在一个早晨，睁眼时不必心事重重。@hj@忙，却似乎也没忙成什么，时间被碾得如此之碎，一阵风吹过，稀里哗啦全都不知去向，以至于我试图回想这一年到底干了些什么时，发现自己简直是从一场昏迷中醒来@hj@那时，我突然明白了过来：原来我一直害怕的不是上帝、魔鬼或是死亡；而是，即便我们不再存在，万事万物却依然如常继续 @hj@你年轻时候的朋友，是你一辈子最好的朋友，因为彼此还来不及看到完整的对方，来不及看到和社会和岁月顽抗后，留下的伤痕和脓口。于是现在，在彼此心中看到的脸是那张早已经不存在的脸。然后说出名字，那个已经不存在的脸会重新从对方脸上清晰出来，成为彼此眼中认定的那个人@hj@人们每天都在重复，消磨时光的同时，被时光消灭了@hj@" +
				  "没人知道他大闹天空的原因。他爱上了观音。就像捣蛋的孩子，想要母亲关注。如果金箍不是她给的，老和尚念咒时，早就被一棒打死。金箍寸寸收紧，痛的不是头，是心。那些妖怪他一只手指就能捏死，假装打不过才能和她亲近。有时南风吹来，八戒问他因何流泪，他说五百年前的烟火熏伤了火眼金睛。 @hj@让女人念念不忘的是感情， 让男人念念不忘的是感觉。感情随着时间沉淀，感觉随着时间消失。终其是不同的物种，所以，谁又能明白谁的深爱 ，谁又能理解谁的离开。@hj@你的孤独是因为你既希望有人关心，又不想被谁过分打扰。 @hj@很多事都介于“不说憋屈“和“说了矫情“之间 ").split("@hj@");
		
		text76 = ("常有人叫你退一步，退一步等困难过去了再说，于是你往后退，当你退到能看到全局的地步，除了去适应它，你已经来不及做任何改变了。所以别退，千万扛住，扛到最后，要么你强大了，要么困难就真的过去了@hj@是不是人人都如此？我年轻时总感到自己一会儿信心十足，一会儿又自信丧尽。我想像自己完全无能，毫无魅力，没有价值。同时我又觉得自己是天生我才，并且可以计日功成。在我充满自信时，我连最大的困难也能克服，但哪怕一次最微不足道的失误，也叫我确信自己仍旧一无是处。 @hj@一切不以分手为目的的吵架，都是他妈的秀恩爱！ @hj@最终，逼迫你做出“放弃”这个决定的真正原因，不是你万分努力千方百计十分认真一丝不苟的付出得不到半点回报，更不是你接二连三的失败，也不是你四处碰壁七上八下的忐忑，而是，别人不用付出半点汗水一点努力便十分圆满万事如意的无端成功 @hj@" +
				  "男人最酷的时光都留在他们还是穷光蛋的年月：守着一颗还没碎的完整的心，用尽全力去疯狂、去理想、去诗意、去执着，孤注一掷并且自命不凡，撞了南墙仍心存幻想，这个时期的男人是喷了香水的格雷诺耶，迷倒众生。@hj@如果人静，那么他们在哪里都能静下来；如果人不静，那么他们就是在这里也静不下来。什么事情都取决于你自己。经中说“离相即佛”。我们都有佛性。你必须修行，然后才能觉悟到你的真性、你本来的面目 @hj@姑娘，别再胡思乱想了，世 界上最爱你的那个男人已经娶了你妈妈了… @hj@生活里总是有人莫名其妙就走失了，他们存在在那里的时候显得理所当然，但走失之后，空白就格外显眼 @hj@“归属感”是你强烈地想和他在一起，“安全感”是你觉得他强烈地想和你在一起。@hj@人总是要死的，不死的只有爱情。所以，爱情是独立于人生之外的东西。无论你相信也好，不相信也好，它总是逍遥地存在，从来不会真的拯救谁@hj@" +
				  "选择，与其说是选择一种，毋宁说是放弃一种。当你面对两种选择而无法放弃时，抛硬币就好。它的作用，不在于为你解决了问题，而在于硬币在空中的一瞬，你突然知道你最希望得到什么@hj@世界上最疼痛的话是：“我爱你，但是......”。世界上最甜蜜的话是：“...... 但是，我爱你。” @hj@我不是不理你，我只是。。。在等你先开口").split("@hj@");
		
		text77 = ("让风把眼泪吹干.......@hj@成熟这个事儿就是，你永远不能绝对成熟，但是会慢慢的看到身边人的不成熟。@hj@高考之后，马上又将会有这么一群孩子，迫不及待的扔下书包，聚餐，通宵上网，旅行，K歌，闲逛，狂欢……认为自己终于解放了……殊不知的，你们离开的，就是天堂 。 @hj@有一天你会忘记我，投身于新的爱情放纵在她的世界里；有一天你会有一个美丽的妻子，可爱的孩子；有一天你会忙碌在纷繁的人群中，忘记年轻时的梦想；有一天你会我会擦肩而过，但却辨认不出彼此；有一天你会偶尔想到我的名字，却记不得我的模样；有一天你会终老于病房，到死都不再想起我…… @hj@有没有爱过一个遥远的人，他从来都不让你绝望，是你继续活下去的勇气和力量。他永远是年轻的，美好的，光芒万丈的，他永远在那里，好像信仰一样。 @hj@婚姻是很多人的事儿，恋爱是两个人的事儿，爱情又不是一个人的事儿……你说，这都是些什么事儿？ @hj@" +
				  "眼睛能看到的地方叫视力，眼睛看不到的地方叫眼光@hj@有的东西不过很久是不可能理解的，有的东西等到理解了又为时已晚。大多时候，我们不得不在尚未清楚认识自己的心的情况下选择行动，因而感到迷惘和困惑。@hj@在这个世界上，没有人真正可以对另一个人的伤痛感同身受。你万箭穿心，你痛不欲生，也仅仅是你一个人的事，别人也许会同情，也许会嗟叹，但永远不会清楚你伤口究竟溃烂到何种境地。所以，无所谓把血痂撕开让人参观。@hj@奥特曼，你这是肿么了，快起来啊！！ @hj@人生的许多大困难，只要活着，没有什么是解决不了的。时间和智慧而已 @hj@无缘无故的离别最伤人，无缘无故的相爱最动人 @hj@信任就如同一个一岁小孩的感觉，当你将他扔向天空的时候，他会笑，因为他知道你会接住他，这就是信任 @hj@心里发毛的感觉令你十分难受，你感到害怕，直冒冷汗，但是你又不知道怕的是什么。只知道反正有什么倒霉的事发生了。但是你又不知道究竟是什么事。这就是那种被人叫做焦虑的情绪。").split("@hj@");
		
		text78 = ("所谓心事，不过是不如己意，那就是我执，执著于自己描画的理想，一有落差，即生烦恼。@hj@人最悲哀的，并不是昨天失去得太多，而是沉浸于昨天的悲哀之中。人最愚蠢的，并不是没有发现眼前的陷阱，而是第二次又掉了进去。人最寂寞的，并不是想等的人还没有来，而是这个人已从心里走了出去。 @hj@我见过你最深情的面孔和最柔软的笑意，在炎凉的世态之中，灯火一样给予我苟且的能力。---- 七堇年 @hj@让心事自生自灭，是一件危险的事情，因为它绝不会真正消失，只是貌似离去，耐心地等待着卷土重来 @hj@我有一筐的愿望 却只等到一颗流星@hj@瘦子永远体会不了胖子站在秤上的忧伤，胖子永远理解不了瘦子轻易被推倒时的凄凉。@hj@有时候会做些不靠谱的梦。醒来发觉，现实比梦还不靠谱@hj@都说时光飞逝。其实时间一直都在，只是自己的心在变，情在变。人说抵挡不过时间，其实是时间抵挡不过我们的善变。 @hj@" +
				  "简单的不一定是最好的，但最好的一定是简单的@hj@你若不想做，会找到一个借口；你若想做，会找到一个方法 @hj@在看得见你的地方，我的眼睛和你在一起；在看不见你的地方，我的心和你在一起。 @hj@you said no flowers@hj@很多时候，旅游只是一个名义上的借口。我们只是需要跑到一个陌生的地方，那里没有加班，没有职场上的激烈竞争，没有那些令人感到焦虑的潜规则和过于复杂的人际关系。更关键的是，我们可以暂时忘掉那种残酷的现实生活带来的巨大压力，获得调养失衡身心的难得机会 @hj@生活的悲剧不在于一个人输了，而在于他差一点赢了 @hj@我是一条在水里游的鱼，看见你飞过蓝天 ").split("@hj@");
		
		text79 = ("大学心理课上，白发苍苍的老教授问：“哪位同学能解释什么是良心？” 一同学答：“良心是我心里一个三角形的东西。我没有做坏事，它便静静不动；如果我干了坏事，它便转动起来，每个角都把我刺痛；如果我一直干坏事，每一个角都磨平了，也就不觉得痛了” @hj@我认识的人越多，我就越喜欢狗@hj@“你有《时间简史》么？”“神经病，有时间我也不捡那玩意儿啊……”@hj@“一个人成熟的标志之一就是，明白每天发生在自己身上的99%的事情对于别人而言根本毫无意义”。@hj@恋爱从来没有大道理，只有小故事 @hj@这世上总会有一个人是你永远不想辜负的，坚强争气为了他，忍耐也为了他，即使一不小心辜负了自己@hj@我发现，随着年岁的增长，我变得越来越心情松弛。这可以理解为从容，也可以说是无可奈何@hj@" +
				  "差不多所有对我影响最大的人都好像是偶然遇合，然而，回想起来却像是非碰上他们不可似的。那就像是他们全在那里等待我在需要时找上他们。@hj@什么都可以从头再来，只是青春不能。那么多事情，跟青春绑在一起就是美好，离开青春，就是傻冒。@hj@未来之所以美好，正是因为不知道它的烦恼 @hj@期待是所有心痛的根源。如若不曾有期待，就不会有那么多甜美的憧憬，如果不曾有期待，也不会有那么多失望的眼泪。。。心不动，则不痛@hj@真正的开悟，是在任何时候任何情况下都能从容地活着@hj@蚂蚁和大象结婚了，可是没几天大象就死了，蚂蚁非常伤心，一边哭一边骂到：亲爱的，你怎么走在我前面了呢，这辈子我他妈不用干别的了，就埋你了！！!").split("@hj@");
	
		text80 = ("世界上的事都没什么大不了的。我们笑的时间，远远超过了哭。我们会看到原本不相信的东西，但是，一觉过后就全忘啦！ @hj@最后你发现，所谓的你，那不是你，而是周围这一堆朋友。你周围的朋友，你读过的书，看过的电影，甚至你讨厌的人，他们构成了这一个你。 @hj@你他妈倒是给我留双筷子啊！！ @hj@人们常常用咄咄逼人来掩饰弱点，真正持久的力量存在于忍受中，只有软骨头才急躁粗暴，他们因此丧失了人的尊严。我等待，我观看。恩惠也许来，也许不来。也许这种既平静又不平静的等待就是恩惠的使者，抑或恩惠本身 @hj@在一回首间，才忽然发现，原来，我的一生的种种努力，不过只是为了周遭的人都对我满意而已。为了要博得他人的称许与微笑，我战战兢兢地将自己套入所有的模式，所有的桎梏。走到中途，才忽然发现，我只剩下一副模糊的面目，和一条不能回头的路。把向你借来的笔还给你吧。 @hj@" +
				  "我们对自己特性的认识总是在一些相互矛盾的评价中飘忽不定。在摇摆无定的情况下，我们的判断完全受制于社会的态度。我们的“自我”就像一只漏气的气球，需要不断充入他人的爱戴才能保持形状，而经不起哪怕是针尖麦芒大的刺伤。@hj@最沮丧的时候，我想像你一样沉默，这样我就到了离你最近的距离，仿佛镜子里映照出了你，但那正是我自己。我们穿同一个身体 @hj@如果你不能简单说清楚，就是你还没有完全明白 @hj@我曾做过一个小梦，怪他一声不响地忽然走了。他现在故意慢慢走，让我一程一程送，尽量多聚聚，把一个小梦拉成一个万里长梦。这我愿意。送一程，说一声再见，又能见到一面。离别拉得长，是增加痛苦还是减少痛苦呢？我算不清。但是我陪他走的愈远，愈怕从此不见@hj@真正受过教育的人总想去读那些揭示事物真理的书，而那些半受教育之辈，则宁肯去读那些将告诉他意欲何为之书，好从中了解他受虚荣心驱使而希望发生的事情 有人看书看会了 有人看书看开了 @hj@" +
				  "凡是你抗拒的，都会持续。 / 当你真心想要一样东西的时候，你身上散发出来的就是那种能量的振动频率，然后全宇宙就会联合起来帮助你达到你想要的东西。 ——张德芬《遇见未知的自己》 @hj@当我想愤世嫉俗的时候，我都会问我自己：我有没有做得很好或以后有没有可能犯同样的错？可是想那么多，就懒得愤世嫉俗了 @hj@等交通信号灯的时候经常遇到不知道还剩多少等待时间，设计师Thanva Tivawong用沙漏电子屏的方式解决了这个问题，当红色或绿色的光即将耗尽，就会变换成黄色，同时显示剩余时间 @hj@据说 未来的个人办公桌是这样的@hj@如果能记住整个梦，那将是一种极大的娱乐，你仿佛被俘虏进另一个世界里一般，让你觉得有意识的世界中的许多责任都非常遥远。").split("@hj@");
	
		text81 = ("当手里的每一张牌都是坏牌，想要赢一把的唯一办法就是打破游戏规则@hj@如果路上有一颗尖锐的小石块，它并没有扎破你的脚，但想到很多人路过可能被扎，于是你把尖石移开了。没人要求你这么做，也没有人看到，那个因你而未被扎的人，也许永远不知道。但你还是移开了石头，不然，就会扎了自己脚般地难受。只有你这样的人，才明白爱是什么，才能带来一个温馨的，文明的世界。@hj@两个人在一起，更多的不是改变了对方，而是接受了，所以说包容呢，如果光想着改变，那不是生活，那是战争。@hj@你容不下我，不是你的心胸太狭小，是我的人格太伟大。@hj@别以为我什么也不记得，我仍旧跟大家一样有梦想，偶尔我也会想，换一个人生会是什么样。眨眼我就四十、五十、六十岁了。我或许是个白痴，但是，我多半岁月都在努力做对的事——梦想终究只是梦想，不说别的，我认为，我永远都可以回顾过去，然后跟自己说，起码我的人生过的并不乏味。 	——《阿甘正传》@hj@" +
				  "如果说出的每一句话，都思前想后，如果走的每一步，都小心翼翼，如果做出的每一个选择，都怕将来的自己后悔，那么，要青春做什么！@hj@累么？累就对了，舒服是留给死人的。。。@hj@因为喜欢回忆的缘故，你比你的同龄人显得年长。但同样是因为喜欢回忆的缘故，你永远都不会像他们那样老去。@hj@许多人在重组自己的偏见时，还以为自己是在思考。").split("@hj@");
		
		text82 = ("你有很多话要说，所以你才会沉默。@hj@越来越觉得，委屈这回事儿是没有必要在大家面前说的。如果没有人安慰，我会觉得自己更加委屈；太多人安慰，我会觉得自己那点委屈其实没那么痛苦，只是在无理取闹罢了。@hj@几乎每一个人都把生命浪费在试图表现出某些自己并不具备的品格,或赢得某些自己无法享有的喝彩上面@hj@我迷茫，但我从不逃避现实。我冷漠，可是只要遇见对的人，我会燃烧。我怯弱，但必要时我会拿出足够的勇气。我没有宏伟的理想，但每一天我都在默默的努力。我也许渺小，但我值得自己骄傲@hj@我身上有两个自我：一个好动，什么都要尝试，什么都想经历；另一个喜静，对一切加以审视和消化。好静的那个我把我派遣到人世间活动，关切地把我置于它的视野之内，即使遭受最悲惨的灾难和失败，只要识得返回它的途径，我就不会全军覆没。它是我的守护神，为我守护着一个永远的家园，使我不致无家可归。汪涵@hj@等待下一个明天的时候，才晓得什么是漫漫长夜@hj@" +
				  "我们的目标十分优雅，却在不知不觉中俗气了许多。@hj@“ 世间太多的错失，不是因为愚蠢，而是因为太聪明。”@hj@就这样，我自以为是的坚持着，走进了为自己而设的迷宫@hj@沉默久了，会变得消沉。人群中仿佛只有自己，无边无际的冷清。偶尔被不干系的一句话刺到心里去，疼痛不已。我从来不是世界上最寂寞的人，也不会被忧伤折磨到死去，何以沉溺其中不能自拔？情绪就是心魔，你不控制它，它便吞噬你。@hj@有人为了生活而流浪，有人为了流浪而生活。 而所谓故乡，就是祖先流浪的最后一站。@hj@有时候，接受，是因为不懂得拒绝。@hj@羡慕生活在这里的人，每天都有美色陪伴。可他们却说习以为常，什么都看不见了。原来，熟悉的地方没有风景@hj@我睁着一双酒精迷惑的眼，看路面，黑白相间。忘了昨夜的梦，搜寻回家路线，追忆逝水流年。不敢轻言，关于爱的承诺。每一次彻底孤单，念经，山重水复，水滴石穿。@hj@" +
				  "每个人都是自己的上帝。如果你自己都放弃自己了，还有谁会救你？每个人都在忙，有的忙着生，有的忙着死。忙着追名逐利的你，忙着柴米油盐的你，停下来想一秒：你的大脑，是不是已经被体制化了？你的上帝在哪里？@hj@人生最大的幸福，是发现自己爱的人正好也爱着自己。我要你知道，这个世界上有一个人会永远等着你。无论什么时候，无论你在什么地方，反正你知道总会有这样一个人。@hj@作为一个过客，我的孤独，你不必懂").split("@hj@");
		
		text83 = ("没吃饱,人只有一个烦恼;吃饱了,人就有无数个烦恼@hj@生活总是让我们遍体鳞伤，但到后来，那些受伤的地方一定会变成我们最强壮的地方@hj@“感情再深，恩义再浓的朋友，天涯远隔，情义，终也慢慢疏淡。不是说彼此的心变了，也不是说不再当对方是朋友，只是，远在天涯，喜怒哀乐不能共享，原来，我们已是遥远得只剩下问候——问候还是好的，至少我们不曾把彼此忘记。”@hj@我知道，和我在一起你抛弃了很多，但是我一无所有，我只能抛弃我自己@hj@一个人总要走陌生的路，看陌生的风景，听陌生的歌，然后在某个不经意的瞬间，你会发现，原本是费尽心机想要忘记的事情真的就那么忘记了。@hj@没有人想被束缚，但问题是给你一片无边无际的天空，你是否真的敢要").split("@hj@");
		
		text84 = ("别人再好，也是别人。自己再不堪，也是自己@hj@想入非非，是通向科学探索的必需的和首要的步骤。@hj@上帝会把我们身边最好的东西拿走，以提醒我们得到的太多@hj@想入非非，是通向科学探索的必需的和首要的步骤。@hj@人生重要的不是所站的位置，而是所朝的方向@hj@没有人永远十七岁，但永远有人十七岁。@hj@真的，有很多事，是要发一点疯才能做出来的。@hj@有云的地方就有天下，有人的地方就有江湖。@hj@世界上只有想不通的人，没有走不通的路。@hj@人的成长要接受四个方面的教育：父母、老师、书籍，社会。有趣的是，后者似乎总是与前面三种背道而驰。@hj@我们无法选择过自己想要的生活，但至少可以选择不过自己不想要的生活").split("@hj@");
		
		text85 = ("当一个孩子有一天意识到大人们都不完美时，他成为了少年；某天他原谅了他们，就变成了大人。@hj@有时候，道歉并不一定代表你真的错了。放下自尊，只因为你珍重这份感情。@hj@如果你不能应付我最差的一面，你也不值得得到我最好的一面@hj@最怀念的是什么？ 那些什么都不用怀念的日子 @hj@有时候不是不懂，只是不想懂；有时候不是不知道，只是不想说出来；有时候不是不明白，而是明白了也不知道该怎么做，于是就保持了沉默。@hj@这世上有没有另一个我，过着我想要的生活@hj@我想变成你，见你所见，爱你所爱@hj@遇见你。千万人当中，在时间的无涯的荒野里，没有早一步，也没有晚一步。@hj@我们降生在这多彩多姿繁华绚烂的世界上，唯一的目的就是好好活下去。活给自己看，也活给爱自己的人看，更要活给那些瞧不起自己的人看@hj@" +
				  "人生中最美的珍藏，正是那些往日时光，虽然穷得只剩下快乐，身上穿着旧衣裳。。。我们曾是最好的伙伴，共同分享欢乐悲伤，，如今我们变了模样，为了生活天天奔忙，假如能够回到往日时光，哪怕只有一个晚上@hj@是不是当思念汇集成了一条河，你就可以，乘舟而来。《三行情书》").split("@hj@");
		
		text86 = ("说真话的好处就是，你不必记得你都说过些什么。@hj@当明天变成了今天成为了昨天，最后成为记忆里不再重要的某一天，我们突然发现自己在不知不觉中已被时间推着向前走。------ 这不是在静止的火车里，与相邻列车交错时，仿佛自己在前进的错觉，而是我们真实的在成长，在这件事里成了另一个自己。@hj@有许多人将他们的想象当做了记忆@hj@在甜蜜的梦乡里，人人都是平等的，但是当太阳升起，生存的斗争重新开始时，人与人之间又是多么的不平等@hj@当路上遇上河流的时候， 我学会了游泳； 当路上遇上山脉的时候， 我学会了攀登； 当路上遇上沟壑的时候， 我学会了跨越； 当路上遇上美景的时候， 我学会了欣赏 …… 人总是这样在路途中慢慢长大。@hj@我们缺少的不是机会，而是在机会面前将自己重新归零的勇气。@hj@" +
				  "You make millions of decisions that mean nothing，and then one day your order takes out and it changes your life。 你每天都在做很多看起来毫无意义的决定，但某天你的某个决定就能改变你的一生。《西雅图不眠夜》@hj@We are alive; let us live. We have the ability to experience; let us experience. 我们活着，那我们就要活得精彩；我们有能力体验，那我们就要体验人生甘苦。生命的意义在于一瞬间，一个经常被我们忽略的暂瞬间。这些瞬间串联在一起，我们称之为事件；这些事件串联系在一起，我们称之为生活。@hj@离去的人根本不知道那即将是一场告别。带着微笑远离，是最幸福的一种离别。所有的不舍，留给等待的那个人。一天将尽，离别之后，明日我们还会相见吗？明日，也许是天涯之遥@hj@有些人，虽然没差几岁，但隔着的是整个江湖").split("@hj@");
		
		text87 = ("“如果有来生，要做一棵树，站成永恒，没有悲伤的姿势：一半在尘土里安详，一半在空中飞扬；一半散落阴凉，一半沐浴阳光。非常沉默非常骄傲，从不依靠从不寻找。”------ （三毛）@hj@其实千万个美丽的未来，抵不上一个温暖的现在；每一个真实的现在，都是我们曾经幻想的未来@hj@能够在单独一个人的时候，不觉得孤单；在冷清的时候，不觉得寂寞；在空闲的时候，不会无所事事，所靠的是内心的丰富与充实@hj@不要嘲笑年轻人，那是你来时的路；不要嘲笑老人，那是你将去的路").split("@hj@");
		
		text88 = ("你现在长大了以后，你会发现你身上很多东西都是从小养成的，是你父母给你的影响，想去改都很难，所以家庭环境真的真的很重要。 @hj@人与人之间，最可痛心的事莫过于在你认为理应获得善意和友谊的地方，却遭受了烦扰和损害。《巨人传》@hj@“一个人生命中最大的幸运，莫过于在他的人生中途，即在他年富力强的时候发现了自己的使命。”——斯蒂芬•茨威格曾在《人类群星闪耀时》里写道@hj@永远不要狠命地把门在身后“砰”地关上，因为你很可能还要回来@hj@最不好玩的游戏是—轮到你上场时，却改变了规则。人生往往如此@hj@闷骚的正解是什么？--面向大海 春暖花开么@hj@绝大多数人，绝大多数时候，人都只能靠自己。 没什么背景，没遇到什么贵人，也没读什么好学校。这些都不碍事。关键是，你决心要走那条路，想成为什么样的人，准备怎样对自己的懒惰下黑手。向前走，相信梦想并坚持。只有这样，你才有机会自我证明，找到你想要的尊严@hj@" +
				  "我们真的热爱我们的生活，我们便愿意飞到更高的资方看我们自己，因为这样也许会更加接近我们想要的。但每个人想要的都不一样，也许每个人想要的都只是一种纯粹的气氛而已。就像去看你的画，去听我的歌，如此随行而简单。@hj@如果被阳光照耀得都快瞎了，那么要这种光明干什么呢？").split("@hj@");
		
		text89 = ("要想尽一切办法@hj@无论多么艰难的现在，终究是回忆和过去 。@hj@从你身上发现和引导你最美好一面的那个人，才是你最好的朋友@hj@人生没有什么会永远不会失去的，可是有的人不相信，所以他们会不停的寻找，找一辈子。”（《悟空传》）").split("@hj@");
		
	}
	
	public List<Map<String, Object>> getImageObj(int page)
	{
		if(page*SIZE_OF_PAGE <= url.length)
		{
			List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
			for (int i = page*SIZE_OF_PAGE -SIZE_OF_PAGE; i < page * SIZE_OF_PAGE; i++) 
			{
				map = new HashMap<String, Object>();
				map.put("text", text[i]);
				map.put("url", url[i]);
				listItems.add(map);
			}
			return listItems;
		}else{
			return null;
		}
		
	}
	
	public List<Map<String, Object>> getImageObj2(int position)
	{
		List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
		String[] url = getImageObjUrl(position);
		String[] text = getImageObjText(position);
		Log.e("url:" + url.length + "\text:" + text.length);
		for (int i = 0; i < url.length; i++) 
		{
			map = new HashMap<String, Object>();
			map.put("text", text[i]);
			map.put("url", url[i]);
			listItems.add(map);
		}
		return listItems;
	}
	
	public String[] getImageObjUrl(int position)
	{
		switch(position){
		case 0:return url80;case 1:return url81;case 2:return url82;case 3:return url83;case 4:return url84;
		case 5:return url85;case 6:return url86;case 7:return url87;case 8:return url88;case 9:return url89;
		case 10:return url70;case 11:return url71;case 12:return url72;case 13:return url73;case 14:return url74;
		case 15:return url75;case 16:return url76;case 17:return url77;case 18:return url78;case 19:return url79;
		case 20:return url60;case 21:return url61;case 22:return url62;case 23:return url63;case 24:return url64;
		case 25:return url65;case 26:return url66;case 27:return url67;case 28:return url68;case 29:return url69;
		case 30:return url50;case 31:return url51;case 32:return url52;case 33:return url53;case 34:return url54;
		case 35:return url55;case 36:return url56;case 37:return url57;case 38:return url58;case 39:return url59;
		case 40:return url40;case 41:return url41;case 42:return url42;case 43:return url43;case 44:return url44;
		case 45:return url45;case 46:return url46;case 47:return url47;case 48:return url48;case 49:return url49;
		case 50:return url30;case 51:return url31;case 52:return url32;case 53:return url33;case 54:return url34;
		case 55:return url35;case 56:return url36;case 57:return url37;case 58:return url38;case 59:return url39;
		case 60:return url20;case 61:return url21;case 62:return url22;case 63:return url23;case 64:return url24;
		case 65:return url25;case 66:return url26;case 67:return url27;case 68:return url28;case 69:return url29;
		case 70:return url10;case 71:return url11;case 72:return url12;case 73:return url13;case 74:return url14;
		case 75:return url15;case 76:return url16;case 77:return url17;case 78:return url18;case 79:return url19;
		case 80:return url0;case 81:return url1;case 82:return url2;case 83:return url3;case 84:return url4;
		case 85:return url5;case 86:return url6;case 87:return url7;case 88:return url8;case 89:return url9;
		default:return url80;
		}
	}
	
	public String[] getImageObjText(int position)
	{
		switch(position){
		case 0:return text80;case 1:return text81;case 2:return text82;case 3:return text83;case 4:return text84;
		case 5:return text85;case 6:return text86;case 7:return text87;case 8:return text88;case 9:return text89;
		case 10:return text70;case 11:return text71;case 12:return text72;case 13:return text73;case 14:return text74;
		case 15:return text75;case 16:return text76;case 17:return text77;case 18:return text78;case 19:return text79;
		case 20:return text60;case 21:return text61;case 22:return text62;case 23:return text63;case 24:return text64;
		case 25:return text65;case 26:return text66;case 27:return text67;case 28:return text68;case 29:return text69;
		case 30:return text50;case 31:return text51;case 32:return text52;case 33:return text53;case 34:return text54;
		case 35:return text55;case 36:return text56;case 37:return text57;case 38:return text58;case 39:return text59;
		case 40:return text40;case 41:return text41;case 42:return text42;case 43:return text43;case 44:return text44;
		case 45:return text45;case 46:return text46;case 47:return text47;case 48:return text48;case 49:return text49;
		case 50:return text30;case 51:return text31;case 52:return text32;case 53:return text33;case 54:return text34;
		case 55:return text35;case 56:return text36;case 57:return text37;case 58:return text38;case 59:return text39;
		case 60:return text20;case 61:return text21;case 62:return text22;case 63:return text23;case 64:return text24;
		case 65:return text25;case 66:return text26;case 67:return text27;case 68:return text28;case 69:return text29;
		case 70:return text10;case 71:return text11;case 72:return text12;case 73:return text13;case 74:return text14;
		case 75:return text15;case 76:return text16;case 77:return text17;case 78:return text18;case 79:return text19;
		case 80:return text0;case 81:return text1;case 82:return text2;case 83:return text3;case 84:return text4;
		case 85:return text5;case 86:return text6;case 87:return text7;case 88:return text8;case 89:return text9;
		default:return text80;
		}
	}
	
	public void save(){
		for (int i = 0; i < url89.length; i++) {
			final ContentBean bean = new ContentBean();
			bean.setImageId(90);
			bean.setContentId(i+1);
			bean.setContentUrl(url89[i]);
			bean.setContentText(text89[i]);
			bean.save(new SaveListener<String>() {

				@Override
				public void done(String o, BmobException e) {
					L.e("添加数据成功，返回objectId为：" + bean.getObjectId());
				}
			});
		}
	}
	
}
