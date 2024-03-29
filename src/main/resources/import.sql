
INSERT INTO genero (nome) VALUES ('Acao');
INSERT INTO genero (nome) VALUES ('Animacao');
INSERT INTO genero (nome) VALUES ('Aventura');
INSERT INTO genero (nome) VALUES ('Cinema de arte');
INSERT INTO genero (nome) VALUES ('Chanchada');
INSERT INTO genero (nome) VALUES ('Cinema catastrofe');
INSERT INTO genero (nome) VALUES ('Comedia');
INSERT INTO genero (nome) VALUES ('Comedia romantica');
INSERT INTO genero (nome) VALUES ('Comedia dramatica');
INSERT INTO genero (nome) VALUES ('Comedia de acao');
INSERT INTO genero (nome) VALUES ('Cult');
INSERT INTO genero (nome) VALUES ('Danca');
INSERT INTO genero (nome) VALUES ('Documentario');
INSERT INTO genero (nome) VALUES ('Docuficcao');
INSERT INTO genero (nome) VALUES ('Drama');
INSERT INTO genero (nome) VALUES ('Espionagem');
INSERT INTO genero (nome) VALUES ('Ficcao cientifica');
INSERT INTO genero (nome) VALUES ('Musical');
INSERT INTO genero (nome) VALUES ('Policial');
INSERT INTO genero (nome) VALUES ('Romance');
INSERT INTO genero (nome) VALUES ('Suspense');
INSERT INTO genero (nome) VALUES ('Terror');

INSERT INTO produtora (nome) VALUES ('AMC');
INSERT INTO produtora (nome) VALUES ('HBO');
INSERT INTO produtora (nome) VALUES ('CBS');
INSERT INTO produtora (nome) VALUES ('BBC');
INSERT INTO produtora (nome) VALUES ('Sony');
INSERT INTO produtora (nome) VALUES ('Fox');
INSERT INTO produtora (nome) VALUES ('Disney');
INSERT INTO produtora (nome) VALUES ('NBC Universal');
INSERT INTO produtora (nome) VALUES ('Warner Bros');
INSERT INTO produtora (nome) VALUES ('ABC');
INSERT INTO produtora (nome) VALUES ('Netflix');
INSERT INTO produtora (nome) VALUES ('Amazon');
INSERT INTO produtora (nome) VALUES ('FX Productions');
INSERT INTO produtora (nome) VALUES ('Paramount');

INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Game of Trones', 'Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.','2011-04-17', null, 95.00, 3, 2, '1.jpg');
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Winter Is Coming', 'Jon Arryn, the Hand of the King, is dead. King Robert Baratheon plans to ask his oldest friend, Eddard Stark, to take Jon`s place. Across the sea, Viserys Targaryen plans to wed his sister to a nomadic warlord in exchange for an army.','2011-04-17', 1, 1, 90.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Kingsroad', 'While Bran recovers from his fall, Ned takes only his daughters to King`s Landing. Jon Snow goes with his uncle Benjen to the Wall. Tyrion joins them.','2011-04-24', 2, 1, 88.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Lord Snow', 'Lord Stark and his daughters arrive at King`s Landing to discover the intrigues of the king`s realm.','2011-05-01', 3, 1, 87.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Cripples, Bastards, and Broken Things', 'Eddard investigates Jon Arryn`s murder. Jon befriends Samwell Tarly, a coward who has come to join the Night`s Watch.','2011-05-08', 4, 1, 88.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Wolf and the Lion', 'Catelyn has captured Tyrion and plans to bring him to her sister, Lysa Arryn, at the Vale, to be tried for his, supposed, crimes against Bran. Robert plans to have Daenerys killed, but Eddard refuses to be a part of it and quits.','2011-05-15', 5, 1, 91.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('A Golden Crown', 'While recovering from his battle with Jaime, Eddard is forced to run the kingdom while Robert goes hunting. Tyrion demands a trial by combat for his freedom. Viserys is losing his patience with Drogo.','2011-05-22', 6, 1, 92.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('You Win or You Die', 'Robert has been injured while hunting and is dying. Jon and the others finally take their vows to the Night`s Watch. A man, sent by Robert, is captured for trying to poison Daenerys. Furious, Drogo vows to attack the Seven Kingdoms.','2011-05-29', 7, 1, 93.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Pointy End', 'Eddard and his men are betrayed and captured by the Lannisters. When word reaches Robb, he plans to go to war to rescue them. The White Walkers attack the Wall. Tyrion returns to his father with some new friends.','2011-06-05', 8, 1, 91.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Baelor', 'Robb goes to war against the Lannisters. Jon finds himself struggling on deciding if his place is with Robb or the Night`s Watch. Drogo has fallen ill from a fresh battle wound. Daenerys is desperate to save him.','2011-06-12', 9, 1, 96.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Fire and Blood', 'With Ned dead, Robb vows to get revenge on the Lannisters. Jon must officially decide if his place is with Robb or the Night`s Watch. Daenerys says her final goodbye to Drogo.','2011-06-19', 10, 1, 95.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The North Remembers', 'Tyrion arrives at King`s Landing to take his father`s place as Hand of the King. Stannis Baratheon plans to take the Iron Throne for his own. Robb tries to decide his next move in the war. The Night`s Watch arrive at the house of Craster.','2012-04-01', 1, 2, 89.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Night Lands', 'Arya makes friends with Gendry. Tyrion tries to take control of the Small Council. Theon arrives at his home, Pyke, in order to persuade his father into helping Robb with the war. Jon tries to investigate Craster`s secret.','2012-04-08', 2, 2, 86.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('What Is Dead May Never Die', 'Tyrion tries to see who he can trust in the Small Council. Catelyn visits Renly to try and persuade him to join Robb in the war. Theon must decide if his loyalties lie with his own family or with Robb.','2012-04-15', 3, 2, 89.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Garden of Bones', 'Lord Baelish arrives at Renly`s camp just before he faces off against Stannis. Daenerys and her company are welcomed into the city of Qarth. Arya, Gendry, and Hot Pie find themselves imprisoned at Harrenhal.','2012-04-22', 4, 2, 89.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Ghost of Harrenhal', 'Tyrion investigates a secret weapon that King Joffrey plans to use against Stannis. Meanwhile, as a token for saving his life, Jaqen H`ghar offers to kill three people that Arya chooses.','2012-05-29', 5, 2, 89.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Old Gods and the New', 'Theon seizes control of Winterfell. Jon captures a wildling, named Ygritte. The people of King`s Landing begin to turn against King Joffrey. Daenerys looks to buy ships to sail for the Seven Kingdoms.','2012-05-06', 6, 2, 91.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('A Man Without Honor', 'Bran and Rickon have escaped Winterfell. Theon tries to hunt them down. Daenerys` dragons have been stolen. Jon travels through the wilderness with Ygritte as his prisoner. Sansa has bled and is now ready to have Joffrey`s children.','2012-05-13', 7, 2, 90.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('The Prince of Winterfell', 'Stannis is just days from King`s Landing. Tyrion prepares for his arrival. Jon and Qhorin are taken prisoner by the wildlings. Catelyn is arrested for releasing Jaime. Arya, Gendry, and Hot Pie plan to escape from Harrenhal.','2012-05-20', 8, 2, 89.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Blackwater', 'Stannis Baratheon`s fleet and army arrive at King`s Landing and the battle for the city begins. Cersei plans for her and her children`s future.','2012-05-27', 9, 2, 97.00, 1);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Valar Morghulis', 'Joffrey puts Sansa aside for Margaery Tyrell. Robb marries Talisa Maegyr. Jon prepares to meet Mance Rayder. Arya says farewell to Jaqen H`ghar. Daenerys tries to rescue her dragons.','2012-06-03', 10, 2, 94.00, 1);

INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Breaking Bad', 'A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family`s future.','2008-01-20', '2013-09-29', 95.00, 15, 1, '2.jpg');
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Pilot', 'Diagnosed with terminal lung cancer, chemistry teacher Walter White teams up with his former student, Jesse Pinkman, to cook and sell crystal meth.','2008-01-20', 1, 1, 89.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Cat`s in the Bag...', 'After their first drug deal goes terribly wrong, Walt and Jesse are forced to deal with a corpse and a prisoner. Meanwhile, Skyler grows suspicious of Walt`s activities.','2008-01-27', 2, 1, 87.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('...And the Bag`s in the River', 'As Jesse struggles to sell the meth him and Walt made, the chemistry teacher faces his own dilemmas, such as hiding his cancer from his wife and deciding what to do with Jesse`s prisoner Krazy Eight.','2008-02-10', 3, 1, 87.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Cancer Man', 'Walt tells the rest of his family about his cancer. Jesse tries to make amends with his own parents.','2008-02-17', 4, 1, 82.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Gray Matter', 'Walt rejects everyone who tries to help him with the cancer. Jesse tries his best to create Walt`s meth, with the help of an old friend.','2008-02-24', 5, 1, 83.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Crazy Handful of Nothin`', 'With the side effects and cost of his treatment mounting, Walt demands that Jesse finds a wholesaler to buy their drugs, which lands him in trouble.','2008-03-02', 6, 1, 92.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('A No-Rough-Stuff-Type Deal', 'Walt and Jesse try to up their game by making more of the crystal every week for Tuco. Unfortunately, some of the ingredients they need are not easy to find. Meanwhile, Skyler realizes that her sister is a shoplifter.','2008-03-09', 7, 1, 88.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Seven Thirty-Seven', 'Walt and Jesse realize how dire their situation is. They must come up with a plan to kill Tuco before Tuco kills them first.','2009-03-09', 1, 2, 87.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Grilled', 'Walt`s disappearance is met with investigation by both his wife and Hank, as Tuco Salamanca intends to leave town with his kidnapped cooks.','2009-03-15', 2, 2, 92.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Bit by a Dead Bee', 'Walt and Jesse try to come up with alibis for their disappearances.','2009-03-22', 3, 2, 84.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Down', 'Skyler keeps mysteriously leaving without talking to Walt. Jesse`s parents throw him out of his own house.','2009-03-29', 4, 2, 82.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Breakage', 'Walt and Jesse decide to start their own little empire with the help of Jesse`s friends: Skinny Pete, Combo, and Badger. Meanwhile, Hank tries to pull himself together after his encounter with Tuco.','2009-04-05', 5, 2, 93.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Peekaboo', 'After Skinny Pete gets ripped off, Walt makes Jesse go get the money. Meanwhile, Walt`s cover story on how Elliott and Gretchen are paying for his medical treatment is on the verge of collapsing.','2009-04-12', 6, 2, 88.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Negro Y Azul', 'Rumor is spreading that Jesse killed the man that ripped Skinny Pete off. Walt uses this to his advantage on expanding their territory. Meanwhile, Hank has been promoted to the El Paso office. But it`s not all he hoped it would be.','2009-04-19', 7, 2, 87.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Better Call Saul', 'Badger is caught by the DEA. Walt and Jesse hire the best criminal lawyer in town, Saul Goodman.','2009-04-26', 8, 2, 90.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('4 Days Out', 'Walt and Jesse become stranded out in the middle of the desert after cooking more crystal.','2009-05-03', 9, 2, 89.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Over', 'Walt`s cancer has greatly improved. Time to celebrate. Meanwhile Jesse tries to meet his new girlfriend`s father.','2009-05-10', 10, 2, 86.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Mandala', 'Walt and Jesse`s little empire begins to crumble. Saul tries to set them up with a mysterious distributor.','2009-05-17', 11, 2, 88.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('Phoenix', 'Walt and Skyler have a baby girl. Now that Jesse is hooked on heroin, Walt refuses to give him his money until he gets clean. Meanwhile, as an excuse for his money, Walt decides to donate the money to himself through his son`s new website.','2009-05-24', 12, 2, 91.00, 2);
INSERT INTO episodio (nome, resumo, data_exibicao, numero, temporada, nota, serie_id) VALUES ('ABQ', 'Walt`s lies have pushed Skyler to her limit. She leaves with the kids. Meanwhile, Jesse blames himself for Jane`s death and goes into rehab.','2009-05-31', 13, 2, 91.00, 2);

INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('The Walking Dead', 'Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins, and must lead a group of survivors to stay alive.','2010-10-31', null, 84.00, 1, 1, '3.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Dexter', 'By day, mild-mannered Dexter is a blood-spatter analyst for the Miami police. But at night, he is a serial killer who only targets other murderers.','2006-10-01', '2013-09-22', 87.00, 1, 1, '4.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Lost', 'The survivors of a plane crash are forced to work together in order to survive on a seemingly deserted tropical island.','2004-09-22', '2010-05-23', 84.00, 1, 1, '5.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('The Big Bang Theory', 'A woman who moves into an apartment across the hall from two brilliant but socially awkward physicists shows them how little they know about life outside of the laboratory.','2007-09-24', null, 82.00, 1, 1, '6.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Two and a Half Men', 'A hedonistic jingle writer`s free-wheeling life comes to an abrupt halt when his brother and 10-year-old nephew move into his beach-front house.','2003-09-22', '2015-02-19', 71.00, 1, 1, '7.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('South Park', 'Follows the misadventures of four irreverent grade-schoolers in the quiet, dysfunctional town of South Park, Colorado.','1997-08-13', null, 87.00, 1, 1, '8.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('The Simpsons', 'The satiric adventures of a working-class family in the misfit city of Springfield.','1989-12-17', null, 87.00, 1, 1, '9.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Family Guy', 'In a wacky Rhode Island town, a dysfunctional family strive to cope with everyday life as they are thrown from one crazy scenario to another.','1999-01-31', null, 82.00, 1, 1, '10.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('The X Files', 'Two FBI agents, Fox Mulder the believer and Dana Scully the skeptic, investigate the strange and unexplained, while hidden forces work to impede their efforts.','1993-09-10', null, 87.00, 1, 1, '11.jpg');
INSERT INTO serie (nome, resumo, data_estreia, data_encerramento, nota, genero_id, produtora_id, imagem) VALUES ('Vikings', 'The world of the Vikings is brought to life through the journey of Ragnar Lothbrok, the first Viking to emerge from Norse legend and onto the pages of history - a man on the edge of myth.','2016-06-13', null, 86.00, 1, 1, '12.jpg');

INSERT INTO permissao (nome) values('ROLE_ADMIN');
INSERT INTO permissao (nome) values('ROLE_USER');
INSERT INTO permissao (nome) values('ROLE_VISITANTE');

INSERT INTO usuario(nome, username, password) VALUES ('Administrador', 'admin','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');
INSERT INTO usuario(nome, username, password) VALUES ('Teste', 'teste','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');

INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (1, 1);
INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (1, 2);
INSERT INTO usuario_permissoes(usuario_id, permissoes_id) VALUES (2, 2);

-- insert into genero_aud(id, rev, revtype, nome,created_by, modified_by) VALUES (23, 1,0,'teste',1,1)
