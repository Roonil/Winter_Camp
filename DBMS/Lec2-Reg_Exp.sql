use DSA;


-- INSERT INTO Employee values(1,"Anand","110 N B","21","43000");

select * from Employee;
INSERT INTO Employee values(2,'Deepak','SGNR', 68000, DATE('2000-11-11'),1345678901);
INSERT INTO Employee values(3,'Dipa','Delhi', 48000, DATE('2000-10-10'),1345678901);

select distinct name from Employee where not REGEXP_LIKE(name, '^[aeiou$]','i');
select distinct name from DSA.Employee where not name REGEXP'^[aeiou]' and not name REGEXP'[aeiou]$';