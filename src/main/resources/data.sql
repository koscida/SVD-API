--
-- Dumping data for table `skills`
--

INSERT INTO skills VALUES (1,'Farming');
INSERT INTO skills VALUES (2,'Mining');
INSERT INTO skills VALUES (3,'Foraging');
INSERT INTO skills VALUES (4,'Fishing');
INSERT INTO skills VALUES (5,'Combat');

--
-- Dumping data for table `professions`
--

INSERT INTO professions VALUES (1,'Rancher',5,'Animal products worth 20% more.',1,null);
INSERT INTO professions VALUES (2,'Tiller',5,'Crops worth 10% more.(Bonus applies to all Vegetables and Flowers, plus any Fruit that has not been foraged) ',1,null);
INSERT INTO professions VALUES (3,'Coopmaster',10,'Befriend coop animals quicker. Incubation time (for Incubator and Ostrich Incubator) cut in half. ',1,1);
INSERT INTO professions VALUES (4,'Shepherd',10,'Befriend barn animals quicker. Sheep produce wool faster.',1,1);
INSERT INTO professions VALUES (5,'Artisan',10,'Artisan goods (wine, cheese, oil, etc.) worth 40% more. ',1,2);
INSERT INTO professions VALUES (6,'Agriculturist',10,'All crops grow 10% faster. ',1,2);
INSERT INTO professions VALUES (7,'Miner',5,' +1 ore per vein.',2,null);
INSERT INTO professions VALUES (8,'Geologist',5,'Chance for gems to appear in pairs.',2,null);
INSERT INTO professions VALUES (9,'Blacksmith',10,'Metal bars worth 50% more.',2,7);
INSERT INTO professions VALUES (10,'Excavator',10,'Chance to find geodes doubled.',2,7);
INSERT INTO professions VALUES (11,'Prospector',10,'Chance to find coal doubled.',2,8);
INSERT INTO professions VALUES (12,'Gemologist',10,'Gems worth 30% more.',2,8);
INSERT INTO professions VALUES (13,'Forester',5,'Gain 25% more wood when chopping',3,null);
INSERT INTO professions VALUES (14,'Gatherer',5,'Chance for double harvest of foraged items.',3,null);
INSERT INTO professions VALUES (15,'Lumberjack',10,'All trees have a chance to drop hardwood.',3,13);
INSERT INTO professions VALUES (16,'Tapper',10,'Syrups worth 25% more.',3,13);
INSERT INTO professions VALUES (17,'Botanist',10,'Foraged items are always highest quality.',3,14);
INSERT INTO professions VALUES (18,'Tracker',10,'Location of forageable items revealed.',3,14);
INSERT INTO professions VALUES (19,'Fisher',5,'Fish worth 25% more.',4,null);
INSERT INTO professions VALUES (20,'Trapper',5,'Resources required to craft crab pots reduced.',4,null);
INSERT INTO professions VALUES (21,'Angler',10,'Fish worth 50% more.',4,19);
INSERT INTO professions VALUES (22,'Pirate',10,'Chance to find treasure doubled.',4,19);
INSERT INTO professions VALUES (23,'Mariner',10,'Crab pots no longer produce junk items.',4,20);
INSERT INTO professions VALUES (24,'Luremaster',10,'Crab pots no longer require bait.',4,20);
INSERT INTO professions VALUES (25,'Fighter',5,' All attacks deal 10% more damage.',5,null);
INSERT INTO professions VALUES (26,'Scout',5,'Critical strike chance increased by 50%.',5,null);
INSERT INTO professions VALUES (27,'Brute',10,'Deal 15% more damage.',5,25);
INSERT INTO professions VALUES (28,'Acrobat',10,'Cooldown on special moves cut in half.',5,25);
INSERT INTO professions VALUES (29,'Defender',10,'.',5,26);
INSERT INTO professions VALUES (30,'Desperado',10,'Critical strikes are deadlier.',5,26);


--
-- Dumping data for table `skill_buffs`
--

INSERT INTO skill_buffs VALUES (1,' +1 Wild Berry harvesting');
INSERT INTO skill_buffs VALUES (2,'Casting distance increased by one tile ');
INSERT INTO skill_buffs VALUES (3,'Trees sometimes drop seeds');

--
-- Dumping data for table `villagers`
--

