public class Wizard {

    public class Wizard extends Character implements Attacker {
        private int mana;
        private int intelligence;


        @Override
        public void attack(Character character) {

//        damage can be either Fireball or Staff hit
            int damage;

//        The damage of a Fireball is equal to his intelligence and every Fireball will decrease their mana by 5 points.
            if (mana >= 5) {
                damage = intelligence;
                mana = mana - 5;
            }

//        The damage of a staff hit is equal to 2. Every staff hit will recover his mana by 1.
            else
            {
                damage = 2;
                mana = mana + 1;
            }

//        If a wizard does not have the mana to cast a Fireball he will do a Staff hit instead.
//        If a wizard does not have the mana to cast a Staff hit he will not inflict any damage and recover his mana by 2.
            if (mana <= 0) {
                mana = mana + 2;
            }

            character.setHp(character.getHp() - damage);
            System.out.println(getName() + " casts a spell on " + character.getName() + " for " + damage + " damage");
        }
    }

}
