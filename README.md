# TwitterImageBot

The bot download images from any subreddits and from wallhaven defined in the config.json file. After, it'll upload it to your twitter account and the image file will be deleted.

**Setup** -
Request your own api key from twitter developer portal.
Replace the ConsumerKey, ConsumerSecret, Access Token, and AccessTokenSecret with your own in the `TwitterImageHanlder.java` class.

To change the subreddit, thread upvote requirement, or wallhaven search parameters the bot downloads the images from. Add the links to the Config.json file.

To change the duration between each check (IE. the bot by defaults check the subreddit/wallhaven every 30 minutes for new images and will upload a new image to your twitter account every 30 minutes as well), Go into the `TwitterBot.java` file and inside the while loop. Change `TimeUnit.MINUTES.sleep(30);` to whatever you want.

After initalizing everything above, all you have to do is compile the program and run it. It will run forever until you close the program manually. 
