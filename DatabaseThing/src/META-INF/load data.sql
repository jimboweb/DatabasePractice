load data infile '/var/lib/mysql-files/lcod.csv' 
into table national
fields terminated by ','
lines terminated by '\r'
ignore 1 lines
(@vyear, @vage_group, @vleading_cause, @vfatalities)
set 
year = nullif(@vyear, ''),
age_group = nullif(@vage_group, ''),
leading_cause = nullif(@vleading_cause, ''),
fatalities = nullif(@vfatalities, '');