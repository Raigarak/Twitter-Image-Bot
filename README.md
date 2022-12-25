# Twitter Image Bot

[Youtube Demo](https://www.youtube.com/watch?v=5rU3ZeE_pHk)

The bot download images from any subreddits and from wallhaven's rest api end points defined in the `config.json` file. After, it'll upload it to your twitter account and the image file will be deleted.

**Setup** 

Request your own api key from Twitter developer portal.
Replace the `ConsumerKey`, `ConsumerSecret`, `Access Token`, and `AccessTokenSecret` with your own in the `TwitterImageHanlder.java` class.

**How to change search parameters**

To change the subreddit, thread minimum upvotes, or wallhaven rest api endpoints. Add the links to the `Config.json` file.

**How to change duration per tweet**

To change the duration between each check. Go into the `TwitterBot.java` file and inside the while loop. Change `TimeUnit.MINUTES.sleep(30);`

Days - `TimeUnit.DAYS.sleep();`

Hours - `TimeUnit.HOURS.sleep();`

Minutes - `TimeUnit.MINUTES.sleep();`

Seconds - `TimeUnit.SECONDS.sleep();`

For more information, please check the java docs [TimeUnit docs](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/TimeUnit.html)

**After configuration**

After initalizing everything above, all you have to do is compile the program and run it. It will run forever until you close the program manually. 
