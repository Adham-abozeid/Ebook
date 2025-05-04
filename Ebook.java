import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Ebook extends Frame implements ActionListener {
    // start frame
    Frame start = new Frame();
    // button
    Button book = new Button("Book");
    Button Publisher = new Button("Publisher");
    Button Author = new Button("Author");
    // label
    Label start_label = new Label("E-Book Store");
    // exit button
    Button s_exit = new Button("Exit");

    ////////////////////////////////////////////////////////////////////////////

    // book frame
    Frame f1 = new Frame();
    // button
    Button b_insert = new Button("Insert");
    Button b_update = new Button("Updata");
    Button b_search = new Button("search");
    Button b_delete = new Button("Delete");
    Button b_menu = new Button("Main Menu");
    // label
    Label ISBN = new Label("ISBN");
    Label Title = new Label("Title");
    Label Type = new Label("Type");
    Label PageCount = new Label("Page Count");
    Label Price = new Label("Price");
    Label Publisher_Code = new Label("Publisher Code");
    Label lsearch = new Label("ISBN");
    Label Author_ID = new Label("Author ID");
    Label book_Title = new Label("Book");
    // txt field
    TextField txtISBN = new TextField();
    TextField txtTitle = new TextField();
    TextField txtType = new TextField();
    TextField txtPageCount = new TextField();
    TextField txtPrice = new TextField();
    TextField txtPublisher_Code = new TextField();
    TextField txtAuthor_ID = new TextField();
    TextField txtsearch = new TextField();
    // exit button
    Button b_exit = new Button("Exit");

    ////////////////////////////////////////////////////////////////////////////

    // Publisher frame
    Frame f2 = new Frame();
    // button
    Button P_insert = new Button("Insert");
    Button P_update = new Button("Updata");
    Button P_search = new Button("search");
    Button P_delete = new Button("Delete");
    Button P_menu = new Button("Main Menu");
    // label
    Label PublisherCode = new Label("Publisher Code");
    Label Name = new Label("Name");
    Label City = new Label("City");
    Label Phone = new Label("Phone");
    Label Publisher_Title = new Label("Publisher");
    Label lP_search = new Label("Publisher code");
    // txt field
    TextField txtPublisherCode = new TextField();
    TextField txtName = new TextField();
    TextField txtCity = new TextField();
    TextField txtPhone = new TextField();
    TextField txtP_search = new TextField();
    // exit button
    Button P_exit = new Button("Exit");

    ////////////////////////////////////////////////////////////////////////////

    // Author frame
    Frame f3 = new Frame();
    // button
    Button a_insert = new Button("Insert");
    Button a_update = new Button("Updata");
    Button a_search = new Button("search");
    Button a_delete = new Button("Delete");
    Button a_menu = new Button("Main Menu");
    // label
    Label AuthorID = new Label("AuthorID");
    Label fName = new Label("First Name");
    Label sName = new Label("Second Name");
    Label la_search = new Label("AuthorID");
    Label Author_Title = new Label("Author");
    // txt field
    TextField txtAuthorID = new TextField();
    TextField txtfName = new TextField();
    TextField txtsName = new TextField();
    TextField txta_search = new TextField();
    // exit button
    Button a_exit = new Button("Exit");

    ////////////////////////////////////////////////////////////////////////////

    Ebook() {
        // start frame
        {
            start.setLayout(null);
            start.setTitle("E-book Store");
            start.setBounds(500, 200, 800, 470);
            start.setVisible(true);
            start.setBackground(new Color(10, 25, 73));
            // main Title
            start_label.setBounds(315, 50, 200, 50);
            start_label.setForeground(new Color(255, 165, 0));
            start_label.setFont(new Font("SansSerif", Font.BOLD, 24));
            start.add(start_label);
            // button
            book.setBounds(200, 250, 100, 25);
            book.setBackground(new Color(255, 165, 0));
            start.add(book);
            book.addActionListener(this);
            Publisher.setBounds(350, 250, 100, 25);
            Publisher.setBackground(new Color(255, 165, 0));
            start.add(Publisher);
            Publisher.addActionListener(this);
            Author.setBounds(500, 250, 100, 25);
            Author.setBackground(new Color(255, 165, 0));
            start.add(Author);
            Author.addActionListener(this);
            // exit
            s_exit.setBounds(650, 410, 100, 25);
            s_exit.setBackground(new Color(255, 165, 0));
            start.add(s_exit);
            s_exit.addActionListener(this);
        }

        ////////////////////////////////////////////////////////////////////////

        // book frame
        {
            f1.setLayout(null);
            f1.setTitle("E-book Store");
            f1.setBounds(500, 200, 800, 500);
            f1.setVisible(false);
            f1.setBackground(new Color(10, 25, 73));

            // main Title
            book_Title.setBounds(365, 50, 200, 50);
            book_Title.setForeground(new Color(255, 165, 0));
            book_Title.setFont(new Font("SansSerif", Font.BOLD, 24));
            f1.add(book_Title);

            // add Label
            ISBN.setBounds(50, 100, 100, 50);
            ISBN.setForeground(new Color(255, 165, 0));
            ISBN.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(ISBN);

            Title.setBounds(50, 150, 115, 50);
            Title.setForeground(new Color(255, 165, 0));
            Title.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(Title);

            Type.setBounds(50, 200, 115, 50);
            Type.setForeground(new Color(255, 165, 0));
            Type.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(Type);

            PageCount.setBounds(50, 250, 115, 50);
            PageCount.setForeground(new Color(255, 165, 0));
            PageCount.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(PageCount);

            Price.setBounds(50, 300, 115, 50);
            Price.setForeground(new Color(255, 165, 0));
            Price.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(Price);

            Publisher_Code.setBounds(50, 350, 115, 50);
            Publisher_Code.setForeground(new Color(255, 165, 0));
            Publisher_Code.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(Publisher_Code);

            Author_ID.setBounds(50, 400, 115, 50);
            Author_ID.setForeground(new Color(255, 165, 0));
            Author_ID.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(Author_ID);

            // add txt field
            txtISBN.setBounds(170, 112, 150, 25); // 112
            txtISBN.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtISBN);
            txtTitle.setBounds(170, 160, 150, 25);// 160
            txtTitle.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtTitle);
            txtType.setBounds(170, 210, 150, 25);// 210
            txtType.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtType);
            txtPageCount.setBounds(170, 260, 150, 25);// 260
            txtPageCount.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtPageCount);
            txtPrice.setBounds(170, 310, 150, 25);// 310
            txtPrice.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtPrice);
            txtPublisher_Code.setBounds(170, 360, 150, 25);// 360
            txtPublisher_Code.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtPublisher_Code);
            txtAuthor_ID.setBounds(170, 410, 150, 25);// 410
            txtAuthor_ID.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtAuthor_ID);

            // add button
            b_insert.setBounds(600, 115, 100, 25);
            b_insert.setBackground(new Color(255, 165, 0));
            f1.add(b_insert);
            b_insert.addActionListener(this);
            b_update.setBounds(600, 150, 100, 25);
            b_update.setBackground(new Color(255, 165, 0));
            f1.add(b_update);
            b_update.addActionListener(this);
            b_delete.setBounds(600, 185, 100, 25);
            b_delete.setBackground(new Color(255, 165, 0));
            f1.add(b_delete);
            b_delete.addActionListener(this);
            b_menu.setBounds(650, 410, 100, 25);
            b_menu.setBackground(new Color(255, 165, 0));
            f1.add(b_menu);
            b_menu.addActionListener(this);

            // search
            b_search.setBounds(600, 320, 100, 25);
            b_search.setBackground(new Color(255, 165, 0));
            f1.add(b_search);
            b_search.addActionListener(this);
            txtsearch.setBounds(550, 350, 200, 25);
            txtsearch.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f1.add(txtsearch);
            lsearch.setBounds(495, 340, 100, 50);
            lsearch.setForeground(new Color(255, 165, 0));
            lsearch.setFont(new Font("SansSerif", Font.BOLD, 15));
            f1.add(lsearch);

            // exit
            b_exit.setBounds(650, 450, 100, 25);
            b_exit.setBackground(new Color(255, 165, 0));
            f1.add(b_exit);
            b_exit.addActionListener(this);
        }

        ////////////////////////////////////////////////////////////////////////

        // Publisher frame
        {
            f2.setLayout(null);
            f2.setTitle("E-book Store");
            f2.setBounds(500, 200, 800, 500);
            f2.setVisible(false);
            f2.setBackground(new Color(10, 25, 73));

            // main Title
            Publisher_Title.setBounds(365, 50, 200, 50);
            Publisher_Title.setForeground(new Color(255, 165, 0));
            Publisher_Title.setFont(new Font("SansSerif", Font.BOLD, 24));
            f2.add(Publisher_Title);

            // add Label
            PublisherCode.setBounds(50, 100, 100, 50);
            PublisherCode.setForeground(new Color(255, 165, 0));
            PublisherCode.setFont(new Font("SansSerif", Font.BOLD, 13));
            f2.add(PublisherCode);

            Name.setBounds(50, 150, 115, 50);
            Name.setForeground(new Color(255, 165, 0));
            Name.setFont(new Font("SansSerif", Font.BOLD, 15));
            f2.add(Name);

            City.setBounds(50, 200, 115, 50);
            City.setForeground(new Color(255, 165, 0));
            City.setFont(new Font("SansSerif", Font.BOLD, 15));
            f2.add(City);

            Phone.setBounds(50, 250, 115, 50);
            Phone.setForeground(new Color(255, 165, 0));
            Phone.setFont(new Font("SansSerif", Font.BOLD, 15));
            f2.add(Phone);

            // add txt field
            txtPublisherCode.setBounds(170, 112, 150, 25); // 112
            txtPublisherCode.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f2.add(txtPublisherCode);
            txtName.setBounds(170, 160, 150, 25);// 160
            txtName.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f2.add(txtName);
            txtCity.setBounds(170, 210, 150, 25);// 210
            txtCity.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f2.add(txtCity);
            txtPhone.setBounds(170, 260, 150, 25);// 260
            txtPhone.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f2.add(txtPhone);

            // add button
            P_insert.setBounds(600, 115, 100, 25);
            P_insert.setBackground(new Color(255, 165, 0));
            f2.add(P_insert);
            P_insert.addActionListener(this);
            P_update.setBounds(600, 150, 100, 25);
            P_update.setBackground(new Color(255, 165, 0));
            f2.add(P_update);
            P_update.addActionListener(this);
            P_delete.setBounds(600, 185, 100, 25);
            P_delete.setBackground(new Color(255, 165, 0));
            f2.add(P_delete);
            P_delete.addActionListener(this);
            P_menu.setBounds(650, 410, 100, 25);
            P_menu.setBackground(new Color(255, 165, 0));
            f2.add(P_menu);
            P_menu.addActionListener(this);

            // search
            P_search.setBounds(600, 320, 100, 25);
            P_search.setBackground(new Color(255, 165, 0));
            f2.add(P_search);
            P_search.addActionListener(this);
            txtP_search.setBounds(550, 350, 200, 25);
            txtP_search.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f2.add(txtP_search);
            lP_search.setBounds(430, 340, 110, 50);
            lP_search.setForeground(new Color(255, 165, 0));
            lP_search.setFont(new Font("SansSerif", Font.BOLD, 15));
            f2.add(lP_search);

            // exit
            P_exit.setBounds(650, 450, 100, 25);
            P_exit.setBackground(new Color(255, 165, 0));
            f2.add(P_exit);
            P_exit.addActionListener(this);
        }

        ////////////////////////////////////////////////////////////////////////

        // Author frame
        {
            f3.setLayout(null);
            f3.setTitle("E-book Store");
            f3.setBounds(500, 200, 800, 500);
            f3.setVisible(false);
            f3.setBackground(new Color(10, 25, 73));

            // main Title
            Author_Title.setBounds(365, 50, 200, 50);
            Author_Title.setForeground(new Color(255, 165, 0));
            Author_Title.setFont(new Font("SansSerif", Font.BOLD, 24));
            f3.add(Author_Title);

            // add Label
            AuthorID.setBounds(50, 100, 100, 50);
            AuthorID.setForeground(new Color(255, 165, 0));
            AuthorID.setFont(new Font("SansSerif", Font.BOLD, 13));
            f3.add(AuthorID);

            fName.setBounds(50, 150, 115, 50);
            fName.setForeground(new Color(255, 165, 0));
            fName.setFont(new Font("SansSerif", Font.BOLD, 15));
            f3.add(fName);

            sName.setBounds(50, 200, 115, 50);
            sName.setForeground(new Color(255, 165, 0));
            sName.setFont(new Font("SansSerif", Font.BOLD, 15));
            f3.add(sName);

            // add txt field
            txtAuthorID.setBounds(170, 112, 150, 25); // 112
            txtAuthorID.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f3.add(txtAuthorID);
            txtfName.setBounds(170, 160, 150, 25);// 160
            txtfName.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f3.add(txtfName);
            txtsName.setBounds(170, 210, 150, 25);// 210
            txtsName.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f3.add(txtsName);

            // add button
            a_insert.setBounds(600, 115, 100, 25);
            a_insert.setBackground(new Color(255, 165, 0));
            f3.add(a_insert);
            a_insert.addActionListener(this);
            a_update.setBounds(600, 150, 100, 25);
            a_update.setBackground(new Color(255, 165, 0));
            f3.add(a_update);
            a_update.addActionListener(this);
            a_delete.setBounds(600, 185, 100, 25);
            a_delete.setBackground(new Color(255, 165, 0));
            f3.add(a_delete);
            a_delete.addActionListener(this);
            a_menu.setBounds(650, 410, 100, 25);
            a_menu.setBackground(new Color(255, 165, 0));
            f3.add(a_menu);
            a_menu.addActionListener(this);

            // search
            a_search.setBounds(600, 320, 100, 25);
            a_search.setBackground(new Color(255, 165, 0));
            f3.add(a_search);
            a_search.addActionListener(this);
            txta_search.setBounds(550, 350, 200, 25);
            txta_search.setFont(new Font("SansSerif", Font.PLAIN, 15));
            f3.add(txta_search);
            la_search.setBounds(470, 340, 110, 50);
            la_search.setForeground(new Color(255, 165, 0));
            la_search.setFont(new Font("SansSerif", Font.BOLD, 15));
            f3.add(la_search);

            // exit
            a_exit.setBounds(650, 450, 100, 25);
            a_exit.setBackground(new Color(255, 165, 0));
            f3.add(a_exit);
            a_exit.addActionListener(this);
        }
    }

    public static void main(String[] args) throws Exception {
        Ebook run = new Ebook();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // exit
        {
            if (e.getSource() == s_exit || e.getSource() == b_exit || e.getSource() == P_exit
                    || e.getSource() == a_exit) {
                System.exit(0);
            }
        }

        ////////////////////////////////////////////////////////////////////////

        // start frame
        {
            if (e.getSource() == book) {
                start.setVisible(false);
                f1.setVisible(true);
            }
            if (e.getSource() == Publisher) {
                start.setVisible(false);
                f2.setVisible(true);
            }
            if (e.getSource() == Author) {
                start.setVisible(false);
                f3.setVisible(true);
            }
        }

        ////////////////////////////////////////////////////////////////////////

        // book frame
        {
            // insert
            if (e.getSource() == b_insert) {
                if (!txtISBN.getText().isEmpty() && !txtTitle.getText().isEmpty() && !txtPageCount.getText().isEmpty()
                        && !txtPrice.getText().isEmpty() && !txtPublisher_Code.getText().isEmpty()
                        && !txtAuthor_ID.getText().isEmpty() && !txtType.getText().isEmpty()) {
                    String isbn = txtISBN.getText();
                    String title = txtTitle.getText();
                    String type = txtType.getText();
                    int pageCount = Integer.parseInt(txtPageCount.getText());
                    double price = Double.parseDouble(txtPrice.getText());
                    int pubCode = Integer.parseInt(txtPublisher_Code.getText());
                    int authid = Integer.parseInt(txtAuthor_ID.getText());

                    String query = "INSERT INTO Book (ISBN, Title, Type, PageCount, Price, PublisherCode, AuthorID) VALUES ('"
                            + isbn + "', '"
                            + title + "', '"
                            + type + "', "
                            + pageCount + ", "
                            + price + ", "
                            + pubCode + ", "
                            + authid + ")";

                    boolean inserted = sqlconn.executeNonquary(query);

                    if (inserted) {
                        JOptionPane.showMessageDialog(this, "Book inserted successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Insert failed. Check data or connection.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter all data!");
                }

            }

            // update
            if (e.getSource() == b_update) {
                String isbn = txtISBN.getText();
                String title = txtTitle.getText();
                String type = txtType.getText();
                int pageCount = Integer.parseInt(txtPageCount.getText());
                double price = Double.parseDouble(txtPrice.getText());
                int pubCode = Integer.parseInt(txtPublisher_Code.getText());
                int authid = Integer.parseInt(txtAuthor_ID.getText());

                String query = "UPDATE Book SET "
                        + "Title = '" + title + "', "
                        + "Type = '" + type + "', "
                        + "PageCount = " + pageCount + ", "
                        + "Price = " + price + ", "
                        + "PublisherCode = " + pubCode + ", "
                        + "AuthorID = " + authid + " "
                        + "WHERE ISBN = '" + isbn + "'";

                boolean updated = sqlconn.executeNonquary(query);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "Book updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed. Check ISBN and data.");
                }
            }

            // delete
            if (e.getSource() == b_delete) {
                String isbn = txtISBN.getText();

                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?",
                        "Confirm Delete", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String query = "DELETE FROM Book WHERE ISBN = '" + isbn + "'";
                    boolean deleted = sqlconn.executeNonquary(query);

                    if (deleted) {
                        txtISBN.setText("");
                        txtTitle.setText("");
                        txtType.setText("");
                        txtPageCount.setText("");
                        txtPrice.setText("");
                        txtPublisher_Code.setText("");
                        txtAuthor_ID.setText("");
                        JOptionPane.showMessageDialog(this, "Book deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Delete failed. Check if ISBN exists.");
                    }
                }
            }

            // search
            if (e.getSource() == b_search) {
                String isbn = txtsearch.getText();

                String query = "";

                if (!isbn.isEmpty()) {
                    query = "SELECT * FROM Book WHERE ISBN = '" + isbn + "'";
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter ISBN to search");
                    return;
                }

                try {
                    sqlconn.connectToSQL();
                    Statement stmt = sqlconn.conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        txtISBN.setText(rs.getString("ISBN"));
                        txtTitle.setText(rs.getString("Title"));
                        txtType.setText(rs.getString("Type"));
                        txtPageCount.setText(String.valueOf(rs.getInt("PageCount")));
                        txtPrice.setText(String.valueOf(rs.getDouble("Price")));
                        txtPublisher_Code.setText(String.valueOf(rs.getInt("PublisherCode")));
                        txtAuthor_ID.setText(String.valueOf(rs.getInt("AuthorID")));
                    } else {
                        txtISBN.setText("");
                        txtTitle.setText("");
                        txtType.setText("");
                        txtPageCount.setText("");
                        txtPrice.setText("");
                        txtPublisher_Code.setText("");
                        txtAuthor_ID.setText("");
                        JOptionPane.showMessageDialog(this, "No matching book found");
                    }

                    sqlconn.Close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Search failed: " + ex.getMessage());
                }
            }

            // main menu
            if (e.getSource() == b_menu) {
                f1.setVisible(false);
                start.setVisible(true);
            }
        }

        ////////////////////////////////////////////////////////////////////////

        // Publisher frame
        {
            // insert
            if (e.getSource() == P_insert) {
                if (!txtPublisherCode.getText().isEmpty() && !txtName.getText().isEmpty()
                        && !txtCity.getText().isEmpty() && !txtPhone.getText().isEmpty()) {
                    int pc = Integer.parseInt(txtPublisherCode.getText());
                    String n = txtName.getText();
                    String c = txtCity.getText();
                    String ph = txtPhone.getText();

                    String query = "INSERT INTO Publisher (PublisherCode, Name, City, Phone) VALUES ('"
                            + pc + "', '"
                            + n + "', '"
                            + c + "', "
                            + ph + ") ";

                    boolean inserted = sqlconn.executeNonquary(query);

                    if (inserted) {
                        JOptionPane.showMessageDialog(this, "data inserted successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Insert failed. Check data or connection.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter all data!");
                }

            }

            // update
            if (e.getSource() == P_update) {
                int pc = Integer.parseInt(txtPublisherCode.getText());
                String n = txtName.getText();
                String c = txtCity.getText();
                String p = txtPhone.getText();

                String query = "UPDATE Publisher SET "
                        + "PublisherCode = " + pc + ", "
                        + "Name = '" + n + "', "
                        + "City = '" + c + "', "
                        + "Phone = '" + p + "' "
                        + "WHERE PublisherCode = " + pc;

                boolean updated = sqlconn.executeNonquary(query);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "data updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed. Check PublisherCode and data.");
                }
            }

            // delete
            if (e.getSource() == P_delete) {
                String pc = txtPublisherCode.getText();

                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?",
                        "Confirm Delete", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String query = "DELETE FROM Publisher WHERE PublisherCode = '" + pc + "'";
                    boolean deleted = sqlconn.executeNonquary(query);

                    if (deleted) {
                        txtPublisherCode.setText("");
                        txtName.setText("");
                        txtCity.setText("");
                        txtPhone.setText("");
                        JOptionPane.showMessageDialog(this, "data deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Delete failed. Check if ISBN exists.");
                    }
                }
            }

            // search
            if (e.getSource() == P_search) {
                String pc = txtP_search.getText();

                String query = "";

                if (!pc.isEmpty()) {
                    query = "SELECT * FROM Publisher WHERE PublisherCode = '" + pc + "'";
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter data to search");
                    return;
                }

                try {
                    sqlconn.connectToSQL();
                    Statement stmt = sqlconn.conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        txtPublisherCode.setText(rs.getString("PublisherCode"));
                        txtName.setText(rs.getString("Name"));
                        txtCity.setText(rs.getString("City"));
                        txtPhone.setText(rs.getString("Phone"));
                    } else {
                        txtPublisherCode.setText("");
                        txtName.setText("");
                        txtCity.setText("");
                        txtPhone.setText("");
                        JOptionPane.showMessageDialog(this, "No matching data found");
                    }

                    sqlconn.Close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Search failed: " + ex.getMessage());
                }
            }

            // main menu
            if (e.getSource() == P_menu) {
                f2.setVisible(false);
                start.setVisible(true);
            }
        }

        ////////////////////////////////////////////////////////////////////////

        // Author frame
        {
            // insert
            if (e.getSource() == a_insert) {
                if (!txtAuthorID.getText().isEmpty() && !txtfName.getText().isEmpty()
                        && !txtsName.getText().isEmpty()) {
                    int aid = Integer.parseInt(txtAuthorID.getText());
                    String fn = txtfName.getText();
                    String sn = txtsName.getText();

                    String query = "INSERT INTO Author (AuthorID, FirstName, LastName) VALUES (" + aid + ", '" + fn
                            + "', '" + sn + "') ";

                    boolean inserted = sqlconn.executeNonquary(query);

                    if (inserted) {
                        JOptionPane.showMessageDialog(this, "data inserted successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Insert failed. Check data or connection.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter all data!");
                }

            }

            // update
            if (e.getSource() == a_update) {
                int aid = Integer.parseInt(txtAuthorID.getText());
                String fn = txtfName.getText();
                String sn = txtsName.getText();

                String query = "UPDATE Author SET "
                        + "AuthorID = " + aid + ", "
                        + "FirstName = '" + fn + "', "
                        + "LastName = '" + sn + "' "
                        + "WHERE AuthorID = " + aid;

                boolean updated = sqlconn.executeNonquary(query);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "data updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed. Check PublisherCode and data.");
                }
            }

            // delete
            if (e.getSource() == a_delete) {
                String aid = txtAuthorID.getText();

                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?",
                        "Confirm Delete", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    String query = "DELETE FROM Author WHERE AuthorID = '" + aid + "'";
                    boolean deleted = sqlconn.executeNonquary(query);

                    if (deleted) {
                        txtAuthorID.setText("");
                        txtfName.setText("");
                        txtsName.setText("");
                        JOptionPane.showMessageDialog(this, "data deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Delete failed. Check if ISBN exists.");
                    }
                }
            }

            // search
            if (e.getSource() == a_search) {
                String aid = txta_search.getText();

                String query = "";

                if (!aid.isEmpty()) {
                    query = "SELECT * FROM Author WHERE AuthorID = '" + aid + "'";
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter data to search");
                    return;
                }

                try {
                    sqlconn.connectToSQL();
                    Statement stmt = sqlconn.conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        txtAuthorID.setText(rs.getString("AuthorID"));
                        txtfName.setText(rs.getString("FirstName"));
                        txtsName.setText(rs.getString("LastName"));
                    } else {
                        txtAuthorID.setText("");
                        txtfName.setText("");
                        txtsName.setText("");
                        JOptionPane.showMessageDialog(this, "No matching data found");
                    }

                    sqlconn.Close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Search failed: " + ex.getMessage());
                }
            }

            // main menu
            if (e.getSource() == a_menu) {
                f3.setVisible(false);
                start.setVisible(true);
            }
        }

    }

}
