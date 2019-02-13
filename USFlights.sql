SELECT count(*) 
FROM usflights.flights;

SELECT origin,
 avg (arrdelay), avg (DepDelay) 
 from usflights.flights
 group by origin;
 
SELECT origin, year, Month ,avg (ArrDelay), 
CASE
WHEN avg (ArrDelay) >1 then "RETARD" 
WHEN avg (ArrDelay) <1 then "ON TIME" 
end
AS Estado
FROM usflights.flights group by year, month;
 
SELECT usflights.airports.city, usflights.flights.year, usflights.flights.Month ,avg (ArrDelay), 
CASE
WHEN avg (ArrDelay) >1 then "RETARD" 
WHEN avg (ArrDelay) <1 then "ON TIME" 
end
AS Estado
FROM usflights.flights 
Left join  usflights.airports
ON origin=iata
 group by usflights.flights.origin, usflights.flights.month;

select count(usflights.flights.Cancelled) AS  Cancelled,  usflights.carriers.Description
FROM flights , carriers 
WHERE
usflights.carriers.Code= usflights.flights.UniqueCarrier
AND Cancelled>0 
group by usflights.carriers.Description 
order by Cancelled desc;

SELECT sum(Distance), TailNum 
FROM usflights.flights
wHERE TailNUm!='NA'
Group by Tailnum
order by   sum(distance) desc
limit 10;

select  usflights.carriers.Description AS  Compañia, avg (ArrDelay) AS Promedio
FROM flights , carriers 
WHERE
usflights.carriers.Code= usflights.flights.UniqueCarrier
group by Description
having (Promedio)>=10
order by promedio desc
