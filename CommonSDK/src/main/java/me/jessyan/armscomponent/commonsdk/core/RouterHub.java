/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.jessyan.armscomponent.commonsdk.core;

/**
 * ================================================
 * RouterHub 用来定义路由器的路由地址, 以组件名作为前缀, 对每个组件的路由地址进行分组, 可以统一查看和管理所有分组的路由地址
 * 路由地址的命名规则为 组件名 + 页面名, 如订单组件的订单详情页的路由地址可以命名为 "/order/OrderDetailActivity"
 * <p>
 * ARouter 将路由地址中第一个 '/' 后面的字符称为 Group, 比如上面的示例路由地址中 order 就是 Group, 以 order 开头的地址都被分配该 Group 下
 * 切记不同的组件中不能出现名称一样的 Group, 否则会发生该 Group 下的部分路由地址找不到的情况!!!
 * 所以每个组件使用自己的组件名作为 Group 是比较好的选择, 毕竟组件不会重名
 *
 * @see <a href="https://github.com/JessYanCoding/ArmsComponent/wiki#3.4">RouterHub wiki 官方文档</a>
 * Created by JessYan on 30/03/2018 18:07
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface RouterHub {
    /**
     * 组名
     */
    String APP = "/app";//宿主 App 组件
    String DOWNLOAD = "/download";//下载
    String PLAYER = "/player";//播放


    /**
     * 服务组件, 用于给每个组件暴露特有的服务
     */
    String SERVICE = "/service";


    /**
     * 宿主 App 分组
     */
    String APP_SPLASHACTIVITY = APP + "/SplashActivity";
    String APP_MAINACTIVITY = APP + "/MainActivity";

    //播放
    String PLAYER_ING = PLAYER + "/PlayingActivity";
}
