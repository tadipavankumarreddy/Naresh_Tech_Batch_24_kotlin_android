### Resources for Git
- https://git-scm.com/
- [Official Documentation](https://git-scm.com/docs)
- [Official ebook](https://git-scm.com/book/en/v2)

### Resources for GitHub
-   [GitHub Cheat Sheet](https://education.github.com/git-cheat-sheet-education.pdf)


### Resources for Markdown Syntax
- [markdown cheat sheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

### Git
- Git is a source code management and version control tool
- Developed by Linus torvalds (man behind linux kernel)

### What is the importance of Git ?
While you develop software, it is important that you have capability to roll back and forth the changes that you made to the software. To do that, you need to employ some kind of version control system in place.

### Two Major control version control systems
- Centralized version control system
  - Interent Dependency
  - No Second Option other than relying on the central server
- Distributed Version Control System
  - No Internet Dependency to carry out your work
  - Even if central server crashes, you still have local repositories to compile back your work. 
- Git is a Distributed version control system

### How to set up Git ?
- Go to [this](https://git-scm.com) and hit on download button.

### Repository
- A git Repository is a central storage location for managing and tracking changes in files and directories.
- It is crucial component of the git version control System

### Set up the user.email & user.name
- git config --global user.name "Your Name"
- git config --global user.email "yourEmail@id.com"

### Initialize a new Git Repository
- git init

### Two Steps to remember when you make a commit (Saving a version in the Repository)
1. What ever the files you want to save as a version, move them to staging area
   1. git add <filename>,<filename2>
   2. git add . 
2. Move the staging area files as a version into the Repository
   1. git commit -m "Brief message about why you made a certain commit"

### Check the current status of your Repository
- git status

### Remove the files from staging area
- git rm --cached filename

### How to check the git log ?
- git log
  - 40 character length SHA (Secure Hash Algorithm) key
  - You will also have commit message
  - Who made the commit at what time info
- git log --oneline
  - Get all commits info in one single line each
  - It has commit id and commit message
- git log --oneline --reverse

### Switch among versions
- git checkout SHAKEY
- git checkout master

#### Branching
Suppose you want to develop a module in a project without disturbing the existing code.Because you don't know how the new module is going to effect the output, it is recommended that you work on a separate branch.
Once you are confident about the changes that you did, you can merge the branch back to master.

By default, all repositories consists of a branch called master.

##### Check How many branches are there ?
- git branch

##### How do we create a new branch ?
- git branch branch_name

By creating a new branch, we are making a commit. Along with that, you also get the code existing on the current branch to the master branch.

##### Switch between branches.
- git switch branch_name

##### Merge back a branch to another branch
- Switch to the branch into which you want to merge the immediate branch.
- git switch branch
- you can merge
- git merge branch_name

Note: Merging a branch into another branch will not delete the branch.

##### Delete a branch
- git branch -d branch_name

## GitHub

Github is a popular platform among developers for s/w development

- Key Features
  - **Version Control**: Imagine you're writing a piece of code and keep making changes to it. With Github, you can track these changes and revert to older versions if needed. This  functionality is powered by `git`, a version control tool.
  - **Collaboration**: Github allows developers to work together on projects. Multiple people can work on the same codebase simultaneously, seeing each other's changes and merging them smoothly. 
  - **Code Sharing**: Github lets developers share their code publicly or privately. Public repositories are a great way to showcase your work, contribute to open-source projects and learn from other's code. 
  - **Social Networking**: github is a social network for developers. You can follow other Developers, see their projects, and contribute to discussions. This is a great way to connect with other programmers and learn new things.
  - **Additional features**: Beyond core functionalities, github offers features like project management tools, wikis for documentation, and security options. 
- In essence, github is a one-stop shop for developers to build software collaboratively. 

**Step 1**: Create an account on [github](https://github.com)  
**Step 2**: Create a Repository  
**Step 3**: Add a remote in an existing repository (Local)  
- Check the remotes available
  - git remote
- Add a remote
  - git remote add var_name url
  - git remote add pavan https://github.com/tadipavankumarreddy/githubbasics.git
- Push all the changes on the local repository to github.
  - git push pavan master
- Pull the changes
  - git pull var_name branch_name
  - git pull pavan master