INSERT INTO villagers VALUES (1,'Alex',1,1,1,0);
INSERT INTO villagers VALUES (2,'Elliott',1,1,1,0);
INSERT INTO villagers VALUES (3,'Harvey',1,1,1,0);
INSERT INTO villagers VALUES (4,'Sam',1,1,1,0);
INSERT INTO villagers VALUES (5,'Sebastian',1,1,1,0);
INSERT INTO villagers VALUES (6,'Shane',1,1,1,0);
INSERT INTO villagers VALUES (7,'Abigail',1,1,0,1);
INSERT INTO villagers VALUES (8,'Emily',1,1,0,1);
INSERT INTO villagers VALUES (9,'Haley',1,1,0,1);
INSERT INTO villagers VALUES (10,'Leah',1,1,0,1);
INSERT INTO villagers VALUES (11,'Maru',1,1,0,1);
INSERT INTO villagers VALUES (12,'Penny',1,1,0,1);
INSERT INTO villagers VALUES (13,'Caroline',1,0,0,0);
INSERT INTO villagers VALUES (14,'Clint',1,0,0,0);
INSERT INTO villagers VALUES (15,'Demetrius',1,0,0,0);
INSERT INTO villagers VALUES (16,'Dwarf',1,0,0,0);
INSERT INTO villagers VALUES (17,'Evelyn',1,0,0,0);
INSERT INTO villagers VALUES (18,'George',1,0,0,0);
INSERT INTO villagers VALUES (19,'Gus',1,0,0,0);
INSERT INTO villagers VALUES (20,'Jas',1,0,0,0);
INSERT INTO villagers VALUES (21,'Jodi',1,0,0,0);
INSERT INTO villagers VALUES (22,'Kent',1,0,0,0);
INSERT INTO villagers VALUES (23,'Krobus',1,0,0,0);
INSERT INTO villagers VALUES (24,'Leo',1,0,0,0);
INSERT INTO villagers VALUES (25,'Lewis',1,0,0,0);
INSERT INTO villagers VALUES (26,'Linus',1,0,0,0);
INSERT INTO villagers VALUES (27,'Marnie',1,0,0,0);
INSERT INTO villagers VALUES (28,'Pam',1,0,0,0);
INSERT INTO villagers VALUES (29,'Pierre',1,0,0,0);
INSERT INTO villagers VALUES (30,'Robin',1,0,0,0);
INSERT INTO villagers VALUES (31,'Sandy',1,0,0,0);
INSERT INTO villagers VALUES (32,'Vincent',1,0,0,0);
INSERT INTO villagers VALUES (33,'Willy',1,0,0,0);
INSERT INTO villagers VALUES (34,'Wizard',1,0,0,0);
INSERT INTO villagers VALUES (35,'Birdie',0,0,0,0);
INSERT INTO villagers VALUES (36,'Bouncer',0,0,0,0);
INSERT INTO villagers VALUES (37,'Gil',0,0,0,0);
INSERT INTO villagers VALUES (38,'Governor',0,0,0,0);
INSERT INTO villagers VALUES (39,'Grandpa',0,0,0,0);
INSERT INTO villagers VALUES (40,'Gunther',0,0,0,0);
INSERT INTO villagers VALUES (41,'Henchman',0,0,0,0);
INSERT INTO villagers VALUES (42,'Marlon',0,0,0,0);
INSERT INTO villagers VALUES (43,'Morris',0,0,0,0);
INSERT INTO villagers VALUES (44,'Mr. Qi',0,0,0,0);
INSERT INTO villagers VALUES (45,'Professor Snail',0,0,0,0);

--
-- Dumping data for table `recipe_categories`
--

INSERT INTO recipe_categories VALUES (1,'Cooking');
INSERT INTO recipe_categories VALUES (2,'Crafting');

--
-- Dumping data for table `recipes`
--

