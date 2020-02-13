package com.github.chen0040.magento.models.order;

import java.math.BigDecimal;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.chen0040.magento.models.MagentoAttribute;
import com.github.chen0040.magento.models.serialization.AttributeValueDeserializer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private BigDecimal adjustment_negative;
	private BigDecimal adjustment_positive;
	private String applied_rule_ids;
	private BigDecimal base_adjustment_negative;
	private BigDecimal base_adjustment_positive;
	private String base_currency_code;
	private BigDecimal base_discount_amount;
	private BigDecimal base_discount_canceled;
	private BigDecimal base_discount_invoiced;
	private BigDecimal base_discount_refunded;
	private BigDecimal base_grand_total;
	private BigDecimal base_discount_tax_compensation_amount;
	private BigDecimal base_discount_tax_compensation_invoiced;
	private BigDecimal base_discount_tax_compensation_refunded;
	private BigDecimal base_shipping_amount;
	private BigDecimal base_shipping_canceled;
	private BigDecimal base_shipping_discount_amount;
	private BigDecimal base_shipping_discount_tax_compensation_amnt;
	private BigDecimal base_shipping_incl_tax;
	private BigDecimal base_shipping_invoiced;
	private BigDecimal base_shipping_refunded;
	private BigDecimal base_shipping_tax_amount;
	private BigDecimal base_shipping_tax_refunded;
	private BigDecimal base_subtotal;
	private BigDecimal base_subtotal_canceled;
	private BigDecimal base_subtotal_incl_tax;
	private BigDecimal base_subtotal_invoiced;
	private BigDecimal base_subtotal_refunded;
	private BigDecimal base_tax_amount;
	private BigDecimal base_tax_canceled;
	private BigDecimal base_tax_invoiced;
	private BigDecimal base_tax_refunded;
	private BigDecimal base_total_canceled;
	private BigDecimal base_total_due;
	private BigDecimal base_total_invoiced;
	private BigDecimal base_total_invoiced_cost;
	private BigDecimal base_total_offline_refunded;
	private BigDecimal base_total_online_refunded;
	private BigDecimal base_total_paid;
	private BigDecimal base_total_qty_ordered;
	private BigDecimal base_total_refunded;
	private BigDecimal base_to_global_rate;
	private BigDecimal base_to_order_rate;
	private BigDecimal billing_address_id;
	private BigDecimal can_ship_partially;
	private BigDecimal can_ship_partially_item;
	private String coupon_code;
	private String created_at;
	private String customer_dob;
	private String customer_email;
	private String customer_firstname;
	private Integer customer_gender;
	private Integer customer_group_id;
	private Integer customer_id;
	private Integer customer_is_guest;
	private String customer_lastname;
	private String customer_middlename;
	private String customer_note;
	private Integer customer_note_notify;
	private String customer_prefix;
	private String customer_suffix;
	private String customer_taxvat;
	private BigDecimal discount_amount;
	private BigDecimal discount_canceled;
	private String discount_description;
	private Integer discount_invoiced;
	private Integer discount_refunded;
	private BigDecimal edit_increment;
	private BigDecimal email_sent;
	private BigDecimal entity_id;
	private String ext_customer_id;
	private String ext_order_id;
	private BigDecimal forced_shipment_with_invoice;
	private String global_currency_code;
	private BigDecimal grand_total;
	private BigDecimal discount_tax_compensation_amount;
	private BigDecimal discount_tax_compensation_invoiced;
	private BigDecimal discount_tax_compensation_refunded;
	private String hold_before_state;
	private String hold_before_status;
	private String increment_id;
	private Integer is_virtual;
	private String order_currency_code;
	private String original_increment_id;
	private BigDecimal payment_authorization_amount;
	private Integer payment_auth_expiration;
	private String protect_code;
	private Integer quote_address_id;
	private Integer quote_id;
	private String relation_child_id;
	private String relation_child_real_id;
	private String relation_parent_id;
	private String relation_parent_real_id;
	private String remote_ip;
	private BigDecimal shipping_amount;
	private BigDecimal shipping_canceled;
	private String shipping_description;
	private BigDecimal shipping_discount_amount;
	private BigDecimal shipping_discount_tax_compensation_amount;
	private BigDecimal shipping_incl_tax;
	private BigDecimal shipping_invoiced;
	private BigDecimal shipping_refunded;
	private BigDecimal shipping_tax_amount;
	private BigDecimal shipping_tax_refunded;
	private String state;
	private String status;
	private String store_currency_code;
	private Integer store_id;
	private String store_name;
	private BigDecimal store_to_base_rate;
	private BigDecimal store_to_order_rate;
	private BigDecimal subtotal;
	private BigDecimal subtotal_canceled;
	private BigDecimal subtotal_incl_tax;
	private BigDecimal subtotal_invoiced;
	private BigDecimal subtotal_refunded;
	private BigDecimal tax_amount;
	private BigDecimal tax_canceled;
	private BigDecimal tax_invoiced;
	private BigDecimal tax_refunded;
	private BigDecimal total_canceled;
	private BigDecimal total_due;
	private BigDecimal total_invoiced;
	private BigDecimal total_item_count;
	private BigDecimal total_offline_refunded;
	private BigDecimal total_online_refunded;
	private BigDecimal total_paid;
	private BigDecimal total_qty_ordered;
	private BigDecimal total_refunded;
	private String updated_at;
	private Double weight;
	private String x_forwarded_for;
	List<OrderItem> items;
	BillingAdress billing_address;
	Payment payment;
	List<StatusHistory> status_histories;
	
	@JSONField(deserializeUsing = AttributeValueDeserializer.class)
	List<MagentoAttribute<?>> extension_attributes;
}
