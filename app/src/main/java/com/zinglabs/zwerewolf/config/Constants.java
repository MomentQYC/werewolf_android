package com.zinglabs.zwerewolf.config;

import android.media.AudioFormat;

/**
 * Created by Administrator on 2017/4/2.
 */

public class Constants {
    public static int FREQUENCY = 16000;
    public static int CHANNEL = AudioFormat.CHANNEL_IN_MONO;
    public static int ENCODING = AudioFormat.ENCODING_PCM_16BIT;

//    public  static final String app_host = "192.168.0.102";
    public static final String app_host="154.26.128.199";
    public static final int app_port = 3182;

    //游戏模式
    public static final int MODEL_12_YNLS =1;  //12人预女猎守经典版
    public static final int MODEL_12_YNLB =2;  //12人预女猎白版
    public static final int MODEL_9 =3;  //9人局
    public static final int MODEL_10 =4;  //10人局

    //角色对应关系
    public static final int ROLE_CODE_OF_WOLF = 1;  //狼
    public static final int ROLE_CODE_OF_PROPHET = 2;  //预言家
    public static final int ROLE_CODE_OF_VILLAGER = 3;  //村民
    public static final int ROLE_CODE_OF_WITCH = 4;  //女巫
    public static final int ROLE_CODE_OF_HUNTSMAN = 5;  //猎人
    public static final int ROLE_CODE_OF_GUARD = 6;  //守卫
    public static final int ROLE_CODE_OF_IDIOT = 7;  //白痴

    //搜索房间结果
    public static final int ROOM_SEARCH_SUCCESS = 0;  //搜索房间并进入
    public static final int ROOM_NOT_EXIST = -1;  //搜索房间不存在
    public static final int ROOM_ALREADY_FULL = -2; //搜索房间已满
    public static final int ROOM_NOT_ENOUGH_NUM = -3; //房间人数不够
    public static final int ROOM_NOT_ALL_READY = -4; //房间人数不够


    //    游戏过程状态码
    public static final int GAME_STATUS_OVER_WOLF = -1;
    public static final int GAME_STATUS_OVER_GOOD = 1;
    public static final int GAME_STATUS_PROCESS= 0;

    //发言时间
    public static final int TIME_GAME_SPEAK = 1000*20;

    //投票时间
    public static final int TIME_GAME_VOTE = 1000*10;

    //天黑时间
    public static final int TIME_GAME_DARK = 1000*30;

    //狼人行动时间
    public static final  int TIME_GAME_WOLF = 1000*10;

    //女巫行动时间
    public static final int TIME_GAME_WITCH = 1000*20;

    public static final int TIME_GAME_VOTE_CHIEF = 1000*10;




    public static final int STAGE_VOTE_CHIEF = 1; //竞选警长阶段
    public static final int STAGE_OTHER= 2; //警上发言时间

    /**
     * 对话框类型
     */
    public static final int TYPE_DIALOG_SPEAK = 1; //发言
    public static final int TYPE_DIALOG_WROTE = 2;  //白天
    public static final int TYPE_DIALOG_DARK = 3;  //夜晚





    //---系统发言
    public static final String TEXT_START_ALLOT = "游戏开始，本轮共有%d个狼人，%d个预言家，%d个女巫，%d个猎人，%d个村民";
    public static final String TEXT_DAY_DARK = "天黑了，请等待其他玩家操作";
    public static final String TEXT_DAY_CHIEF_VOTE = "请选择是否竞选警长";
    public static final String TEXT_WAIT_ACTION = "请等待%s操作";
    public static final String TEXT_WAIT_SPEAK = "%s号玩家正在发言";
    public static final String TEXT_DAY_SAFE = "天亮了，昨晚是平安夜";
    public static final String TEXT_DAY_DAWN = "天亮了，昨晚%s号死亡";
    public static final String TEXT_DAY_SAFE_TIMER = "昨晚是平安夜，[%d]号开始发言";
    public static final String TEXT_DAY_DAWN_TIMER = "昨晚%s号死亡，[%d]号开始发言";
    public static final String TEXT_VOTE_FOR = "%s号玩家投给%s玩家,;";
    public static final String TEXT_WHO_GIVE_UP = "%s号玩家弃票;\n;";
    public static final String TEXT_ALL_GIVE_UP = "结果：所有人弃票;\n";
    public static final String TEXT_VOTE_KILL = "结果：[%d]号玩家被投票处决";
    public static final String TEXT_OVER_RESULT = "游戏结束：%s胜利%s";//狼人、好人

    //---玩家发言
    public static final String TEXT_PLAYER_CHAT_0 = "狼人游戏是一类智力与心力较量的游戏";
    public static final String TEXT_PLAYER_CHAT_1 = "游戏主要以语音和文字两种方式进行";
    public static final String TEXT_PLAYER_CHAT_2 = "玩家可以通过这款游戏认识更多的朋友";
    public static final String TEXT_PLAYER_CHAT_3 = "快点吧我等的花都谢了";
    public static final String TEXT_PLAYER_CHAT_4 = "我知道谁是狼人";
    public static final String TEXT_PLAYER_CHAT_5 = "和你合作真是太愉快了";
    public static final String TEXT_PLAYER_CHAT_6 = "不要走,决战到天亮";
    public static final String TEXT_PLAYER_CHAT_7 = "大家好,很高兴见到各位";
    public static final String TEXT_PLAYER_CHAT_8 = "萌新一枚，这款游戏怎么玩";
    public static final String TEXT_PLAYER_CHAT_9 = "哇，我屁民，求别杀";
    public static final String TEXT_PLAYER_CHAT_10 = "这游戏有毒";
    public static final String TEXT_PLAYER_CHAT_11 = "您好，请问您是李小姐吗？";
    public static final String TEXT_PLAYER_CHAT_12 = "(*^__^*) 嘻嘻";
    public static final String TEXT_PLAYER_CHAT_13 = "我是预言家，昨晚查到狼人了";
    public static final String TEXT_PLAYER_CHAT_14 = "好人过麦";
    public static final String TEXT_PLAYER_CHAT_15 = "我只是一个平民呀，不要杀我";
    public static final String TEXT_PLAYER_CHAT_16 = "我真的是无辜的";
    public static final String TEXT_PLAYER_CHAT_17 = "女巫救我";
    public static final String TEXT_PLAYER_CHAT_18 = "我跳猎人，谁搞我试试，我削死他";
    public static final String TEXT_PLAYER_CHAT_19 = "好人弃票，我单飞";
    public static final String TEXT_PLAYER_CHAT_20 = "快点好吧，再慢吞吞得我就退了";

    public static final String[] ARR_TEXT_PLAYER_CHAT = {
            TEXT_PLAYER_CHAT_0, TEXT_PLAYER_CHAT_1, TEXT_PLAYER_CHAT_2,
            TEXT_PLAYER_CHAT_3, TEXT_PLAYER_CHAT_4, TEXT_PLAYER_CHAT_5,
            TEXT_PLAYER_CHAT_6, TEXT_PLAYER_CHAT_7, TEXT_PLAYER_CHAT_8,
            TEXT_PLAYER_CHAT_9, TEXT_PLAYER_CHAT_10, TEXT_PLAYER_CHAT_11,
            TEXT_PLAYER_CHAT_12, TEXT_PLAYER_CHAT_13, TEXT_PLAYER_CHAT_14,
            TEXT_PLAYER_CHAT_15, TEXT_PLAYER_CHAT_16, TEXT_PLAYER_CHAT_17,
            TEXT_PLAYER_CHAT_18, TEXT_PLAYER_CHAT_19, TEXT_PLAYER_CHAT_20
    };
}