INSERT INTO recipes VALUES (1,'Algae Soup',1);
INSERT INTO recipes VALUES (2,'Artichoke Dip',1);
INSERT INTO recipes VALUES (3,'Autumn&#39;s Bounty',1);
INSERT INTO recipes VALUES (4,'Baked Fish',1);
INSERT INTO recipes VALUES (6,'Bean Hotpot',1);
INSERT INTO recipes VALUES (7,'Blackberry Cobbler',1);
INSERT INTO recipes VALUES (8,'Blueberry Tart',1);
INSERT INTO recipes VALUES (9,'Bread',1);
INSERT INTO recipes VALUES (10,'Bruschetta',1);
INSERT INTO recipes VALUES (11,'Carp Surprise',1);
INSERT INTO recipes VALUES (12,'Cheese Cauliflower',1);
INSERT INTO recipes VALUES (13,'Chocolate Cake',1);
INSERT INTO recipes VALUES (14,'Chowder',1);
INSERT INTO recipes VALUES (15,'Coleslaw',1);
INSERT INTO recipes VALUES (16,'Complete Breakfast',1);
INSERT INTO recipes VALUES (17,'Cookie',1);
INSERT INTO recipes VALUES (18,'Crab Cakes',1);
INSERT INTO recipes VALUES (19,'Cranberry Candy',1);
INSERT INTO recipes VALUES (20,'Cranberry Sauce',1);
INSERT INTO recipes VALUES (21,'Crispy Bass',1);
INSERT INTO recipes VALUES (22,'Dish O&#39; The Sea',1);
INSERT INTO recipes VALUES (23,'Eggplant Parmesan',1);
INSERT INTO recipes VALUES (24,'Escargot',1);
INSERT INTO recipes VALUES (25,'Farmer&#39;s Lunch',1);
INSERT INTO recipes VALUES (26,'Fiddlehead Risotto',1);
INSERT INTO recipes VALUES (27,'Fish Stew',1);
INSERT INTO recipes VALUES (28,'Fish Taco',1);
INSERT INTO recipes VALUES (29,'Fried Calamari',1);
INSERT INTO recipes VALUES (30,'Fried Eel',1);
INSERT INTO recipes VALUES (31,'Fried Egg',1);
INSERT INTO recipes VALUES (32,'Fried Mushroom',1);
INSERT INTO recipes VALUES (33,'Fruit Salad',1);
INSERT INTO recipes VALUES (34,'Ginger Ale',1);
INSERT INTO recipes VALUES (35,'Glazed Yams',1);
INSERT INTO recipes VALUES (36,'Hashbrowns',1);
INSERT INTO recipes VALUES (37,'Ice Cream',1);
INSERT INTO recipes VALUES (38,'Lobster Bisque',1);
INSERT INTO recipes VALUES (39,'Lucky Lunch',1);
INSERT INTO recipes VALUES (40,'Maki Roll',1);
INSERT INTO recipes VALUES (41,'Mango Sticky Rice',1);
INSERT INTO recipes VALUES (42,'Maple Bar',1);
INSERT INTO recipes VALUES (43,'Miner&#39;s Treat',1);
INSERT INTO recipes VALUES (44,'Omelet',1);
INSERT INTO recipes VALUES (45,'Pale Broth',1);
INSERT INTO recipes VALUES (46,'Pancakes',1);
INSERT INTO recipes VALUES (47,'Parsnip Soup',1);
INSERT INTO recipes VALUES (48,'Pepper Poppers',1);
INSERT INTO recipes VALUES (49,'Pink Cake',1);
INSERT INTO recipes VALUES (50,'Pizza',1);
INSERT INTO recipes VALUES (51,'Plum Pudding',1);
INSERT INTO recipes VALUES (52,'Poi',1);
INSERT INTO recipes VALUES (53,'Poppyseed Muffin',1);
INSERT INTO recipes VALUES (54,'Pumpkin Pie',1);
INSERT INTO recipes VALUES (55,'Pumpkin Soup',1);
INSERT INTO recipes VALUES (56,'Radish Salad',1);
INSERT INTO recipes VALUES (57,'Red Plate',1);
INSERT INTO recipes VALUES (58,'Rhubarb Pie',1);
INSERT INTO recipes VALUES (59,'Rice Pudding',1);
INSERT INTO recipes VALUES (60,'Roasted Hazelnuts',1);
INSERT INTO recipes VALUES (61,'Roots Platter',1);
INSERT INTO recipes VALUES (62,'Salad',1);
INSERT INTO recipes VALUES (63,'Salmon Dinner',1);
INSERT INTO recipes VALUES (64,'Sashimi',1);
INSERT INTO recipes VALUES (65,'Seafoam Pudding',1);
INSERT INTO recipes VALUES (66,'Shrimp Cocktail',1);
INSERT INTO recipes VALUES (67,'Spaghetti',1);
INSERT INTO recipes VALUES (68,'Spicy Eel',1);
INSERT INTO recipes VALUES (69,'Squid Ink Ravioli',1);
INSERT INTO recipes VALUES (70,'Stir Fry',1);
INSERT INTO recipes VALUES (71,'Strange Bun',1);
INSERT INTO recipes VALUES (72,'Stuffing',1);
INSERT INTO recipes VALUES (73,'Super Meal',1);
INSERT INTO recipes VALUES (74,'Survival Burger',1);
INSERT INTO recipes VALUES (75,'Tom Kha Soup',1);
INSERT INTO recipes VALUES (76,'Tortilla',1);
INSERT INTO recipes VALUES (77,'Triple Shot Espresso',1);
INSERT INTO recipes VALUES (78,'Tropical Curry',1);
INSERT INTO recipes VALUES (79,'Trout Soup',1);
INSERT INTO recipes VALUES (80,'Vegetable Medley',1);


