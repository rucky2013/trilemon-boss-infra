package com.trilemon.boss.infra.base;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author kevin
 */
public interface BaseConstants {
    List<String> TRADE_FIELDS = ImmutableList.of("tid", "num", "num_iid", "status", "title", "type", "price",
            "seller_cod_fee", "discount_fee", "point_fee", "has_post_fee", "total_fee", "is_lgtype", "is_brand_sale",
            "is_force_wlb", "created", "pay_time", "modified", "end_time", "buyer_message", "alipay_id", "alipay_no",
            "buyer_memo", "buyer_flag", "seller_memo", "seller_flag", "invoice_name", "buyer_nick", "buyer_area",
            "buyer_email", "has_yfx", "yfx_fee", "yfx_id", "yfx_type", "credit_card_fee", "step_trade_status",
            "step_paid_fee", "mark_desc", "eticket_ext", "send_time", "shipping_type", "buyer_cod_fee", "express_agency_fee",
            "adjust_fee", "buyer_obtain_point_fee", "cod_fee", "trade_from", "cod_status", "can_rate", "commission_fee",
            "trade_memo", "buyer_rate", "trade_source", "seller_can_rate", "is_part_consign", "seller_nick", "pic_path", "payment",
            "snapshot_url", "seller_rate", "real_point_fee", "post_fee", "buyer_alipay_no", "receiver_name",
            "receiver_state", "receiver_city", "receiver_district", "receiver_address", "receiver_zip", "receiver_mobile",
            "receiver_phone", "consign_time", "seller_alipay_no", "seller_mobile", "seller_phone", "seller_name",
            "seller_email", "available_confirm_fee", "received_payment",
            "timeout_action_time", "is_3D", "promotion", "service_orders", "orders", "promotion_details");
    List<String> TRADE_TYPES = ImmutableList.of("fixed", "auction", "guarantee_trade", "step",
            "independent_simple_trade", "independent_shop_trade", "auto_delivery", "ec", "cod", "game_equipment",
            "shopex_trade", "netcn_trade", "external_trade", "instant_trade", "b2c_cod", "hotel_trade", "super_market_trade",
            "super_market_cod_trade", "taohua", "waimai", "nopaid", "step", "eticket");
    List<String> REFUND_FIELDS = ImmutableList.of("shipping_type", "cs_status", "advance_status", "split_taobao_fee",
            "split_seller_fee", "refund_id", "tid", "oid", "alipay_no", "total_fee", "buyer_nick", "seller_nick", "created", "modified",
            "order_status", "status", "good_status", "has_good_return", "refund_fee", "payment", "reason", "desc", "title",
            "price", "num", "good_return_time", "company_name", "sid", "address", "refund_remind_timeout", "num_iid");
    //rate field
    List<String> RATE_FIELDS = ImmutableList.of("num_iid", "valid_score", "tid", "oid", "role", "nick", "result", "created",
            "rated_nick", "item_title", "item_price", "content", "reply");
    List<String> RATE_TYPES = ImmutableList.of("good", "neutral", "bad");
    List<String> SELLER_FIELDS = ImmutableList.of("user_id", "nick", "sex", "seller_credit", "type", "has_more_pic", "item_img_num",
            "item_img_size", "prop_img_num", "prop_img_size", "auto_repost", "promoted_type", "status", "alipay_bind",
            "consumer_protection", "avatar", "liangpin", "sign_food_seller_promise", "has_shop",
            "is_lightning_consignment", "has_sub_stock", "is_golden_seller", "vip_info", "magazine_subscribe", "vertical_market", "online_gaming");
    List<String> SHOP_FIELDS = ImmutableList.of("sid", "cid", "nick", "title", "desc", "bulletin",
            "created", "modified", "shop_score");
    //黑名单类型
    byte BLACKLIST_TYPE_RATE = 1;
    //黑名单状态
    byte BLACKLIST_STATUS_ENABLE = 0;
    byte BLACKLIST_STATUS_DISABLE = 1;
    //用户状态
    byte APP_USER_STATUS_NORMAL = 0;
    byte APP_USER_STATUS_EXPIRED = 1;
}
