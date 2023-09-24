
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


--
-- SQLINES DEMO *** or table `professions`
--

DROP TABLE IF EXISTS professions;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE professions (
  profession_id bigint NOT NULL,
  name varchar(15) NOT NULL,
  level int NOT NULL,
  description varchar(255) NOT NULL,
  skill_id bigint NOT NULL,
  profession_path_id bigint DEFAULT NULL,
  PRIMARY KEY (profession_id)
,
  CONSTRAINT fk_professions_skill FOREIGN KEY (profession_path_id) REFERENCES professions (profession_id),
  CONSTRAINT sk_profession_skill FOREIGN KEY (skill_id) REFERENCES skills (skill_id)
) ;

CREATE INDEX fk_professions_skill_idx ON professions (profession_path_id);
CREATE INDEX sk_profession_skill_idx ON professions (skill_id);
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


--
-- Table structure for table `skill_buffs`
--

DROP TABLE IF EXISTS skill_buffs;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE skill_buffs (
  skill_buff_id bigint NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (skill_buff_id)
);
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- SQLINES DEMO *** or table `villagers`
--

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


--
-- SQLINES DEMO *** or table `recipe_categories`
--

DROP TABLE IF EXISTS recipe_categories;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE recipe_categories (
  recipe_category_id bigint NOT NULL,
  name varchar(10) NOT NULL,
  PRIMARY KEY (recipe_category_id)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


--
-- SQLINES DEMO *** or table `recipes`
--

DROP TABLE IF EXISTS recipes;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE recipes (
  recipe_id bigint NOT NULL,
  name varchar(20) NOT NULL,
  recipe_category_id bigint NOT NULL,
  PRIMARY KEY (recipe_id)
,
  CONSTRAINT fk_recipes_recipe_categories FOREIGN KEY (recipe_category_id) REFERENCES recipe_categories (recipe_category_id)
) ;

CREATE INDEX fk_recipes_recipe_categories_idx ON recipes (recipe_category_id);
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


--
-- SQLINES DEMO *** or table `tool_categories`
--

DROP TABLE IF EXISTS tool_categories;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE tool_categories (
  tool_category_id bigint NOT NULL,
  name varchar(10) NOT NULL,
  PRIMARY KEY (tool_category_id)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


--
-- SQLINES DEMO *** or table `tool_quality_types`
--

DROP TABLE IF EXISTS tool_quality_types;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE tool_quality_types (
  tool_quality_type_id bigint NOT NULL,
  name varchar(10) NOT NULL,
  PRIMARY KEY (tool_quality_type_id)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


--
-- SQLINES DEMO *** or table `tool_types`
--

DROP TABLE IF EXISTS tool_types;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE tool_types (
  tool_type_id bigint NOT NULL,
  name varchar(20) NOT NULL,
  PRIMARY KEY (tool_type_id)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;


--
-- SQLINES DEMO *** or table `tools`
--

DROP TABLE IF EXISTS tools;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE tools (
  tool_id bigint NOT NULL,
  name varchar(50) NOT NULL,
  tool_category_id bigint NOT NULL,
  tool_type_id bigint NOT NULL,
  tool_quality_type_id bigint NOT NULL,
  description varchar(255) DEFAULT NULL,
  is_starter smallint NOT NULL DEFAULT '0',
  PRIMARY KEY (tool_id)
,
  CONSTRAINT tool_types_tool_category_id FOREIGN KEY (tool_category_id) REFERENCES tool_categories (tool_category_id),
  CONSTRAINT tool_types_tool_quality_type_id FOREIGN KEY (tool_quality_type_id) REFERENCES tool_quality_types (tool_quality_type_id),
  CONSTRAINT tool_types_tool_type_id FOREIGN KEY (tool_type_id) REFERENCES tool_types (tool_type_id)
);

CREATE INDEX tool_types_tool_category_id_idx ON tools (tool_category_id);
CREATE INDEX tool_types_tool_type_id_idx ON tools (tool_type_id);
CREATE INDEX tool_types_tool_quality_type_id_idx ON tools (tool_quality_type_id);