--
-- Dumping data for table `tool_categories`
--

INSERT INTO tool_categories VALUES (1,'Basic');
INSERT INTO tool_categories VALUES (2,'Fishing');
INSERT INTO tool_categories VALUES (3,'Farm');

--
-- Dumping data for table `tool_quality_types`
--

INSERT INTO tool_quality_types VALUES (1,'Regular');
INSERT INTO tool_quality_types VALUES (2,'Copper');
INSERT INTO tool_quality_types VALUES (3,'Steel');
INSERT INTO tool_quality_types VALUES (4,'Gold');
INSERT INTO tool_quality_types VALUES (5,'Iridium');
INSERT INTO tool_quality_types VALUES (6,'Training');
INSERT INTO tool_quality_types VALUES (7,'Fiberglass');
INSERT INTO tool_quality_types VALUES (8,'Large');
INSERT INTO tool_quality_types VALUES (9,'Deluxe');

--
-- Dumping data for table `tool_types`
--

INSERT INTO tool_types VALUES (1,'Hoe');
INSERT INTO tool_types VALUES (2,'Axe');
INSERT INTO tool_types VALUES (3,'Watering Can');
INSERT INTO tool_types VALUES (4,'Trash Can');
INSERT INTO tool_types VALUES (5,'Fishing Pole');
INSERT INTO tool_types VALUES (6,'Scythe');
INSERT INTO tool_types VALUES (7,'Backpack');
INSERT INTO tool_types VALUES (8,'Other');

--
-- Dumping data for table `tools`
--

