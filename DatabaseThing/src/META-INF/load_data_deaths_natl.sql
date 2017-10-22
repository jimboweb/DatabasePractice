load data infile '/var/lib/mysql-files/nyclcod.csv' 
into table nyc
fields terminated by ','
lines terminated by '\r'
ignore 1 lines
(@vyear,
@vleading_cause,
@vsex,
@vrace_ethnicity,
@vdeaths,
@vdeath_rate,
@vage_adjusted)
set 
year = nullif(@vyear, ''),
leading_cause = nullif(@vleading_cause, ''),
sex = nullif(@vsex, ''),
race_ethnicity = nullif(@vrace_ethnicity, ''),
deaths = nullif(@vdeaths, '.'),
death_rate = nullif(@vdeath_rate, '.'),
age_adjusted = nullif(@vage_adjusted, '.');
