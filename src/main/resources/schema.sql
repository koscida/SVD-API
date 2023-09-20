
--
-- SQLINES DEMO *** or table `skills`
--

DROP TABLE IF EXISTS skills;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE skills (
  skill_id bigint NOT NULL,
  name varchar(10) DEFAULT NULL,
  PRIMARY KEY (skill_id)
)  ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS villagers;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE villagers (
  villager_id bigint NOT NULL,
  name varchar(20) NOT NULL,
  is_giftable smallint NOT NULL DEFAULT '0',
  is_marriage_candidate smallint NOT NULL DEFAULT '0',
  is_bachelor smallint NOT NULL DEFAULT '0',
  is_bachelorette smallint NOT NULL DEFAULT '0',
  PRIMARY KEY (villager_id)
) ;
