# demos

- This is our pain. Get ready to System.out.println("GIT GUD");

# Ok you all got sassy about me not updating this so here are some git tips I GUESS.

### PUSHING TO GIT
- Enter the local repo with changes to push (find it in file explorer -> right click -> git bash here)
- ***git add .*** Will add all local changes to be saved (committed)
- ***git commit -m"message goes here"*** Will save the added changes to be pushed. Make sure to a message describing what you changed
- ***git push*** Pushes your changes!

### PULLING FROM GIT
- Enter the local repo that you intend to pull changes into
- ***git pull*** should be all you need if you've cloned the repo already

### CLONING A GIT REPO
- Navigate to the repo in github, and click on the green ***CODE*** button. Copy the link.
- In git bash, navigate to where you'd like the repo to populate, and run ***git clone PASTE_CLONE_LINK_HERE***


### misc tips
- ABP - ALWAYS BE PUSHING. Save your work often. I cannot stress this enough. You don't want it to be the night before a project deadline and your computer dies without saving your work. If you have not pushed your code to github and lose your local work, I can not help you. I've had to have this difficult talk with many exhasperated associates. Please don't be one of them.
- Need to pull my demos but your local changes are preventing it? ***git reset --hard*** is a semi dangerous command that will reset your local changes, back to the latest successful pull. This will allow you to pull my chages. ONLY do this if you don't care about changes you've made.
- If you want my changes WHILE RETAINING your changes, you can run ***git stash, git pull, git pop***. This will store your changes, bring mine in, and then put your changes back. Beware of merge conflicts here though, two different things may be competing for the same space.
- ***git status*** is a nice helpful command to run if you want to see what's been added but not saved, or saved but not pushed. 

- I'll add more here when we start working on group projects and running into things like merge conflicts and branches.
