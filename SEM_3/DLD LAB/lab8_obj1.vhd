----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:36:35
-- Design Name: 
-- Module Name: lab8_obj1 - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Lab8_obj1 is
    Port ( a,b,c,d : in STD_LOGIC;
           f : out STD_LOGIC);
end Lab8_obj1;

architecture Behavioral of Lab8_obj1 is

begin
f<=((not c) and (not d)) 
or((not a) and (not b)) or 
((not a) and (not c)) or 
((not b) and (not c)) or 
((not b) and (not d)) or 
((not a) and (not d));

end Behavioral;
