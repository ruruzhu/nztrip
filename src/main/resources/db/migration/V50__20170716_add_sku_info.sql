ALTER TABLE `sku` ADD COLUMN official_website VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN confirmation_time VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN reschedule_cancel_notice VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN agenda_info VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN activity_time VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN opening_time VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN ticket_info VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN service_include VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN service_exclude VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN extra_item VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN attention VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN price_constraint VARCHAR(200) default "";
ALTER TABLE `sku` ADD COLUMN other_info VARCHAR(200) default "";