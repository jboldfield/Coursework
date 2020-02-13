/* All data was referenced from 
		basketballreference.com stats download 1.1
*/

#create schema nba_JamesJackson_JohnnieOldfield; 

#*
/*create table coaches_career (
	coachId varchar(10) not null,
    fName varchar(15),
    lName varchar(15),
    seasonWin int ,
    seasonLoss int ,
    playoffWin int ,
    playoffLoss int,
	primary key(coachId)
);*/

#*
/*create table coaches_season(
	coachId varchar(10) not null,
    coach_year int not null,
    yr_order int,
    fName varchar(15) ,
    lName varchar(15),
    seasonWin int ,
    seasonLoss int,
    playoffWin int ,
    playoffLoss int,
    team char(3) not null,
    primary key(coachId, coach_year, team)

);*/

#drop table draft
/* create table draft(
	draftYear varchar(4),
    draftRound int,
    selection int,
    team char(3) not null,
    fName varchar(20) not null,
    lName varchar(20) not null,
    ilkid varchar(20),
    draftFrom varchar (50) not null,
    leag char(5),
    primary key(team, fName, lName, draftFrom)
	
); */

#drop table player_allstar
/*create table player_allstar(
	ilkid varchar(20) not null,
    player_year int not null,
    fName varchar(15) not null,
    lName varchar(15) ,
    conference varchar(10) not null,
    leag char(1) ,
    gp varchar(10) ,
    minutes varchar(10),
    pts varchar(10),
    dreb varchar(10),
    oreb varchar(10),
    reb varchar(10),
    asts varchar(10),
    stl varchar(10),
    blk varchar(10),
    turnover varchar(10),
    pf varchar(10),
    fga varchar(10),
    fgm varchar(10),
    fta varchar(10),
    ftm varchar(10),
    tpa varchar(10),
    tpm varchar(10),
	primary key(ilkid, fName, player_year, conference)
     
);*/

/*create table player_playoffs(
	ilkid varchar(20) not null,
    player_year int not null,
    fName varchar(15) not null,
    lName varchar(15) ,
    team char(3) not null,
    leag char(1) ,
    gp varchar(10) ,
    minutes varchar(10),
    pts varchar(10),
    dreb varchar(10),
    oreb varchar(10),
    reb varchar(10),
    asts varchar(10),
    stl varchar(10),
    blk varchar(10),
    turnover varchar(10),
    pf varchar(10),
    fga varchar(10),
    fgm varchar(10),
    fta varchar(10),
    ftm varchar(10),
    tpa varchar(10),
    tpm varchar(10),
	 primary key(ilkid, fName, player_year, team, leag)
     
);*/

/* create table player_playoffs_career(
	ilkid varchar(20) not null,
    fName varchar(15) not null,
    lName varchar(15) ,
    leag char(1) ,
    gp varchar(10) ,
    minutes varchar(10),
    pts varchar(10),
    dreb varchar(10),
    oreb varchar(10),
    reb varchar(10),
    asts varchar(10),
    stl varchar(10),
    blk varchar(10),
    turnover varchar(10),
    pf varchar(10),
    fga varchar(10),
    fgm varchar(10),
    fta varchar(10),
    ftm varchar(10),
    tpa varchar(10),
    tpm varchar(10),
	 primary key(ilkid, fName, leag)
     
); */

#######################################################################
#*
/* create table player_regular_season(
	ilkid varchar(20) not null,
    player_year int,
    fName varchar(15) not null,
    lName varchar(15) not null,
    team varchar(3) not null,
    leag char(1) not null,
    gp int not null,
    minutes int,
    pts int,
    dreb int,
    oreb int,
    reb int,
    asts int,
    stl int,
    blk int,
    turnover varchar(5),
    pf int,
    fga int,
    fgm int,
    fta int,
    ftm int,
    tpa int,
    tpm int,
	primary key(ilkid, fName, lName, team, leag, player_year)
); */

#*
/* create table player_regular_season_career(
	ilkid varchar(20) not null,
    fName varchar(15) not null,
    lName varchar(15) not null,
    leag char(1) not null,
    gp int,
    minutes int,
    pts int,
    dreb int,
    oreb int,
    reb int,
    asts int,
    stl int,
    blk int,
    turnover int,
    pf int,
    fga int,
    fgm int,
    fta int,
    ftm int,
    tpa int,
    tpm int,
	primary key(ilkid, fName, lName, leag)
); */

#*
/* create table players(
	ilkid varchar(20) not null,
    fName varchar(15),
    lName varchar(15),
    playerPosition char(1),
	firstSeason int,
    lastSeason int,
    h_feet char(5),
    h_inches varchar(5),
    weight varchar(5),
    college varchar(20),
    birthdate varchar(20),
	primary key(ilkid)
); */

#*
/* create table team_season (
	team varchar(3),
    team_year int,
    leag char(1),
    o_fgm int,
    o_fga int,
    o_ftm int,
    o_fta int,
    o_oreb int,
    o_dreb int,
    o_reb int,
    o_asts int,
    o_pf int,
    o_stl int,
    o_to int,
    o_blk int,
    o_3pm int,
    o_3pa int,
    o_pts int,
    d_fgm int,
    d_fga int,
    d_ftm int,
    d_fta int,
    d_oreb int,
    d_dreb int,
    d_reb int,
    d_asts int,
    d_pf int,
    d_stl int,
    d_to int,
    d_blk int,
    d_3pm int,
    d_pa int,
    d_pts int,
    pace int,
    won int,
    lost int,
    primary key(team, team_year, leag)
); */

#*
/* create table teams (
	team varchar(3) not null,
    location varchar(15) not null,
    team_name varchar(15),
    leag char(1) NOT NULL,
    primary key(team, location, leag)
); */



 