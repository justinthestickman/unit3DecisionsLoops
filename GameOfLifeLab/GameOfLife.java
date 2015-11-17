import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 15;
    private final int COLS = 15;
    private final int CELLS = ROWS*COLS;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 7, Y1 = 6;
        final int X2 = 8, Y2 = 6;
        final int X3 = 6, Y3 = 7;
        final int X4 = 7, Y4 = 7;
        final int X5 = 9, Y5 = 7;
        final int X6 = 7, Y6 = 8;
        final int X7 = 8, Y7 = 8;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, rock7);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        ArrayList<Location> alive = new ArrayList<Location>(); //all cells that will be alive in the next generation
        ArrayList<Location> die = new ArrayList<Location>(); //cells that are alive in the current generation but will be dead in the next generation
        ArrayList<Actor> neighbors = new ArrayList<Actor>(); //the neighbors cells of each cell checked in the for loop, which resets each time the for loop checks a new cell
        
        // insert magic here...
        for (int r = 0; r < ROWS; r++)
        {
            for (int c = 0; c < COLS; c++)
            {
                Location loc = new Location(r,c);
                Actor cell = grid.get(loc);
                neighbors = grid.getNeighbors(loc);
                if (cell == null && neighbors.size() == 3)
                {
                    alive.add(loc);
                }
                else if (cell != null)
                {
                    if (neighbors.size() == 2 || neighbors.size() == 3)
                    {
                        alive.add(loc);
                    }
                    else
                    {
                        die.add(loc);
                    }
                }
            }
        }
        for (Location newloc : alive) //place all cells that will be alive in the next generation
        {
            Rock newrock = new Rock();
            grid.put(newloc,newrock);
        }
        for (Location newloc : die) //remove all cells that are alive in the current generation but will be dead in the next generation
        {
            grid.remove(newloc);
        }
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        for (int i = 0; i < 16; i++)
        {
           game.createNextGeneration();
           Thread.sleep(1000);
        }
    }
}
