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