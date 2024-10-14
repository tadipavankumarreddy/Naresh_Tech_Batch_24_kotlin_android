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

