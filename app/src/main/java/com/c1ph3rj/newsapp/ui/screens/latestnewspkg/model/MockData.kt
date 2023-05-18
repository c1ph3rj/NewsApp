package com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model

import com.google.gson.Gson

object MockData {
    private val api_response : String  = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 35,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"al-jazeera-english\",\n" +
            "                \"name\": \"Al Jazeera English\"\n" +
            "            },\n" +
            "            \"author\": \"Al Jazeera\",\n" +
            "            \"title\": \"Ukraine repels ‘exceptional’ Russia missile, drone attack on Kyiv - Al Jazeera English\",\n" +
            "            \"description\": \"At least 10 explosions heard by witnesses in Kyiv as officials say a Russian air attack was under way.\",\n" +
            "            \"url\": \"https://www.aljazeera.com/news/2023/5/16/air-raid-alerts-sound-across-ukraine-kyiv-repels-missile-attack\",\n" +
            "            \"urlToImage\": \"https://www.aljazeera.com/wp-content/uploads/2023/05/2023-05-16T033943Z_1779924905_RC2DZ0A8Q3KE_RTRMADP_3_UKRAINE-CRISIS-ATTACK-KYIV-1-1684209205.jpg?resize=1920%2C1440\",\n" +
            "            \"publishedAt\": \"2023-05-16T03:24:01Z\",\n" +
            "            \"content\": \"Ukraines capital Kyiv has come under a Russian aerial attack involving drones, cruise and ballistic missiles in what one Ukrainian military official described as an exceptional onslaught involving th… [+2669 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"YouTube\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"DeSantis curtails diversity, equity & inclusion programs at state colleges - CBS Miami\",\n" +
            "            \"description\": \"Gov. Ron DeSantis on Monday signed a measure aimed at prohibiting colleges and universities from spending money on \\\"DEI\\\" programs.\",\n" +
            "            \"url\": \"https://www.youtube.com/watch?v=fhs2arIBeVo\",\n" +
            "            \"urlToImage\": \"https://i.ytimg.com/vi/fhs2arIBeVo/maxresdefault.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-16T03:16:10Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"the-washington-post\",\n" +
            "                \"name\": \"The Washington Post\"\n" +
            "            },\n" +
            "            \"author\": \"Holly Bailey\",\n" +
            "            \"title\": \"Georgia prosecutor fights Trump effort to remove her from election probe - The Washington Post\",\n" +
            "            \"description\": \"Fulton County District Attorney Fani T. Willis (D) wrote in a court filing Monday that the former president is trying to block an investigation before “any charges are filed.”\",\n" +
            "            \"url\": \"https://www.washingtonpost.com/nation/2023/05/15/fulton-county-trump-special-grand-jury/\",\n" +
            "            \"urlToImage\": \"https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/JAYXL7BZWQI63OFPBICOLXB5WY_size-normalized.jpg&w=1440\",\n" +
            "            \"publishedAt\": \"2023-05-16T02:10:00Z\",\n" +
            "            \"content\": \"Comment on this story\\r\\nComment\\r\\nAn Atlanta-area prosecutor investigating whether Donald Trump and his allies broke the law when they sought to overturn Trumps 2020 election loss in Georgia asked a ju… [+10774 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"YouTube\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Stars' Roope Hintz Steals Puck Off Kraken's Jamie Oleksiak Before Sniping Top Corner - SPORTSNET\",\n" +
            "            \"description\": \"Watch as Dallas Stars forward Roope Hintz steals the puck off Seattle Kraken defenceman Jamie Oleksiak at the blue line before moving in and sniping the top ...\",\n" +
            "            \"url\": \"https://www.youtube.com/watch?v=KxiHkmYlDCE\",\n" +
            "            \"urlToImage\": \"https://i.ytimg.com/vi/KxiHkmYlDCE/maxresdefault.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-16T01:44:12Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"abc-news\",\n" +
            "                \"name\": \"ABC News\"\n" +
            "            },\n" +
            "            \"author\": \"NICK PERRY Associated Press\",\n" +
            "            \"title\": \"Fire at New Zealand hostel kills at least 6 people, prime minister says - ABC News\",\n" +
            "            \"description\": \"A fire ripped through a hostel in New Zealand’s capital overnight, killing at least six people and forcing others to flee in their pajamas in what a fire chief called his “worst nightmare.”\",\n" +
            "            \"url\": \"https://abcnews.go.com/International/wireStory/multiple-people-die-fire-story-new-zealand-hostel-99340436\",\n" +
            "            \"urlToImage\": \"https://s.abcnews.com/images/International/wirestory_82f469ccc734774960ae4fcac94d7f80_16x9_992.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-16T01:41:15Z\",\n" +
            "            \"content\": \"WELLINGTON, New Zealand -- A fire ripped through a hostel in New Zealands capital overnight, killing at least six people and forcing others to flee the four-story building in their pajamas in what a … [+3892 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"Zachary Cohen,Devan Cole,Tierney Sneed,Evan Perez,Hannah Rabinowitz,Jeremy Herb,Marshall Cohen\",\n" +
            "            \"title\": \"Special counsel John Durham concludes FBI never should have launched full Trump-Russia probe - CNN\",\n" +
            "            \"description\": \"Special counsel John Durham concluded that the FBI should never have launched a full investigation into connections between Donald Trump’s campaign and Russia during the 2016 election, according to a report compiled over three years by the Trump-administratio…\",\n" +
            "            \"url\": \"https://www.cnn.com/2023/05/15/politics/john-durham-report-fbi-trump-released/index.html\",\n" +
            "            \"urlToImage\": \"https://media.cnn.com/api/v1/images/stellar/prod/230515124810-03-special-counsel-john-durham-file.jpg?c=16x9&q=w_800,c_fill\",\n" +
            "            \"publishedAt\": \"2023-05-16T01:08:00Z\",\n" +
            "            \"content\": \"Special counsel John Durham concluded that the FBI should never have launched a full investigation into connections between Donald Trumps campaign and Russia during the 2016 election, according to a … [+13958 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"YouTube\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Ja Morant faces a 'significant suspension' after second firearm incident - Woj #shorts - ESPN\",\n" +
            "            \"description\": \"Adrian Wojnarowski gives the latest on Ja Morant after another video emerged with the Memphis Grizzlies All-Star brandishing a weapon.✔️ Subscribe to ESPN+ h...\",\n" +
            "            \"url\": \"https://www.youtube.com/watch?v=JvuBeynRUKM\",\n" +
            "            \"urlToImage\": \"https://i.ytimg.com/vi/JvuBeynRUKM/maxres2.jpg?sqp=-oaymwEoCIAKENAF8quKqQMcGADwAQH4Ac4FgAKACooCDAgAEAEYZSBhKFEwDw==&rs=AOn4CLBeYBROzZFhZC7NT1ONNGdwtU6whg\",\n" +
            "            \"publishedAt\": \"2023-05-16T00:45:06Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"the-hill\",\n" +
            "                \"name\": \"The Hill\"\n" +
            "            },\n" +
            "            \"author\": \"Julia Mueller\",\n" +
            "            \"title\": \"At least 4 dead in New Mexico mass shooting: police - The Hill\",\n" +
            "            \"description\": \"At least four people are dead, including the suspect, in a mass shooting in New Mexico, according to local police. Officers arrived on Monday to a “chaotic scene” in which a shooter was “actively firing” upon individuals in a neighborhood, police said at a pr…\",\n" +
            "            \"url\": \"https://thehill.com/homenews/state-watch/4005635-at-least-4-dead-in-new-mexico-mass-shooting-police/\",\n" +
            "            \"urlToImage\": \"https://thehill.com/wp-content/uploads/sites/2/2023/05/GettyImages-1422110945-e1683035886858.jpg?w=1280\",\n" +
            "            \"publishedAt\": \"2023-05-16T00:37:00Z\",\n" +
            "            \"content\": \"Skip to content\\r\\nAt least four people are dead, including the suspect, in a mass shooting in New Mexico, according to local police. \\r\\nOfficers arrived on Monday to a “chaotic scene” in which a shoote… [+2118 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"the-hill\",\n" +
            "                \"name\": \"The Hill\"\n" +
            "            },\n" +
            "            \"author\": \"Julia Mueller\",\n" +
            "            \"title\": \"Federal prosecutors move to drop all charges against Andrew Gillum - The Hill\",\n" +
            "            \"description\": \"Federal prosecutors asked a judge Monday to dismiss all remaining corruption charges against former Tallahasee Mayor Andrew Gillum, the 2018 Democratic nominee for Florida governor. Jurors earlier this month acquitted Gillum of lying to the FBI but could not …\",\n" +
            "            \"url\": \"https://thehill.com/homenews/state-watch/4005624-federal-prosecutors-move-to-drop-all-charges-against-andrew-gillum-former-democratic-florida-governor-nominee/\",\n" +
            "            \"urlToImage\": \"https://thehill.com/wp-content/uploads/sites/2/2023/05/gillumandrew_2019_GettyImages-e1683299616362.jpg?w=1280\",\n" +
            "            \"publishedAt\": \"2023-05-16T00:08:00Z\",\n" +
            "            \"content\": \"Skip to content\\r\\nFederal prosecutors asked a judge Monday to dismiss all remaining corruption charges against former Tallahasee Mayor Andrew Gillum, the 2018 Democratic nominee for Florida governor.\\r… [+1267 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Post\"\n" +
            "            },\n" +
            "            \"author\": \"Peter Botte\",\n" +
            "            \"title\": \"Mavericks' misfortune could still make Knicks a winner at NBA draft lottery - New York Post \",\n" +
            "            \"description\": \"The Mavericks did their best to attempt to keep their protected first-round pick away from the Knicks by tanking near the end of the regular season.\",\n" +
            "            \"url\": \"https://nypost.com/2023/05/15/mavericks-can-still-make-knicks-2023-nba-draft-lottery-winner/\",\n" +
            "            \"urlToImage\": \"https://nypost.com/wp-content/uploads/sites/2/2023/05/newspress-collage-27061312-1684193281577.jpg?quality=75&strip=all&1684179030&w=1024\",\n" +
            "            \"publishedAt\": \"2023-05-15T23:43:00Z\",\n" +
            "            \"content\": \"The Mavericks did their best to attempt to keep their protected first-round pick away from the Knicks by tanking near the end of the regular season.\\r\\nThe Knicks officially will find out Tuesday night… [+2779 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Elon Musk documents subpoenaed in Jeffrey Epstein lawsuit by U.S. Virgin Islands - Reuters\",\n" +
            "            \"description\": \"The U.S. Virgin Islands has subpoenaed Tesla Inc <a href=\\\"https://www.reuters.com/companies/TSLA.O\\\" target=\\\"_blank\\\">(TSLA.O)</a> CEO Elon Musk for documents in its lawsuit accusing JPMorgan Chase & Co <a href=\\\"https://www.reuters.com/companies/JPM.N\\\" target=\\\"…\",\n" +
            "            \"url\": \"https://www.reuters.com/legal/us-virgin-islands-subpoenaed-elon-musk-jeffrey-epstein-litigation-2023-05-15/\",\n" +
            "            \"urlToImage\": \"https://www.reuters.com/resizer/oVZPJzhVZip_GCYgC00hchjM7tQ=/1200x628/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/ZQLLDYLXJBIZVMUE2TH2WQB6RI.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-15T23:37:00Z\",\n" +
            "            \"content\": \"WILMINGTON, Delaware, May 15 (Reuters) - The U.S. Virgin Islands has subpoenaed Tesla Inc (TSLA.O) CEO Elon Musk for documents in its lawsuit accusing JPMorgan Chase &amp; Co (JPM.N) of helping enabl… [+2968 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Daily Beast\"\n" +
            "            },\n" +
            "            \"author\": \"Erik Uebelacker\",\n" +
            "            \"title\": \"Jamie Foxx Moved to Chicago Rehab Facility After Mystery Medical Scare - The Daily Beast\",\n" +
            "            \"description\": \"A source told TMZ that Foxx is “recovering well.”\",\n" +
            "            \"url\": \"https://www.thedailybeast.com/jamie-foxx-in-chicago-physical-rehab-facility-after-mystery-medical-scare\",\n" +
            "            \"urlToImage\": \"https://img.thedailybeast.com/image/upload/c_crop,d_placeholder_euli9k,h_1809,w_3216,x_0,y_77/dpr_2.0/c_limit,w_740/fl_lossy,q_auto/v1684189577/2006-05-19T120000Z_1183406172_PBEAHUNNKAT_RTRMADP_3_FOXX_iz7qhu\",\n" +
            "            \"publishedAt\": \"2023-05-15T23:33:48Z\",\n" +
            "            \"content\": \"Jamie Foxxs family was spotted in Chicago visiting the actor as he recovers from a still-unknown medical issue that left him hospitalized last month. According to TMZ, Foxx is receiving medical treat… [+431 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"Brenda Goodman\",\n" +
            "            \"title\": \"Man who defied genetics for decades may hold a clue to preventing Alzheimer’s, scientists say - CNN\",\n" +
            "            \"description\": \"Researchers working to unlock the secrets of Alzheimer’s disease say they’ve been given a major clue that could help protect people at risk for this type of dementia.\",\n" +
            "            \"url\": \"https://www.cnn.com/2023/05/15/health/alzheimers-gene-reelin-protected/index.html\",\n" +
            "            \"urlToImage\": \"https://media.cnn.com/api/v1/images/stellar/prod/191030162356-encuentro-cerebro.jpg?c=16x9&q=w_800,c_fill\",\n" +
            "            \"publishedAt\": \"2023-05-15T23:28:00Z\",\n" +
            "            \"content\": \"Researchers working to unlock the secrets of Alzheimers disease say theyve been given a major clue that could help protect people at risk for this type of dementia.\\r\\nA man who seemed fated to develop… [+4396 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"POLITICO.eu\"\n" +
            "            },\n" +
            "            \"author\": \"Cristina Gallardo, Clea Caulcutt\",\n" +
            "            \"title\": \"Zelenskyy blitzes Europe with fighter jet diplomacy - POLITICO Europe\",\n" +
            "            \"description\": \"Ukrainian president pushes for ‘coalition of jets’ ahead of G7 summit in Japan.\",\n" +
            "            \"url\": \"https://www.politico.eu/article/volodymyr-zelenskyy-tours-europe-fighter-jets-ukraine-war/\",\n" +
            "            \"urlToImage\": \"https://www.politico.eu/cdn-cgi/image/width=1200,height=630,fit=crop,quality=80,onerror=redirect/wp-content/uploads/2023/05/15/GettyImages-1255024704-scaled.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-15T22:19:00Z\",\n" +
            "            \"content\": \"LONDON Ukraine has no permanent seat at the G7 leaders summit. But Ukrainian President Volodymyr Zelenskyy has already made sure his talking points will dominate discussions at the G7s annual get-to… [+4638 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Space.com\"\n" +
            "            },\n" +
            "            \"author\": \"Mike Wall\",\n" +
            "            \"title\": \"SpaceX Ax-2 private astronaut mission is 'go' for May 21 launch - Space.com\",\n" +
            "            \"description\": \"Ax-2 will send four people to the International Space Station for an eight-day stay.\",\n" +
            "            \"url\": \"https://www.space.com/spacex-ax-2-astronaut-mission-go-for-launch\",\n" +
            "            \"urlToImage\": \"https://cdn.mos.cms.futurecdn.net/yP2L9YARXevMu2WCd8tjwL-1200-80.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-15T22:14:40Z\",\n" +
            "            \"content\": \"The second-ever private astronaut mission to the International Space Station (ISS) remains on track to lift off this weekend.\\r\\nNASA, SpaceX and Houston company Axiom Space held a flight readiness rev… [+3189 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"bloomberg\",\n" +
            "                \"name\": \"Bloomberg\"\n" +
            "            },\n" +
            "            \"author\": \"Max Reyes, Jeanny Yu\",\n" +
            "            \"title\": \"Buffett Exits TSMC While Hedge Funds Coatue, Tiger Global Buy - Bloomberg\",\n" +
            "            \"description\": \"Taiwan Semiconductor Manufacturing Co. drew a mixed verdict from top investors in the first quarter, as Warren Buffett closed out his position while hedge funds Tiger Global Management and Coatue Management added new bets.\",\n" +
            "            \"url\": \"https://www.bloomberg.com/news/articles/2023-05-15/buffett-s-berkshire-offloads-last-of-tsmc-stake-in-abrupt-exit\",\n" +
            "            \"urlToImage\": \"https://assets.bwbx.io/images/users/iqjWHBFdfxIU/imzCShq0TYJI/v1/1200x800.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-15T22:05:02Z\",\n" +
            "            \"content\": \"Taiwan Semiconductor Manufacturing Co. drew a mixed verdict from top investors in the first quarter, as Warren Buffett closed out his position while hedge funds Tiger Global Management and Coatue Man… [+392 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"VOA News\"\n" +
            "            },\n" +
            "            \"author\": \"VOA Learning English\",\n" +
            "            \"title\": \"Scientists Release New Accounting of Human Genome - VOA Learning English\",\n" +
            "            \"description\": \"Scientists recently released a new accounting of the human genome. The research effort included information from people from around the world and could help ongoing efforts to identify genetic causes of diseases.\",\n" +
            "            \"url\": \"https://learningenglish.voanews.com/a/scientists-release-new-accounting-of-human-genome/7093833.html\",\n" +
            "            \"urlToImage\": \"https://gdb.voanews.com/eaeab002-1e4c-418b-8724-ec14983fe6f3_w1200_r1.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-15T22:01:31Z\",\n" +
            "            \"content\": \"Scientists recently released a new accounting of the human genome. The research effort included information from people from around the world and could help ongoing efforts to identify genetic causes… [+3665 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"YouTube\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Vice and Motherboard owner files for bankruptcy - BBC News - BBC News\",\n" +
            "            \"description\": \"The company behind the websites Vice and Motherboard has filed for bankruptcy in the US and is set to be sold to a group of its lenders.Vice Media Group - wh...\",\n" +
            "            \"url\": \"https://www.youtube.com/watch?v=JMa4QjrY_90\",\n" +
            "            \"urlToImage\": \"https://i.ytimg.com/vi/JMa4QjrY_90/maxresdefault.jpg\",\n" +
            "            \"publishedAt\": \"2023-05-15T22:00:13Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Slate Magazine\"\n" +
            "            },\n" +
            "            \"author\": \"Sam Adams\",\n" +
            "            \"title\": \"Succession Season 4 Episode 8: How plausible is this election nightmare? - Slate\",\n" +
            "            \"description\": \"Brian Stelter, the former CNN anchor and the author of two books about Fox News, breaks it down.\",\n" +
            "            \"url\": \"https://slate.com/culture/2023/05/succession-season-4-episode-8-election-fox-news.html\",\n" +
            "            \"urlToImage\": \"https://compote.slate.com/images/3cb7e40d-eda7-49ba-b5d4-7e59c1d2cd3a.jpeg?crop=1560%2C1040%2Cx0%2Cy0&width=1560\",\n" +
            "            \"publishedAt\": \"2023-05-15T21:29:00Z\",\n" +
            "            \"content\": \"Successions election-night episode brought millions of viewers closer to the election of 2016 than anyone wants to go. The series has treated the Fox News stand-in ATN mostly as an off-screen abstrac… [+9792 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"Jen Christensen\",\n" +
            "            \"title\": \"Face masks are still a good idea at the doctor’s office, study says - CNN\",\n" +
            "            \"description\": \"Signs urging everyone to mask up have largely disappeared from places like grocery stores and schools in the third year of the Covid-19 pandemic. But they remain in many medical offices, and a study published Monday says they might still be a good idea.\",\n" +
            "            \"url\": \"https://www.cnn.com/2023/05/15/health/masks-medical-office/index.html\",\n" +
            "            \"urlToImage\": \"https://media.cnn.com/api/v1/images/stellar/prod/230515145547-masks-medical-office-stock.jpg?c=16x9&q=w_800,c_fill\",\n" +
            "            \"publishedAt\": \"2023-05-15T21:01:00Z\",\n" +
            "            \"content\": \"Signs urging everyone to mask up have largely disappeared from places like grocery stores and schools in the third year of the Covid-19 pandemic. But they remain in many medical offices, and a study … [+4392 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}"

    var LatestNewsData: LatestNewsModel = Gson().fromJson(api_response, LatestNewsModel::class.java)

    fun getNewsByPos(newsPos: Int) = LatestNewsData.articles[newsPos]
}