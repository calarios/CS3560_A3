/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

//IMPORTANT TO IMPORT
import javax.swing.*;
import testing.adminControlGUI.User;
import java.io.*;
import java.text.*;
import java.util.*;

/**
 *
 * @author Carlos
 */

//USER VIEW GUI CLASS
public class UserViewGUI extends javax.swing.JFrame 
{
    //IMPORTANT VARIABLES
    private final String userName;
    private final String userID;
    private final adminControlGUI adminControl;
    private final DefaultListModel<String> followingListModel = new DefaultListModel<>();
    private final DefaultListModel<String> newsFeedListModel = new DefaultListModel<>();

    //CONSTRUCTOR
    public UserViewGUI(String userName, String userID, adminControlGUI adminControl) 
    {
        this.userName = userName;
        this.userID = userID;
        this.adminControl = adminControl;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        USERNAME.setText(userName + " (ID:" + userID + ")");
        CREATIONTIMELABEL.setText(
                
                String.valueOf((adminControl.getUserById(userID)).getCreationTime())
                
                + " milliseconds"
        
        );
        
        //GET LAST UPDATED TIME
        User currentUser = adminControl.getUserById(userID);
        if (currentUser != null)
        {
            LASTUPDATEDTIME.setText(formatTime(currentUser.getLastUpdateTime()));
        } else 
        {
            LASTUPDATEDTIME.setText("N/A");
        }
        
        //CLEARS NEWS FEED LIST FOR FREE
        newsFeedListModel.clear();
        
        //LOAD FOLLOWING LIST FOR INDIVIDUAL USER
        loadFollowingList();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserIDTextField = new javax.swing.JTextField();
        FollowUserButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentFollowing = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweetMessage = new javax.swing.JTextArea();
        postTweet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        NewsFeed = new javax.swing.JList<>();
        UserViewFor_Text = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserViewFor_Text1 = new javax.swing.JLabel();
        CREATIONTIMELABEL = new javax.swing.JLabel();
        UserViewFor_Text2 = new javax.swing.JLabel();
        LASTUPDATEDTIME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDTextFieldActionPerformed(evt);
            }
        });

        FollowUserButton.setText("Follow User");
        FollowUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FollowUserButtonActionPerformed(evt);
            }
        });

        currentFollowing.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        // Set the model for currentFollowing JList
        currentFollowing.setModel(followingListModel);
        jScrollPane1.setViewportView(currentFollowing);

        tweetMessage.setColumns(20);
        tweetMessage.setRows(5);
        jScrollPane2.setViewportView(tweetMessage);

        postTweet.setText("Post Tweet");
        postTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postTweetActionPerformed(evt);
            }
        });

        NewsFeed.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(NewsFeed);

        UserViewFor_Text.setText("User View for:");

        USERNAME.setText("[USERNAME]");

        jLabel1.setText("User ID:");

        jLabel2.setText("List View (Current Following):");

        UserViewFor_Text1.setText("Creation Time:");

        CREATIONTIMELABEL.setText("[CREATIONTIME]");

        UserViewFor_Text2.setText("Last Updated Time:");

        LASTUPDATEDTIME.setText("[LASTUPDATEDTIME]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UserViewFor_Text1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CREATIONTIMELABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UserViewFor_Text)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(postTweet)))
                                .addGap(9, 9, 9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UserIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FollowUserButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserViewFor_Text2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LASTUPDATEDTIME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserViewFor_Text)
                    .addComponent(USERNAME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserViewFor_Text1)
                    .addComponent(CREATIONTIMELABEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserViewFor_Text2)
                    .addComponent(LASTUPDATEDTIME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FollowUserButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postTweet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDTextFieldActionPerformed

    private void postTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postTweetActionPerformed
        // TODO add your handling code here:
        //TWEET
        String tweet = tweetMessage.getText().trim();
        
        //SO LONG AS TWEET IS NOT EMPTY
        if (!tweet.isEmpty())
        {
            //USER ADDS THEIR POSTS AS WELL AS THE POST TO THE OTHER FEED
            User currentUser = adminControl.getUserById(userID); //USER IN GUI
            currentUser.addPost(tweet); //ADD POST TO OTHERS
            addToNewsFeed("Me: " + tweet); //ME
            tweetMessage.setText(""); //SET TEXT
        }
    }//GEN-LAST:event_postTweetActionPerformed

    private void FollowUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FollowUserButtonActionPerformed
        // TODO add your handling code here:
        
        //TO FOLLOW ANOTHER USER
        String followUserID = UserIDTextField.getText().trim();
        
        //USER ID TEXT FIELD CANNOT BE EMPTY
        if (followUserID.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "User ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //CANNOT FOLLOW SELF
        if (followUserID.equals(userID))
        {
            JOptionPane.showMessageDialog(this, "You cannot follow yourself", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //GET CURRENT USER AND USER THAT THEY WANT TO FOLLOW
        User currentUser = adminControl.getUserById(userID);
        User userToFollow = adminControl.getUserById(followUserID);
        
        //IF USER CAN'T BE FOUND
        if (userToFollow == null) 
        {
            JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //IF USER IS ALREADY FOLLOWING THE PERSON
        if (currentUser.getFollowing().contains(userToFollow))
        {
            JOptionPane.showMessageDialog(this, "Already following this user", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //FOLLOW USER AND ADD TO LIST
        currentUser.followUser(userToFollow);
        followingListModel.addElement(userToFollow.getName() + " (ID: " + userToFollow.getId() + ")");
        saveFollowingList();
    }//GEN-LAST:event_FollowUserButtonActionPerformed

    //FOLLOWING LIST LOADED FROM FILE
    private void loadFollowingList() 
    {
        //CLEAR EVERY TIME NEW COMPILE
        followingListModel.clear();
        
        //ADMIN CONTROL BY INDIVIDUAL USER
        User currentUser = adminControl.getUserById(userID);

        //CURRENT USER CAN'T HAVE NULL NAME
        if (currentUser != null) 
        {
            //LIST OF USERS THAT USER IS FOLLOWING
            for (User followedUser : currentUser.getFollowing()) 
            {
                //ADD TO THE LIST OF ALL USERS THAT USER IS FOLLOWING
                followingListModel.addElement(followedUser.getName() + " (ID: " + followedUser.getId() + ")");

                //CHECK IF USER HAS POSTS
                if (!followedUser.getPosts().isEmpty()) 
                {
                    //POSTS ARE ADDED TO NEWS FEED
                    for (String post : followedUser.getPosts()) 
                    {
                        newsFeedListModel.addElement(followedUser.getName() + ": " + post);
                    }
                }
            }
        }
        
        //NEWS FEED MODEL IS SET
        NewsFeed.setModel(newsFeedListModel);
    }

    //FOLLOWING LIST IS SAVED FOR INDIVIDUAL USER
    private void saveFollowingList() 
    {
        //BUFFERED WRITER TO TEXT FILE TO USER ID
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userID + "_following.txt")))
        {
            //WRITES ELEMENT TO MODEL LIST
            for (int i = 0; i < followingListModel.size(); i++)
            {
                writer.write(followingListModel.getElementAt(i));
                writer.newLine();
            }
        } catch (IOException e) 
        {}
    }

    //FORMAT TIME FOR THE LAST UPDATED TIME
    private String formatTime(long timeInMillis) 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date resultdate = new Date(timeInMillis);
        return sdf.format(resultdate);
    }

    //ADD POST TO NEWS FEED
    public void addToNewsFeed(String post)
    {
        newsFeedListModel.addElement(post);
        User currentUser = adminControl.getUserById(userID);
        if (currentUser != null)
        {
            LASTUPDATEDTIME.setText(formatTime(currentUser.getLastUpdateTime())); // Update last update time display
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> 
        {
            new UserViewGUI("defaultUserName", "defaultUserID", new adminControlGUI()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CREATIONTIMELABEL;
    private javax.swing.JButton FollowUserButton;
    private javax.swing.JLabel LASTUPDATEDTIME;
    private javax.swing.JList<String> NewsFeed;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JTextField UserIDTextField;
    private javax.swing.JLabel UserViewFor_Text;
    private javax.swing.JLabel UserViewFor_Text1;
    private javax.swing.JLabel UserViewFor_Text2;
    private javax.swing.JList<String> currentFollowing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton postTweet;
    private javax.swing.JTextArea tweetMessage;
    // End of variables declaration//GEN-END:variables
}
