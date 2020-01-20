package com.github.chen0040.magento.models.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreConfig {
	private long id;
	private String code;
	private long website_id;
	private String locale;
	private String base_currency_code;
	private String default_display_currency_code;
	private String timezone;
	private String weight_unit;
	private String base_url;
	private String base_link_url;
	private String base_static_url;
	private String base_media_url;
	private String secure_base_url;
	private String secure_base_link_url;
	private String secure_base_static_url;
	private String secure_base_media_url;
	// TODO extension_attributes
}