INSERT INTO tools VALUES (1,'Hoe',1,1,1,'',1);
INSERT INTO tools VALUES (2,'Copper Hoe',1,1,2,'Increases maximum area of effect to 3 tiles in a straight line.',0);
INSERT INTO tools VALUES (3,'Steel Hoe',1,1,3,'Increases maximum area of effect to 5 tiles in a straight line.',0);
INSERT INTO tools VALUES (4,'Gold Hoe',1,1,4,'Increases maximum area of effect to a 3x3 area (9 corresponding tiles).',0);
INSERT INTO tools VALUES (5,'Iridium Hoe',1,1,5,'Increases maximum area of effect to a 6x3 area (18 corresponding tiles).',0);
INSERT INTO tools VALUES (6,'Pickaxe',1,1,1,'Can break small rocks anywhere.',0);
INSERT INTO tools VALUES (7,'Copper Pickaxe',1,1,2,'Can break copper nodes in 2 hits.',0);
INSERT INTO tools VALUES (8,'Steel Pickaxe',1,1,3,'Can break boulders.',0);
INSERT INTO tools VALUES (9,'Gold Pickaxe',1,1,4,'Can break a meteorite.',0);
INSERT INTO tools VALUES (10,'Iridium Pickaxe',1,1,5,'Can break rocks in the Quarry Mine and Skull Cavern in 1 hit.',0);
INSERT INTO tools VALUES (11,'Axe',1,2,1,'10 hits to chop a fully-grown tree, and 5 hits for a small stump.',1);
INSERT INTO tools VALUES (12,'Copper Axe',1,2,2,'Can chop Large Stumps. 8 hits to chop a fully-grown tree, and 4 hits for a small stump.',0);
INSERT INTO tools VALUES (13,'Steel Axe',1,2,3,'Can chop Large Logs. 6 hits to chop a fully-grown tree, and 3 hits for a small stump.3 hits for a stage 4 tree, and 2 hits for a stage 3 tree and below.',0);
INSERT INTO tools VALUES (14,'Gold Axe',1,2,4,'4 hits to chop a fully-grown tree, and 2 hits for a small stump. 2 hits for a stage 4 tree, and one hit for a stage 3 tree and below.',0);
INSERT INTO tools VALUES (15,'Iridium Axe',1,2,5,'2 hits to chop a fully-grown tree, and 1 hit for a small stump. 1 hit for a stage 4 tree and below.',0);
INSERT INTO tools VALUES (16,'Watering Can',1,3,1,'Has a total water capacity of 40 charges before it has to be refilled.',1);
INSERT INTO tools VALUES (17,'Copper Watering Can',1,3,2,'Capacity increased to 55 charges. Increases maximum area of effect to 3 tiles in a straight line.',0);
INSERT INTO tools VALUES (18,'Steel Watering Can',1,3,3,'Capacity increased to 70 charges. Increases maximum area of effect to 5 tiles in a straight line.',0);
INSERT INTO tools VALUES (19,'Gold Watering Can',1,3,4,'Capacity increased to 85 charges. Increases maximum area of effect to a 3x3 area (9 corresponding tiles).',0);
INSERT INTO tools VALUES (20,'Iridium Watering Can',1,3,5,'Capacity increased to 100 charges. Increases maximum area of effect to a 6x3 area (18 corresponding tiles).',0);
INSERT INTO tools VALUES (21,'Trash Can',1,4,1,'Used to delete items from the inventory menu.',1);
INSERT INTO tools VALUES (22,'Copper Trash Can',1,4,2,'When deleting items, reclaim 15% of their monetary value.',0);
INSERT INTO tools VALUES (23,'Steel Trash Can',1,4,3,'When deleting items, reclaim 30% of their monetary value.',0);
INSERT INTO tools VALUES (24,'Gold Trash Can',1,4,4,'When deleting items, reclaim 45% of their monetary value.',0);
INSERT INTO tools VALUES (25,'Iridium Trash Can',1,4,5,'When deleting items, reclaim 60% of their monetary value.',0);
INSERT INTO tools VALUES (26,'Training Rod',2,5,6,'Easier to use (only catches common Fish).',0);
INSERT INTO tools VALUES (27,'Bamboo Pole',2,5,1,'',1);
INSERT INTO tools VALUES (28,'Fiberglass Rod',2,5,7,'Able to use bait.',0);
INSERT INTO tools VALUES (29,'Iridium Rod',2,5,5,'Able to use bait & tackle.',0);
INSERT INTO tools VALUES (30,'Backpack (12 slots)',1,7,1,'Use to carry your inventory.',1);
INSERT INTO tools VALUES (31,'Large Pack (24 slots)',1,7,8,'Unlocks the 2nd row of inventory (12 more slots).',0);
INSERT INTO tools VALUES (32,'Deluxe Pack (36 slots)',1,7,9,'Unlocks the 3rd row of inventory (12 more slots).',0);
INSERT INTO tools VALUES (33,'Scythe',1,6,1,'It can cut grass into hay, if youve built a silo.',1);
INSERT INTO tools VALUES (34,'Golden Scythe',1,6,4,'Its more powerful than a normal scythe.',0);
INSERT INTO tools VALUES (35,'Milk Pail',3,8,1,'Gather milk from your animals.',0);
INSERT INTO tools VALUES (36,'Shears',3,8,1,'Use this to collect wool from sheep',0);
INSERT INTO tools VALUES (37,'Heater',3,8,1,'Keeps your animals warmer and happier during the winter.',0);
INSERT INTO tools VALUES (38,'Copper Pan',3,8,1,'Use to gather ore from streams.',0);
INSERT INTO tools VALUES (39,'Auto-Grabber',3,8,1,'Automatically harvests from your animals each morning. Must be placed inside a coop or barn.',0);
INSERT INTO tools VALUES (40,'Auto-Petter',3,8,1,'Joja Co. patented technology for coops and barns. Keeps your animals content, but cant replace the full benefit of human touch. Hand-petting can be provided to supplement.',0);
