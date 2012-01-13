package contactslist;

import net.rim.device.api.ui.UiApplication;

public class ContacsList extends UiApplication
{
    public static void main( String[] args )
    {
        ContacsList theApp = new ContacsList( );
        theApp.enterEventDispatcher( );
    }

    public ContacsList( )
    {
        this.pushScreen( new ContactsListMainScreen( ) );
    }
}
