package io.github.jixiaoyong.i18n

/**
 * @author : jixiaoyong
 * @description ：APP 用到的所有字符抽象类
 *
 * @email : jixiaoyong1995@gmail.com
 * @date : 30/3/2024
 */
data class Strings(
    val loading: String,
    val alreadyRunning: String,
    val exit: String,
    val retry: String,
    val signConfig: String,
    val signApp: String,
    val settingsConfig: String,
    val confirm:String,
    val change:String,
    val noContent:String,
    val currentSignInfo:String,
    val changeSignInfo:String,
    val deleteSignInfoTips:String,
    val nickName:String,
    val nickNameDescription:String,
    val filePath:String,
    val plzSelectSignFile:String,
    val chooseFile:String,
    val absolutePathOfSignFile:String,
    val saveNewSignInfo:String,
    val saveNewSignInfoTips:String,
    val cleanUp:String,
    val resetSuccess:String,
    val confirmReset:String,
    val confirmResetTips:String,
    val signToolsConfigResetTips:String,
    val signType:String,
    val signedApkOutputDir:String,
    val chooseBuildTools:String,
    val chooseBuildToolsTips:String,
    val apksignerDirectory:String,
    val chooseApksignerTips:String,
    val plzChooseApksigner:String,
    val notInit:String,
    val changeSuccess:String,
    val zipDirectory:String,
    val chooseZipTips:String,
    val plzChooseZip:String,
    val autoMatchSignature:String,
    val autoMatchSignatureTips: String,
    val aaptDirectory:String,
    val chooseAaptDirectory:String,
    val aaptDirectoryTips: String,
    val reset:String,
    val appIntro:(version:String,webSite:String)->String,
)